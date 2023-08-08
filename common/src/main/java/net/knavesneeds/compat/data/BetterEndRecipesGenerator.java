package net.knavesneeds.compat.data;

import net.knavesneeds.compat.ToolMaterialCompat;
import net.knavesneeds.compat.registries.BetterEndAdditionsRegister;
import net.minecraft.util.Identifier;
import org.betterx.bclib.recipes.BCLRecipeBuilder;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;

import static net.knavesneeds.KnavesCommon.MOD_ID;


public class BetterEndRecipesGenerator {
    public static void register() {

        int anvilLevel = ToolMaterialCompat.AETERNIUM.getMiningLevel();

        /**

        //AETERNIUM TOOLS
        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_chakram_head"), BetterEndAdditionsRegister.AETERNIUM_CHAKRAM_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_claymore_head"), BetterEndAdditionsRegister.AETERNIUM_CLAYMORE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_cutlass_head"), BetterEndAdditionsRegister.AETERNIUM_CUTLASS_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_glaive_head"), BetterEndAdditionsRegister.AETERNIUM_GLAIVE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_greataxe_head"), BetterEndAdditionsRegister.AETERNIUM_GREATAXE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_greathammer_head"), BetterEndAdditionsRegister.AETERNIUM_GREATHAMMER_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_katana_head"), BetterEndAdditionsRegister.AETERNIUM_KATANA_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_longsword_head"), BetterEndAdditionsRegister.AETERNIUM_LONGSWORD_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_rapier_head"), BetterEndAdditionsRegister.AETERNIUM_RAPIER_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_sai_head"), BetterEndAdditionsRegister.AETERNIUM_SAI_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_scythe_head"), BetterEndAdditionsRegister.AETERNIUM_SCYTHE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_spear_head"), BetterEndAdditionsRegister.AETERNIUM_SPEAR_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_twinblade_head"), BetterEndAdditionsRegister.AETERNIUM_TWINBLADE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_warglaive_head"), BetterEndAdditionsRegister.AETERNIUM_WARGLAIVE_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "aeternium_halberd_head"), BetterEndAdditionsRegister.AETERNIUM_HALBERD_HEAD.get())
                .setInput(EndItems.AETERNIUM_INGOT)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        //Terminite
        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_chakram_head"), BetterEndAdditionsRegister.TERMINITE_CHAKRAM_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_claymore_head"), BetterEndAdditionsRegister.TERMINITE_CLAYMORE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_cutlass_head"), BetterEndAdditionsRegister.TERMINITE_CUTLASS_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_glaive_head"), BetterEndAdditionsRegister.TERMINITE_GLAIVE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_greataxe_head"), BetterEndAdditionsRegister.TERMINITE_GREATAXE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_greathammer_head"), BetterEndAdditionsRegister.TERMINITE_GREATHAMMER_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_katana_head"), BetterEndAdditionsRegister.TERMINITE_KATANA_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_longsword_head"), BetterEndAdditionsRegister.TERMINITE_LONGSWORD_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_rapier_head"), BetterEndAdditionsRegister.TERMINITE_RAPIER_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_sai_head"), BetterEndAdditionsRegister.TERMINITE_SAI_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_scythe_head"), BetterEndAdditionsRegister.TERMINITE_SCYTHE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_spear_head"), BetterEndAdditionsRegister.TERMINITE_SPEAR_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_twinblade_head"), BetterEndAdditionsRegister.TERMINITE_TWINBLADE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_warglaive_head"), BetterEndAdditionsRegister.TERMINITE_WARGLAIVE_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "terminite_halberd_head"), BetterEndAdditionsRegister.TERMINITE_HALBERD_HEAD.get())
                .setInput(EndBlocks.TERMINITE.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        //Thallasium
        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_chakram_head"), BetterEndAdditionsRegister.THALLASIUM_CHAKRAM_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_claymore_head"), BetterEndAdditionsRegister.THALLASIUM_CLAYMORE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_cutlass_head"), BetterEndAdditionsRegister.THALLASIUM_CUTLASS_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_glaive_head"), BetterEndAdditionsRegister.THALLASIUM_GLAIVE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_greataxe_head"), BetterEndAdditionsRegister.THALLASIUM_GREATAXE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_greathammer_head"), BetterEndAdditionsRegister.THALLASIUM_GREATHAMMER_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_katana_head"), BetterEndAdditionsRegister.THALLASIUM_KATANA_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_longsword_head"), BetterEndAdditionsRegister.THALLASIUM_LONGSWORD_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_rapier_head"), BetterEndAdditionsRegister.THALLASIUM_RAPIER_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_sai_head"), BetterEndAdditionsRegister.THALLASIUM_SAI_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_scythe_head"), BetterEndAdditionsRegister.THALLASIUM_SCYTHE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_spear_head"), BetterEndAdditionsRegister.THALLASIUM_SPEAR_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_twinblade_head"), BetterEndAdditionsRegister.THALLASIUM_TWINBLADE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_warglaive_head"), BetterEndAdditionsRegister.THALLASIUM_WARGLAIVE_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();

        BCLRecipeBuilder.anvil(new Identifier(MOD_ID, "thallasium_halberd_head"), BetterEndAdditionsRegister.THALLASIUM_HALBERD_HEAD.get())
                .setInput(EndBlocks.THALLASIUM.ingot)
                .setInputCount(2)
                .setAnvilLevel(anvilLevel)
                .setToolLevel(anvilLevel)
                .setDamage(6)
                .build();
         **/
    }
}
