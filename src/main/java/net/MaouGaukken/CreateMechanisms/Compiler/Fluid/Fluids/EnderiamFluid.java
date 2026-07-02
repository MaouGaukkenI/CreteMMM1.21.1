package net.MaouGaukken.CreateMechanisms.Compiler.Fluid.Fluids;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.BaseFluidType;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundAction;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class EnderiamFluid {
    public static final ResourceLocation ENDERIAM_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateMechanisms.MOD_ID, "block/enderiam_still");
    public static final ResourceLocation ENDERIAM_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateMechanisms.MOD_ID, "block/enderiam_flow");
    public static final ResourceLocation ENDERIAM_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(CreateMechanisms.MOD_ID, "misc/in_enderiam");
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateMechanisms.MOD_ID);


    //Soap Water (EXample
    public static final DeferredHolder<FluidType, FluidType> ENDERIAM_FLUID_TYPE = register("enderiam_fluid",
            FluidType.Properties.create()
                    .lightLevel(10)
                    .density(15)
                    .viscosity(5)
                    .sound(SoundAction.get("ambient"), SoundEvents.PORTAL_AMBIENT)
    );


    //Soap water (Example)
    private static DeferredHolder<FluidType, FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(
                ENDERIAM_STILL_RL,
                ENDERIAM_FLOWING_RL,
                ENDERIAM_OVERLAY_RL,
                0xFF0B6620,
                new Vector3f(0.0078f, 0.090f, 0.074f),
                properties
        ) {
            @Override
            public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                consumer.accept(new IClientFluidTypeExtensions() {
                    @Override
                    public ResourceLocation getStillTexture() {
                        return ResourceLocation.fromNamespaceAndPath("createmechanisms", "block/enderiam_still");
                    }

                    @Override
                    public ResourceLocation getFlowingTexture() {
                        return ResourceLocation.fromNamespaceAndPath("createmechanisms", "block/enderiam_flow");
                    }

                    @Override
                    public ResourceLocation getOverlayTexture() {
                        return ResourceLocation.fromNamespaceAndPath("createmechanisms", "misc/in_enderiam");
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFF0B6620;
                    }

                    // Cor da névoa quando dentro do fluido
                    @Override
                    public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
                                                   int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                        return new Vector3f(0.0078f, 0.090f, 0.074f);
                    }
                    // Distância e forma da névoa
                    @Override
                    public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance,
                                                float partialTick, float nearDistance, float farDistance, FogShape shape) {
                        RenderSystem.setShaderFogStart(0.0F);
                        RenderSystem.setShaderFogEnd(6.0F); // controla quão densa fica a névoa
                        RenderSystem.setShaderFogShape(FogShape.SPHERE);
                    }

                });
            }
        });
    }

    public static void register(IEventBus eventBus){
        FLUID_TYPES.register(eventBus);
    }


}
