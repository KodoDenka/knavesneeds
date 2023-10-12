package net.knavesneeds.config;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "general")
public class GeneralConfigs implements ConfigData {


    @ConfigEntry.Gui.PrefixText
    public float longsword_positiveDamageModifier = 0.0f;
    public float twinblade_positiveDamageModifier = 0.0f;
    public float rapier_positiveDamageModifier = 0.0f;
    public float katana_positiveDamageModifier = 0.0f;
    public float sai_positiveDamageModifier = 0.0f;
    public float spear_positiveDamageModifier = 0.0f;
    public float glaive_positiveDamageModifier = 0.0f;
    public float warglaive_positiveDamageModifier = 0.0f;
    public float cutlass_positiveDamageModifier = 0.0f;
    public float claymore_positiveDamageModifier = 2.0f;
    public float greataxe_positiveDamageModifier = 3.0f;
    public float greathammer_positiveDamageModifier = 4.0f;
    public float chakram_positiveDamageModifier = 0.0f;
    public float scythe_positiveDamageModifier = 1.0f;
    public float halberd_positiveDamageModifier = 3.0f;

    @ConfigEntry.Gui.PrefixText
    public float longsword_negativeDamageModifier = 0.0f;
    public float twinblade_negativeDamageModifier = 0.0f;
    public float rapier_negativeDamageModifier = 1.0f;
    public float katana_negativeDamageModifier = 0.0f;
    public float sai_negativeDamageModifier = 3.0f;
    public float spear_negativeDamageModifier = 0.0f;
    public float glaive_negativeDamageModifier = 0.0f;
    public float warglaive_negativeDamageModifier = 0.0f;
    public float cutlass_negativeDamageModifier = 0.0f;
    public float claymore_negativeDamageModifier = 0.0f;
    public float greataxe_negativeDamageModifier = 0.0f;
    public float greathammer_negativeDamageModifier = 0.0f;
    public float chakram_negativeDamageModifier = 1.0f;
    public float scythe_negativeDamageModifier = 0.0f;
    public float halberd_negativeDamageModifier = 0.0f;

    @ConfigEntry.Gui.PrefixText
    public float longsword_attackSpeed = -2.4f;
    public float twinblade_attackSpeed = -2.0f;
    public float rapier_attackSpeed = -1.8f;
    public float katana_attackSpeed = -2.0f;
    public float sai_attackSpeed = -1.5f;
    public float spear_attackSpeed = -2.7f;
    public float glaive_attackSpeed = -2.6f;
    public float warglaive_attackSpeed = -2.2f;
    public float cutlass_attackSpeed = -2.0f;
    public float claymore_attackSpeed = -2.8f;
    public float greataxe_attackSpeed = -3.1f;
    public float greathammer_attackSpeed = -3.2f;
    public float chakram_attackSpeed = -3.0f;
    public float scythe_attackSpeed = -2.7f;
    public float halberd_attackSpeed = -2.8f;


}
