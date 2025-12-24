package dev.manasnow.knavesneeds.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.Version;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.resources.ResourceLocation;

import static dev.manasnow.knavesneeds.Constants.MOD_ID;

@Version(version = 1)
public class KnavesBetterEndConfig extends Config {

    public KnavesBetterEndConfig() {
        super(new ResourceLocation(MOD_ID, "betterend_config"));
    }

    @Comment("Enables/disables - Knaves' Needs' Aeternium additions.")
    public boolean aeterniumEnabled = true;
    public int aeterniumDurability = 1000;
    public float aeterniumSpeed = 1.0f;
    public float aeterniumAttackDamage = 0.0f;
    public int aeterniumMiningLevel = 1;
    public int aeterniumEnchantability = 15;

    @Comment("\n Material - Terminite")
    public boolean terminiteEnabled = true;
    public int terminiteDurability = 1000;
    public float terminiteMiningSpeedMultiplier = 1.0f;
    public float terminiteAttackDamage = 0.0f;
    public int terminiteMiningLevel = 1;
    public int terminiteEnchantability = 15;

    @Comment("\n Material - Thallasium")
    public boolean thallasiumEnabled = true;
    public int thallasiumDurability = 1000;
    public float thallasiumMiningSpeedMultiplier = 1.0f;
    public float thallasiumAttackDamage = 0.0f;
    public int thallasiumMiningLevel = 1;
    public int thallasiumEnchantability = 15;

    @Override
    public void update(int deserializedVersion) {
        if (deserializedVersion < 1) {
            //nothing here yet :)
        }
    }
}
