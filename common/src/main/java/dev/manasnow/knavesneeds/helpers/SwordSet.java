package dev.manasnow.knavesneeds.helpers;

import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswords.SimplySwords;

import java.util.Locale;

public class SwordSet {
    public final RegistrySupplier<Item> LONGSWORD;
    public final RegistrySupplier<Item> TWINBLADE;
    public final RegistrySupplier<Item> RAPIER;
    public final RegistrySupplier<Item> KATANA;
    public final RegistrySupplier<Item> SAI;
    public final RegistrySupplier<Item> SPEAR;
    public final RegistrySupplier<Item> GLAIVE;
    public final RegistrySupplier<Item> WARGLAIVE;
    public final RegistrySupplier<Item> CUTLASS;
    public final RegistrySupplier<Item> CLAYMORE;
    public final RegistrySupplier<Item> GREATHAMMER;
    public final RegistrySupplier<Item> GREATAXE;
    public final RegistrySupplier<Item> CHAKRAM;
    public final RegistrySupplier<Item> SCYTHE;
    public final RegistrySupplier<Item> HALBERD;

    public SwordSet(Registrar<Item> registrar, String namespace, Tier tier, SwordFactory factory) {
        this.LONGSWORD = register(registrar, namespace, "longsword", tier, factory);
        this.TWINBLADE = register(registrar, namespace, "twinblade", tier, factory);
        this.RAPIER = register(registrar, namespace, "rapier", tier, factory);
        this.KATANA = register(registrar, namespace, "katana", tier, factory);
        this.SAI = register(registrar, namespace, "sai", tier, factory);
        this.SPEAR = register(registrar, namespace, "spear", tier, factory);
        this.GLAIVE = register(registrar, namespace, "glaive", tier, factory);
        this.WARGLAIVE = register(registrar, namespace, "warglaive", tier, factory);
        this.CUTLASS = register(registrar, namespace, "cutlass", tier, factory);
        this.CLAYMORE = register(registrar, namespace, "claymore", tier, factory);
        this.GREATHAMMER = register(registrar, namespace, "greathammer", tier, factory);
        this.GREATAXE = register(registrar, namespace, "greataxe", tier, factory);
        this.CHAKRAM = register(registrar, namespace, "chakram", tier, factory);
        this.SCYTHE = register(registrar, namespace, "scythe", tier, factory);
        this.HALBERD = register(registrar, namespace, "halberd", tier, factory);
    }

    private RegistrySupplier<Item> register(Registrar<Item> registrar, String namespace, String id, Tier tier, SwordFactory factory) {
        return registrar.register(namespace + "/" + tier.toString().toLowerCase(Locale.ROOT) + "/" + id, () ->
                factory.create(tier, getAttackDamageModifier(id), getAttackSpeedModifier(id), new Item.Properties()));
    }

    //Grabs attack speed modifier from SimplySwords config. Wrapped to be safer for early loading.
    private float getAttackSpeedModifier(String id) {
        var simplySwordsConfig = SimplySwords.weaponAttributesConfig;
        if (simplySwordsConfig == null) {
            return switch (id) {
                case "twinblade", "rapier", "katana", "sai", "chakram" -> -2.0f;
                case "spear", "glaive", "cutlass" -> -2.4f;
                case "warglaive" -> -2.2f;
                case "claymore", "greathammer", "greataxe", "scythe", "halberd" -> -3.0f;
                default -> -2.4f;
            };
        }
        return switch (id) {
            case "twinblade" -> simplySwordsConfig.twinblade_attackSpeed;
            case "rapier" -> simplySwordsConfig.rapier_attackSpeed;
            case "katana" -> simplySwordsConfig.katana_attackSpeed;
            case "sai" -> simplySwordsConfig.sai_attackSpeed;
            case "spear" -> simplySwordsConfig.spear_attackSpeed;
            case "glaive" -> simplySwordsConfig.glaive_attackSpeed;
            case "warglaive" -> simplySwordsConfig.warglaive_attackSpeed;
            case "cutlass" -> simplySwordsConfig.cutlass_attackSpeed;
            case "claymore" -> simplySwordsConfig.claymore_attackSpeed;
            case "greathammer" -> simplySwordsConfig.greathammer_attackSpeed;
            case "greataxe" -> simplySwordsConfig.greataxe_attackSpeed;
            case "chakram" -> simplySwordsConfig.chakram_attackSpeed;
            case "scythe" -> simplySwordsConfig.scythe_attackSpeed;
            case "halberd" -> simplySwordsConfig.halberd_attackSpeed;
            default -> simplySwordsConfig.longsword_attackSpeed;
        };

    }

    //Grabs attack damage modifier from SimplySwords config. Wrapped to be safer for early loading.
    public int getAttackDamageModifier(String id) {
        var simplySwordConfig = SimplySwords.weaponAttributesConfig;
        if (simplySwordConfig == null) {
            return switch (id) {
                case "twinblade", "sai", "chakram" -> 1;
                case "rapier", "katana", "spear" -> 2;
                case "glaive", "warglaive", "cutlass" -> 3;
                case "claymore", "greathammer", "greataxe", "scythe", "halberd" -> 4;
                default -> 3;
            };
        }
        return switch (id) {
            case "twinblade" -> (int) (simplySwordConfig.twinblade_positiveDamageModifier - simplySwordConfig.twinblade_negativeDamageModifier);
            case "rapier" -> (int) (simplySwordConfig.rapier_positiveDamageModifier - simplySwordConfig.rapier_negativeDamageModifier);
            case "katana" -> (int) (simplySwordConfig.katana_positiveDamageModifier - simplySwordConfig.katana_negativeDamageModifier);
            case "sai" -> (int) (simplySwordConfig.sai_positiveDamageModifier - simplySwordConfig.sai_negativeDamageModifier);
            case "spear" -> (int) (simplySwordConfig.spear_positiveDamageModifier - simplySwordConfig.spear_negativeDamageModifier);
            case "glaive" -> (int) (simplySwordConfig.glaive_positiveDamageModifier - simplySwordConfig.glaive_negativeDamageModifier);
            case "warglaive" -> (int) (simplySwordConfig.warglaive_positiveDamageModifier - simplySwordConfig.warglaive_negativeDamageModifier);
            case "cutlass" -> (int) (simplySwordConfig.cutlass_positiveDamageModifier - simplySwordConfig.cutlass_negativeDamageModifier);
            case "claymore" -> (int) (simplySwordConfig.claymore_positiveDamageModifier - simplySwordConfig.claymore_negativeDamageModifier);
            case "greathammer" -> (int) (simplySwordConfig.greathammer_positiveDamageModifier - simplySwordConfig.greathammer_negativeDamageModifier);
            case "greataxe" -> (int) (simplySwordConfig.greataxe_positiveDamageModifier - simplySwordConfig.greataxe_negativeDamageModifier);
            case "chakram" -> (int) (simplySwordConfig.chakram_positiveDamageModifier - simplySwordConfig.chakram_negativeDamageModifier);
            case "scythe" -> (int) (simplySwordConfig.scythe_positiveDamageModifier - simplySwordConfig.scythe_negativeDamageModifier);
            case "halberd" -> (int) (simplySwordConfig.halberd_positiveDamageModifier - simplySwordConfig.halberd_negativeDamageModifier);
            default -> (int) (simplySwordConfig.longsword_positiveDamageModifier - simplySwordConfig.longsword_negativeDamageModifier);
        };
    }

    @FunctionalInterface
    public interface SwordFactory {
        SwordItem create(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties);
    }
}