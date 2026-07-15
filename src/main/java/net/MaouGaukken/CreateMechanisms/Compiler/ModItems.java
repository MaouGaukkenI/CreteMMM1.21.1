package net.MaouGaukken.CreateMechanisms.Compiler;

import net.MaouGaukken.CreateMechanisms.Item.BaseIncompleteMechanismItem;
import net.MaouGaukken.CreateMechanisms.Item.BaseMechanismItem;
import net.MaouGaukken.CreateMechanisms.Item.Parts.*;
import net.MaouGaukken.CreateMechanisms.Item.Tols.*;
import net.MaouGaukken.CreateMechanisms.Item.Resources.*;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateMechanisms.MOD_ID);


    // Registering different types of mechanism items with unique identifiers
    public static final DeferredItem<Item> WOODEN_MECHANISM = REGISTRY.register("wooden_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> RUBBER_MECHANISM = REGISTRY.register("rubber_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ADVANCED_PRECISION_MECHANISM = REGISTRY.register("advanced_precision_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> HEAT_MECHANISM = REGISTRY.register("heat_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ZINC_MECHANISM = REGISTRY.register("zinc_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_MECHANISM = REGISTRY.register("enderiam_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> REDSTONE_MECHANISM = REGISTRY.register("redstone_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> BASIC_ENERGY_MECHANISM = REGISTRY.register("basic_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> IRON_ENERGY_MECHANISM = REGISTRY.register("iron_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> GOLDEN_ENERGY_MECHANISM = REGISTRY.register("golden_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> DIAMOND_ENERGY_MECHANISM = REGISTRY.register("diamond_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_ENERGY_MECHANISM = REGISTRY.register("enderiam_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> NETHERITE_ENERGY_MECHANISM = REGISTRY.register("netherite_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> COMPUTING_MECHANISM = REGISTRY.register("computing_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> LOGIC_MECHANISM = REGISTRY.register("logic_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> STORAGE_MECHANISM = REGISTRY.register("storage_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ADVANCED_STORAGE_MECHANISM = REGISTRY.register("advanced_storage_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_STORAGE_MECHANISM = REGISTRY.register("enderiam_storage_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> FLUID_MECHANISM = REGISTRY.register("fluid_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ADVANCED_FLUID_MECHANISM = REGISTRY.register("advanced_fluid_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_FLUID_MECHANISM = REGISTRY.register("enderiam_fluid_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> LOW_HEAT_MECHANISM = REGISTRY.register("low_heat_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ADVANCED_HEAT_MECHANISM = REGISTRY.register("advanced_heat_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> BLOOD_MECHANISM = REGISTRY.register("blood_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> DARK_MECHANISM = REGISTRY.register("dark_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> SOUL_MECHANISM = REGISTRY.register("soul_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> PHYSICS_MECHANISM = REGISTRY.register("physics_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> NUCLEAR_MECHANISM = REGISTRY.register("nuclear_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> URANIUM_MECHANISM = REGISTRY.register("uranium_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> SCULK_MECHANISM = REGISTRY.register("sculk_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> EXPERIENCE_MECHANISM = REGISTRY.register("experience_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ADVANCED_EXPERIENCE_MECHANISM = REGISTRY.register("advanced_experience_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> MENRIL_MECHANISM = REGISTRY.register("menril_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> FERRICORE_MECHANISM = REGISTRY.register("ferricore_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> BLAZEGOLD_MECHANISM = REGISTRY.register("blazegold_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> CELESTIGEM_MECHANISM = REGISTRY.register("celestigem_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ECLIPSE_ALLOY_MECHANISM = REGISTRY.register("eclipse_alloy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> HARDENED_ENERGY_MECHANISM = REGISTRY.register("hardened_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> BLAZING_ENERGY_MECHANISM = REGISTRY.register("blazing_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> NIOTIC_ENERGY_MECHANISM = REGISTRY.register("niotic_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> SPIRITED_ENERGY_MECHANISM = REGISTRY.register("spirited_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> NITRO_ENERGY_MECHANISM = REGISTRY.register("nitro_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> LIGHT_MECHANISM = REGISTRY.register("light_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> EQUIVALENCE_MECHANISM = REGISTRY.register("equivalence_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> VOID_MECHANISM = REGISTRY.register("void_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> OTHER_MECHANISM = REGISTRY.register("other_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ATUNED_MECHANISM = REGISTRY.register("atuned_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_HEAT_MECHANISM = REGISTRY.register("enderiam_heat_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> SOURCE_MECHANISM = REGISTRY.register("source_mechanism", BaseMechanismItem::new);

    // Registering incomplete mechanism items
    public static final DeferredItem<Item> INCOMPLETE_WOODEN_MECHANISM = REGISTRY.register("incomplete_wooden_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_RUBBER_MECHANISM = REGISTRY.register("incomplete_rubber_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_HEAT_MECHANISM = REGISTRY.register("incomplete_heat_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ZINC_MECHANISM = REGISTRY.register("incomplete_zinc_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_PRECISION_MECHANISM = REGISTRY.register("incomplete_advanced_precision_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_MECHANISM = REGISTRY.register("incomplete_enderiam_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_REDSTONE_MECHANISM = REGISTRY.register("incomplete_redstone_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_BASIC_ENERGY_MECHANISM = REGISTRY.register("incomplete_basic_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_IRON_ENERGY_MECHANISM = REGISTRY.register("incomplete_iron_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_GOLDEN_ENERGY_MECHANISM = REGISTRY.register("incomplete_golden_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_DIAMOND_ENERGY_MECHANISM = REGISTRY.register("incomplete_diamond_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_ENERGY_MECHANISM = REGISTRY.register("incomplete_enderiam_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_NETHERITE_ENERGY_MECHANISM = REGISTRY.register("incomplete_netherite_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_COMPUTING_MECHANISM = REGISTRY.register("incomplete_computing_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_LOGIC_MECHANISM = REGISTRY.register("incomplete_logic_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_STORAGE_MECHANISM = REGISTRY.register("incomplete_storage_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_STORAGE_MECHANISM = REGISTRY.register("incomplete_advanced_storage_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_STORAGE_MECHANISM = REGISTRY.register("incomplete_enderiam_storage_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_FLUID_MECHANISM = REGISTRY.register("incomplete_fluid_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_FLUID_MECHANISM = REGISTRY.register("incomplete_advanced_fluid_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_FLUID_MECHANISM = REGISTRY.register("incomplete_enderiam_fluid_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_LOW_HEAT_MECHANISM = REGISTRY.register("incomplete_low_heat_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_HEAT_MECHANISM = REGISTRY.register("incomplete_advanced_heat_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_BLOOD_MECHANISM = REGISTRY.register("incomplete_blood_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_DARK_MECHANISM = REGISTRY.register("incomplete_dark_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_SOUL_MECHANISM = REGISTRY.register("incomplete_soul_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_PHYSICS_MECHANISM = REGISTRY.register("incomplete_physics_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_NUCLEAR_MECHANISM = REGISTRY.register("incomplete_nuclear_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_URANIUM_MECHANISM = REGISTRY.register("incomplete_uranium_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_SCULK_MECHANISM = REGISTRY.register("incomplete_sculk_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_EXPERIENCE_MECHANISM = REGISTRY.register("incomplete_experience_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_EXPERIENCE_MECHANISM = REGISTRY.register("incomplete_advanced_experience_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_MENRIL_MECHANISM = REGISTRY.register("incomplete_menril_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_FERRICORE_MECHANISM = REGISTRY.register("incomplete_ferricore_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_BLAZEGOLD_MECHANISM = REGISTRY.register("incomplete_blazegold_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_CELESTIGEM_MECHANISM = REGISTRY.register("incomplete_celestigem_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ECLIPSE_ALLOY_MECHANISM = REGISTRY.register("incomplete_eclipse_alloy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_HARDENED_ENERGY_MECHANISM = REGISTRY.register("incomplete_hardened_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_BLAZING_ENERGY_MECHANISM = REGISTRY.register("incomplete_blazing_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_NIOTIC_ENERGY_MECHANISM = REGISTRY.register("incomplete_niotic_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_SPIRITED_ENERGY_MECHANISM = REGISTRY.register("incomplete_spirited_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_NITRO_ENERGY_MECHANISM = REGISTRY.register("incomplete_nitro_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_LIGHT_MECHANISM = REGISTRY.register("incomplete_light_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_EQUIVALENCE_MECHANISM = REGISTRY.register("incomplete_equivalence_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_VOID_MECHANISM = REGISTRY.register("incomplete_void_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_OTHER_MECHANISM = REGISTRY.register("incomplete_other_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ATUNED_MECHANISM = REGISTRY.register("incomplete_atuned_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_HEAT_MECHANISM = REGISTRY.register("incomplete_enderiam_heat_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_SOURCE_MECHANISM = REGISTRY.register("incomplete_source_mechanism", BaseIncompleteMechanismItem::new);

    // Registering other raw materials and items
    public static final DeferredItem<Item> RUBBER = REGISTRY.register("rubber", RubberItem::new);
    public static final DeferredItem<Item> CURED_RUBBER = REGISTRY.register("cured_rubber", CuredRubberItem::new);
    public static final DeferredItem<Item> ENDERIAM_RUBBER = REGISTRY.register("enderiam_rubber", RubberItem::new);
    public static final DeferredItem<Item> CURED_ENDERIAM_RUBBER = REGISTRY.register("cured_enderiam_rubber", CuredRubberItem::new);
    public static final DeferredItem<Item> BRONZE = REGISTRY.register("bronze", BronzeItem::new);
    public static final DeferredItem<Item> ENERGY_CELL = REGISTRY.register("energy_cell", EnergyCellItem::new);
    public static final DeferredItem<Item> ENDERIAM_CELL = REGISTRY.register("enderiam_cell", EnderiamCellItem::new);

    // Registering saw items with different materials and tool attributes
    public static final DeferredItem<SawItem> IRON_SAW = REGISTRY.register("iron_saw",
            () -> new SawItem(ModToolTiers.MODIFIED_IRON, new Item.Properties().attributes(
                    SawItem.createAttributes(ModToolTiers.MODIFIED_IRON, 6.0F, -3.1F))));

    public static final DeferredItem<SawItem> COPPER_SAW = REGISTRY.register("copper_saw",
            () -> new SawItem(ModToolTiers.COPPER, new Item.Properties().attributes(
                    SawItem.createAttributes(ModToolTiers.COPPER, 6.0F, -3.1F))));

    public static final DeferredItem<SawItem> DIAMOND_SAW = REGISTRY.register("diamond_saw",
            () -> new SawItem(ModToolTiers.MODIFIED_DIAMOND, new Item.Properties().attributes(
                    SawItem.createAttributes(ModToolTiers.MODIFIED_DIAMOND, 6.0F, -3.1F))));

    public static final DeferredItem<SawItem> NETHERITE_SAW = REGISTRY.register("netherite_saw",
            () -> new SawItem(ModToolTiers.MODIFIED_NETHERITE, new Item.Properties().attributes(
                    SawItem.createAttributes(ModToolTiers.MODIFIED_NETHERITE, 14.0F, -3.5F))));
}
