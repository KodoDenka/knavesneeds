package dev.manasnow.knavesneeds.mixin;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.Util;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.util.GsonHelper;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.ToIntFunction;

@Mixin(DataProvider.class)
public abstract class DataProviderMixin {

    private static final ToIntFunction<String> $FIXED_ORDER_FIELDS = (ToIntFunction)Util.make(new Object2IntOpenHashMap(), (hashMap) -> {
        hashMap.put("platform", 0);
        hashMap.put("type", 1);
        hashMap.put("parent", 2);
        hashMap.defaultReturnValue(3);
    });
    private static final Comparator<String> $KEY_COMPARATOR = Comparator.comparingInt($FIXED_ORDER_FIELDS).thenComparing((string) -> string);
    private static final Logger $LOGGER = LogUtils.getLogger();


    @Inject(method = "saveStable", at = @At("HEAD"), cancellable = true)
    private static void knavesneeds$saveStable(CachedOutput output, JsonElement json, Path path, CallbackInfoReturnable<CompletableFuture<?>> cir) {
        cir.setReturnValue(CompletableFuture.runAsync(() -> {
            try {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                HashingOutputStream hashingoutputstream = new HashingOutputStream(Hashing.sha1(), bytearrayoutputstream);

                try (JsonWriter jsonwriter = new JsonWriter(new OutputStreamWriter(hashingoutputstream, StandardCharsets.UTF_8))) {
                    jsonwriter.setSerializeNulls(false);
                    jsonwriter.setIndent("  ");
                    GsonHelper.writeValue(jsonwriter, json, $KEY_COMPARATOR);
                }

                output.writeIfNeeded(path, bytearrayoutputstream.toByteArray(), hashingoutputstream.hash());
            } catch (IOException ioexception) {
                $LOGGER.error("Failed to save file to {}", path, ioexception);
            }

        }, Util.backgroundExecutor()));
    }
}