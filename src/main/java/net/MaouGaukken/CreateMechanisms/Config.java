package net.MaouGaukken.CreateMechanisms;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue REQUIRES_ADDONS = BUILDER
            .comment("Habilitar dependência do addon na geração de mecanismos")
            .define("enableAddonRequirement",true);


    static final ModConfigSpec SPEC = BUILDER.build();
}
