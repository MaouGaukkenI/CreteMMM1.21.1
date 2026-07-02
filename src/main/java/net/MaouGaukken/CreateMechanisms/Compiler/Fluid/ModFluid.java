package net.MaouGaukken.CreateMechanisms.Compiler.Fluid;

import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.Fluids.EnderiamFluid;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluid {
    public  static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, CreateMechanisms.MOD_ID);

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_ENDERIAM = FLUIDS.register("enderiam_fluid",
            () -> new BaseFlowingFluid.Source(ModFluid.ENDERIAM_FLUID_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ENDERIAM = FLUIDS.register("flowing_enderiam_fluid",
            () -> new BaseFlowingFluid.Flowing(ModFluid.ENDERIAM_FLUID_PROPERTIES));

    public static final BaseFlowingFluid.Properties ENDERIAM_FLUID_PROPERTIES = new BaseFlowingFluid.Properties(
            EnderiamFluid.ENDERIAM_FLUID_TYPE, SOURCE_ENDERIAM, FLOWING_ENDERIAM)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModFluidsBlock.ENDERIAM_BLOCK)
            .bucket(ModFluidItem.ENDERIAM_BUCKET);

    public static void register (IEventBus eventBus){
        FLUIDS.register(eventBus);
    }
}
