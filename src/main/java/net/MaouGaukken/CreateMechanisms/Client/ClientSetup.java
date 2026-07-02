package net.MaouGaukken.CreateMechanisms.Client;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import org.joml.Vector3f;

public class ClientSetup {



    /*
    Example
    public static void init(final FMLClientSetupEvent event) {
        IClientFluidTypeExtensions.of(MyFluids.SOAP_FLUID.get(), new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return new ResourceLocation.fromNamespaceAndPath(CreateMechanisms.MOD_ID, "block/soap_still");
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return new ResourceLocation(CreateMechanisms.MOD_ID, "block/soap_flow");
            }

            @Override
            public ResourceLocation getOverlayTexture() {
                return new ResourceLocation(CreateMechanisms.MOD_ID, "misc/in_soap_water");
            }

            @Override
            public int getTintColor() {
                return 0xFFFFFF;
            }

            @Override
            public Vector3f modifyFogColor(Vector3f originalColor, Camera camera, float partialTick) {
                return new Vector3f(0.8f, 0.9f, 1.0f);
            }

            @Override
            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode,
                                        float renderDistance, float partialTick,
                                        float nearDistance, float farDistance,
                                        FogShape fogShape) {
                RenderSystem.setShaderFogStart(1.0f);
                RenderSystem.setShaderFogEnd(6.0f);
                RenderSystem.setShaderFogShape(fogShape);
            }
        });
    }*/
}