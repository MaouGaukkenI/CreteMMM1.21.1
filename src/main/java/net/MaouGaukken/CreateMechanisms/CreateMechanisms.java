package net.MaouGaukken.CreateMechanisms;

import net.MaouGaukken.CreateMechanisms.Compiler.AddonsCompiler.ComputingMechanismItem;
import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.Fluids.EnderiamFluid;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.bus.api.SubscribeEvent;

import net.MaouGaukken.CreateMechanisms.AddonsMananger.EnableAddonRequirement;
import net.MaouGaukken.CreateMechanisms.AddonsMananger.SearchContent;
import net.MaouGaukken.CreateMechanisms.Compiler.*;
import net.MaouGaukken.CreateMechanisms.Compiler.AddonsCompiler.SourceMechanismItem;
import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.ModFluid;
import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.ModFluidItem;

import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.ModFluidsBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;

// O valor aqui deve corresponder ao que está no META-INF/neoforge.mods.toml
@Mod(CreateMechanisms.MOD_ID)
public class CreateMechanisms {
    EnableAddonRequirement addonRequirement = new EnableAddonRequirement();
    public static final String MOD_ID = "createmechanisms";
    SearchContent search = new SearchContent();
    AddonsIds ids = new AddonsIds();

    public CreateMechanisms(IEventBus modEventBus, ModContainer modContainer) {
        // Registrar o arquivo de configuração do mod
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        //Registers the mod's custom items and blocks
        ModItems.REGISTRY.register(modEventBus);

        //New mod Fluids
        EnderiamFluid.register(modEventBus);
        ModFluid.register(modEventBus);
        ModFluidsBlock.register(modEventBus);
        ModFluidItem.register(modEventBus);

        if(!addonRequirement.readAddonRequirement()){
            ComputingMechanismItem.REGISTRY.register(modEventBus);
            SourceMechanismItem.REGISTRY.register(modEventBus);
        } else {
            if (ids._2()){
                ComputingMechanismItem.REGISTRY.register(modEventBus);
            }
            if(ids._3()){
                SourceMechanismItem.REGISTRY.register(modEventBus);
            }
        }

        ModTabs.REGISTRY.register(modEventBus);
    }

    @EventBusSubscriber(modid = CreateMechanisms.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluid.SOURCE_ENDERIAM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_ENDERIAM.get(), RenderType.translucent());
        }
    }

}

