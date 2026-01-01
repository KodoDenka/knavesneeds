package dev.manasnow.knavesneeds.datagen;

import java.util.Optional;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

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
        LONGSWORD   = createItem("longsword", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        TWINBLADE   = createItem("twinblade", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        RAPIER      = createItem("rapier", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        KATANA      = createItem("katana", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        SAI         = createItem("sai", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        SPEAR       = createItem("spear", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        GLAIVE      = createItem("glaive", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        WARGLAIVE   = createItem("warglaive", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        CUTLASS     = createItem("cutlass", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        CLAYMORE    = createItem("claymore", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        GREATHAMMER = createItem("greathammer", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        GREATAXE    = createItem("greataxe", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        CHAKRAM     = createItem("chakram", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        SCYTHE      = createItem("scythe", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
        HALBERD     = createItem("halberd", TextureSlot.PARTICLE, TextureSlot.NORTH, TextureSlot.SOUTH, TextureSlot.EAST, TextureSlot.WEST, TextureSlot.UP, TextureSlot.DOWN);
    }
}
