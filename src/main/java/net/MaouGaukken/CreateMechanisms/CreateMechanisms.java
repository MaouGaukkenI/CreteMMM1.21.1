package net.MaouGaukken.CreateMechanisms;

import net.MaouGaukken.CreateMechanisms.Compiler.*;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;

// O valor aqui deve corresponder ao que está no META-INF/neoforge.mods.toml
@Mod(CreateMechanisms.MOD_ID)
public class CreateMechanisms {
    public static final String MOD_ID = "createmechanisms";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateMechanisms(IEventBus modEventBus, ModContainer modContainer) {
        // Registrar o arquivo de configuração do mod
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        //Registers the mod's custom items and blocks
        ModItems.REGISTRY.register(modEventBus);
        ModBlocks.REGISTRY.register(modEventBus);

        //Records the fluids and fluid types of the mod
        ModFluids.REGISTRY.register(modEventBus);
        ModFluidTypes.REGISTRY.register(modEventBus);

        //Registers the custom creative tabs
        ModTabs.REGISTRY.register(modEventBus);
    }
}
