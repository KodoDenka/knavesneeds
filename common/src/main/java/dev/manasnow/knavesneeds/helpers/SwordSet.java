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

    //This doesn't get the attack damage and speed mod yet...
    private RegistrySupplier<Item> register(Registrar<Item> registrar, String namespace, String id, Tier tier, SwordFactory factory) {
        return registrar.register(namespace + "/" + tier.toString().toLowerCase(Locale.ROOT) + "/" + id, () ->
                factory.create(tier, getAttackDamageModifier(id), getAttackSpeedModifier(id), new Item.Properties()));
    }

    //Grabs attack speed modifier from SimplySwords config. **MIGHT NOT BE SAFE**
    private float getAttackSpeedModifier(String id) {
        return switch (id) {
            case "longsword" -> SimplySwords.weaponAttributesConfig.longsword_attackSpeed;
            case "twinblade" -> SimplySwords.weaponAttributesConfig.twinblade_attackSpeed;
            case "rapier" -> SimplySwords.weaponAttributesConfig.rapier_attackSpeed;
            case "katana" -> SimplySwords.weaponAttributesConfig.katana_attackSpeed;
            case "sai" -> SimplySwords.weaponAttributesConfig.sai_attackSpeed;
            case "spear" -> SimplySwords.weaponAttributesConfig.spear_attackSpeed;
            case "glaive" -> SimplySwords.weaponAttributesConfig.glaive_attackSpeed;
            case "warglaive" -> SimplySwords.weaponAttributesConfig.warglaive_attackSpeed;
            case "cutlass" -> SimplySwords.weaponAttributesConfig.cutlass_attackSpeed;
            case "claymore" -> SimplySwords.weaponAttributesConfig.claymore_attackSpeed;
            case "greathammer" -> SimplySwords.weaponAttributesConfig.greathammer_attackSpeed;
            case "greataxe" -> SimplySwords.weaponAttributesConfig.greataxe_attackSpeed;
            case "chakram" -> SimplySwords.weaponAttributesConfig.chakram_attackSpeed;
            case "scythe" -> SimplySwords.weaponAttributesConfig.scythe_attackSpeed;
            case "halberd" -> SimplySwords.weaponAttributesConfig.halberd_attackSpeed;
            default -> SimplySwords.weaponAttributesConfig.longsword_attackSpeed;
        };
    }

    //Grabs attack damage modifier from SimplySwords config. **STILL MIGHT NOT BE SAFE**
    public int getAttackDamageModifier(String id) {
        return switch (id) {
            case "longsword" -> (int) (SimplySwords.weaponAttributesConfig.longsword_positiveDamageModifier - SimplySwords.weaponAttributesConfig.longsword_negativeDamageModifier);
            case "twinblade" -> (int) (SimplySwords.weaponAttributesConfig.twinblade_positiveDamageModifier - SimplySwords.weaponAttributesConfig.twinblade_negativeDamageModifier);
            case "rapier" -> (int) (SimplySwords.weaponAttributesConfig.rapier_positiveDamageModifier - SimplySwords.weaponAttributesConfig.rapier_negativeDamageModifier);
            case "katana" -> (int) (SimplySwords.weaponAttributesConfig.katana_positiveDamageModifier - SimplySwords.weaponAttributesConfig.katana_negativeDamageModifier);
            case "sai" -> (int) (SimplySwords.weaponAttributesConfig.sai_positiveDamageModifier - SimplySwords.weaponAttributesConfig.sai_negativeDamageModifier);
            case "spear" -> (int) (SimplySwords.weaponAttributesConfig.spear_positiveDamageModifier - SimplySwords.weaponAttributesConfig.spear_negativeDamageModifier);
            case "glaive" -> (int) (SimplySwords.weaponAttributesConfig.glaive_positiveDamageModifier - SimplySwords.weaponAttributesConfig.glaive_negativeDamageModifier);
            case "warglaive" -> (int) (SimplySwords.weaponAttributesConfig.warglaive_positiveDamageModifier - SimplySwords.weaponAttributesConfig.warglaive_negativeDamageModifier);
            case "cutlass" -> (int) (SimplySwords.weaponAttributesConfig.cutlass_positiveDamageModifier - SimplySwords.weaponAttributesConfig.cutlass_negativeDamageModifier);
            case "claymore" -> (int) (SimplySwords.weaponAttributesConfig.claymore_positiveDamageModifier - SimplySwords.weaponAttributesConfig.claymore_negativeDamageModifier);
            case "greathammer" -> (int) (SimplySwords.weaponAttributesConfig.greathammer_positiveDamageModifier - SimplySwords.weaponAttributesConfig.greathammer_negativeDamageModifier);
            case "greataxe" -> (int) (SimplySwords.weaponAttributesConfig.greataxe_positiveDamageModifier - SimplySwords.weaponAttributesConfig.greataxe_negativeDamageModifier);
            case "chakram" -> (int) (SimplySwords.weaponAttributesConfig.chakram_positiveDamageModifier - SimplySwords.weaponAttributesConfig.chakram_negativeDamageModifier);
            case "scythe" -> (int) (SimplySwords.weaponAttributesConfig.scythe_positiveDamageModifier - SimplySwords.weaponAttributesConfig.scythe_negativeDamageModifier);
            case "halberd" -> (int) (SimplySwords.weaponAttributesConfig.halberd_positiveDamageModifier - SimplySwords.weaponAttributesConfig.halberd_negativeDamageModifier);
            default -> (int) (SimplySwords.weaponAttributesConfig.longsword_positiveDamageModifier - SimplySwords.weaponAttributesConfig.longsword_negativeDamageModifier);
        };
    }

    @FunctionalInterface
    public interface SwordFactory {
        SwordItem create(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties);
    }
}