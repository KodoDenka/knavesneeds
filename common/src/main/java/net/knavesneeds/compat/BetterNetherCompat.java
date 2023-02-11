package net.knavesneeds.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.knavesneeds.customitems.KnavesSwordItem;
import net.knavesneeds.registry.KnavesTeirRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.knavesneeds.KnavesCommon.MOD_ID;
import static net.knavesneeds.registry.KnavesItemsRegistry.*;

public class BetterNetherCompat {

    public static final DeferredRegister<Item> BETTER_NETHER_ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //cincinnasite
    public static final RegistrySupplier<Item> CINCINNASITE_LONGSWORD = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_TWINBLADE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_RAPIER = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_KATANA = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_SAI = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_SPEAR = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_GLAIVE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_WARGLAIVE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_CUTLASS = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_CLAYMORE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_GREATHAMMER = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_GREATAXE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_CHAKRAM = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_SCYTHE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite/cincinnasite_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE, CINCINNASITE_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //cincinnasite_diamond
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_LONGSWORD = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_TWINBLADE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_RAPIER = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_KATANA = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SAI = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SPEAR = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GLAIVE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_WARGLAIVE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CUTLASS = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CLAYMORE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GREATHAMMER = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_GREATAXE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_CHAKRAM = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> CINCINNASITE_DIAMOND_SCYTHE = BETTER_NETHER_ITEMS.register("betternether/cincinnasite_diamond/cincinnasite_diamond_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.CINCINNASITE_DIAMOND, CINCINNASITE_DIAMOND_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

    //nether_ruby
    public static final RegistrySupplier<Item> NETHER_RUBY_LONGSWORD = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_longsword", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + LONGSWORD_DAMAGE_MOD, LONGSWORD_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_TWINBLADE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_twinblade", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + TWINBLADE_DAMAGE_MOD, TWINBLADE_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_RAPIER = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_rapier", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + RAPIER_DAMAGE_MOD, RAPIER_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_KATANA = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_katana", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + KATANA_DAMAGE_MOD, KATANA_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_SAI = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_sai", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + SAI_DAMAGE_MOD, SAI_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_SPEAR = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_spear", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + SPEAR_DAMAGE_MOD, SPEAR_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_GLAIVE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_glaive", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + GLAIVE_DAMAGE_MOD, GLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_WARGLAIVE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_warglaive", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + WARGLAIVE_DAMAGE_MOD, WARGLAIVE_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_CUTLASS = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_cutlass", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + CUTLASS_DAMAGE_MOD, CUTLASS_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_CLAYMORE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_claymore", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + CLAYMORE_DAMAGE_MOD, CLAYMORE_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_GREATHAMMER = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_greathammer", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + GREATHAMMER_DAMAGE_MOD, GREATHAMMER_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_GREATAXE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_greataxe", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + GREATAXE_DAMAGE_MOD, GREATAXE_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_CHAKRAM = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_chakram", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + CHAKRAM_DAMAGE_MOD, CHAKRAM_ATTACKSPEED));
    public static final RegistrySupplier<Item> NETHER_RUBY_SCYTHE = BETTER_NETHER_ITEMS.register("betternether/nether_ruby/nether_ruby_scythe", () -> new KnavesSwordItem(KnavesTeirRegistry.NETHER_RUBY, NETHER_RUBY_MOD + SCYTHE_DAMAGE_MOD, SCYTHE_ATTACKSPEED));

}
