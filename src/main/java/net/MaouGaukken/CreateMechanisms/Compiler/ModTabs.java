package net.MaouGaukken.CreateMechanisms.Compiler;

import net.MaouGaukken.CreateMechanisms.AddonsMananger.SearchContent;
import net.MaouGaukken.CreateMechanisms.Compiler.Fluid.ModFluidItem;
import net.MaouGaukken.CreateMechanisms.Config;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * This class defines custom Creative Mode Tabs for the mod.
 */
public class ModTabs {
    // Registers a new DeferredRegister for Creative Mode Tabs under the mod's namespace
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateMechanisms.MOD_ID);

    /**
     * Mechanisms Tab: Contains various mechanical components used in the mod.
     * - Title: "item_group.createmechanisms.mechanisms" (translatable)
     * - Icon: Wooden Mechanism
     * - Items: Various mechanical parts (wooden, rubber, advanced, heat, zinc, computing, and more...)
     */
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MECHANISMS = REGISTRY.register("mechanisms",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.createmechanisms.mechanisms"))
                    .icon(() -> new ItemStack(ModItems.WOODEN_MECHANISM.get()))
                    .displayItems((parameters, tabData) -> {
                        SearchContent search = new SearchContent();
                        AddonsIds ids = new AddonsIds();
                        tabData.accept(ModItems.WOODEN_MECHANISM.get());
                        tabData.accept(ModItems.ADVANCED_PRECISION_MECHANISM.get());
                        tabData.accept(ModItems.ZINC_MECHANISM.get());
                        tabData.accept(ModItems.ENDERIAM_MECHANISM.get());
                        tabData.accept(ModItems.REDSTONE_MECHANISM.get());
                        tabData.accept(ModItems.BASIC_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.IRON_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.GOLDEN_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.DIAMOND_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.NETHERITE_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.ENDERIAM_ENERGY_MECHANISM.get());
                        tabData.accept(ModItems.LOGIC_MECHANISM.get());
                        tabData.accept(ModItems.STORAGE_MECHANISM.get());
                        tabData.accept(ModItems.COMPUTING_MECHANISM.get());
                        tabData.accept(ModItems.ADVANCED_STORAGE_MECHANISM.get());
                        tabData.accept(ModItems.ENDERIAM_STORAGE_MECHANISM.get());
                        tabData.accept(ModItems.RUBBER_MECHANISM.get());
                        tabData.accept(ModItems.FLUID_MECHANISM.get());
                        tabData.accept(ModItems.ADVANCED_FLUID_MECHANISM.get());
                        tabData.accept(ModItems.ENDERIAM_FLUID_MECHANISM.get());
                        tabData.accept(ModItems.LOW_HEAT_MECHANISM.get());
                        tabData.accept(ModItems.HEAT_MECHANISM.get());
                        tabData.accept(ModItems.ADVANCED_HEAT_MECHANISM.get());
                        tabData.accept(ModItems.ENDERIAM_HEAT_MECHANISM.get());
                        if(Config.REQUIRES_ADDONS.get()){
                            tabData.accept(ModItems.SOURCE_MECHANISM.get());
                            tabData.accept(ModItems.BLOOD_MECHANISM.get());
                            tabData.accept(ModItems.DARK_MECHANISM.get());
                            tabData.accept(ModItems.SOUL_MECHANISM.get());
                            tabData.accept(ModItems.PHYSICS_MECHANISM.get());
                            tabData.accept(ModItems.NUCLEAR_MECHANISM.get());
                            tabData.accept(ModItems.URANIUM_MECHANISM.get());
                            tabData.accept(ModItems.SCULK_MECHANISM.get());
                            tabData.accept(ModItems.EXPERIENCE_MECHANISM.get());
                            tabData.accept(ModItems.ADVANCED_EXPERIENCE_MECHANISM.get());
                            tabData.accept(ModItems.MENRIL_MECHANISM.get());
                            tabData.accept(ModItems.FERRICORE_MECHANISM.get());
                            tabData.accept(ModItems.BLAZEGOLD_MECHANISM.get());
                            tabData.accept(ModItems.CELESTIGEM_MECHANISM.get());
                            tabData.accept(ModItems.ECLIPSE_ALLOY_MECHANISM.get());
                            tabData.accept(ModItems.HARDENED_ENERGY_MECHANISM.get());
                            tabData.accept(ModItems.BLAZING_ENERGY_MECHANISM.get());
                            tabData.accept(ModItems.NIOTIC_ENERGY_MECHANISM.get());
                            tabData.accept(ModItems.SPIRITED_ENERGY_MECHANISM.get());
                            tabData.accept(ModItems.NITRO_ENERGY_MECHANISM.get());
                            tabData.accept(ModItems.LIGHT_MECHANISM.get());
                            tabData.accept(ModItems.EQUIVALENCE_MECHANISM.get());
                            tabData.accept(ModItems.VOID_MECHANISM.get());
                            tabData.accept(ModItems.OTHER_MECHANISM.get());
                            tabData.accept(ModItems.ATUNED_MECHANISM.get());
                        }
                    }).build());

    /**
     * Extra Items Tab: Contains additional materials and tools.
     * - Title: "item_group.createmechanisms.extra_items" (translatable)
     * - Icon: Cured Rubber
     * - Items: Various materials (rubber, bronze, enderiam bucket) and tools (copper, iron, and diamond saws)
     * - Appears after the Mechanisms tab
     */
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXTRA_ITEMS = REGISTRY.register("extra_items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.createmechanisms.extra_items"))
                    .icon(() -> new ItemStack(ModItems.CURED_RUBBER.get()))
                    .displayItems((parameters, tabData) -> {
                        tabData.accept(ModItems.CURED_RUBBER.get());
                        tabData.accept(ModItems.RUBBER.get());
                        tabData.accept(ModItems.CURED_ENDERIAM_RUBBER.get());
                        tabData.accept(ModItems.ENDERIAM_RUBBER.get());
                        tabData.accept(ModItems.BRONZE.get());
                        tabData.accept(ModFluidItem.ENDERIAM_BUCKET.get());
                        tabData.accept(ModItems.COPPER_SAW.get());
                        tabData.accept(ModItems.IRON_SAW.get());
                        tabData.accept(ModItems.DIAMOND_SAW.get());
                        tabData.accept(ModItems.NETHERITE_SAW.get());
                        tabData.accept(ModItems.ENERGY_CELL.get());
                        tabData.accept(ModItems.ENDERIAM_CELL.get());
                    })
                    .withTabsBefore(MECHANISMS.getId()) // Ensures this tab appears after the Mechanisms tab
                    .build());
}
