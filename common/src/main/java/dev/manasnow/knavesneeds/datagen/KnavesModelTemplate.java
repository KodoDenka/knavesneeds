package dev.manasnow.knavesneeds.datagen;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class KnavesModelTemplate {
    public static final ModelTemplate LONGSWORD;
    public static final ModelTemplate TWINBLADE;
    public static final ModelTemplate RAPIER;
    public static final ModelTemplate KATANA;
    public static final ModelTemplate SAI;
    public static final ModelTemplate SPEAR;
    public static final ModelTemplate GLAIVE;
    public static final ModelTemplate WARGLAIVE;
    public static final ModelTemplate CUTLASS;
    public static final ModelTemplate CLAYMORE;
    public static final ModelTemplate GREATHAMMER;
    public static final ModelTemplate GREATAXE;
    public static final ModelTemplate CHAKRAM;
    public static final ModelTemplate SCYTHE;
    public static final ModelTemplate HALBERD;

    private static ModelTemplate createItem(String itemModelLocation, TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.of(new ResourceLocation("knavesneeds", "item/" + itemModelLocation)), Optional.empty(), requiredSlots);
    }

    static {
        LONGSWORD   = createItem("templates/longsword", TextureSlot.LAYER0);
        TWINBLADE   = createItem("templates/twinblade", TextureSlot.LAYER0);
        RAPIER      = createItem("templates/rapier", TextureSlot.LAYER0);
        KATANA      = createItem("templates/katana", TextureSlot.LAYER0);
        SAI         = createItem("templates/sai", TextureSlot.LAYER0);
        SPEAR       = createItem("templates/spear", TextureSlot.LAYER0);
        GLAIVE      = createItem("templates/glaive", TextureSlot.LAYER0);
        WARGLAIVE   = createItem("templates/warglaive", TextureSlot.LAYER0);
        CUTLASS     = createItem("templates/cutlass", TextureSlot.LAYER0);
        CLAYMORE    = createItem("templates/claymore", TextureSlot.LAYER0);
        GREATHAMMER = createItem("templates/greathammer", TextureSlot.LAYER0);
        GREATAXE    = createItem("templates/greataxe", TextureSlot.LAYER0);
        CHAKRAM     = createItem("templates/chakram", TextureSlot.LAYER0);
        SCYTHE      = createItem("templates/scythe", TextureSlot.LAYER0);
        HALBERD     = createItem("templates/halberd", TextureSlot.LAYER0);
    }
}
