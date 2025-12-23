package dev.manasnow.knavesneeds.helpers;

import me.fzzyhmstrs.fzzy_config.util.platform.Registrar;
import me.fzzyhmstrs.fzzy_config.util.platform.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

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
                factory.create(tier, 0, 1.0f, new Item.Properties()));
    }

    @FunctionalInterface
    public interface SwordFactory {
        SwordItem create(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties);
    }
}