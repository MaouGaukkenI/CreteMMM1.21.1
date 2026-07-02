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
    public static final DeferredItem<Item> ENDER_MECHANISM = REGISTRY.register("ender_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> REDSTONE_MECHANISM = REGISTRY.register("redstone_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> BASIC_ENERGY_MECHANISM = REGISTRY.register("basic_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> IRON_ENERGY_MECHANISM = REGISTRY.register("iron_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> GOLDEN_ENERGY_MECHANISM = REGISTRY.register("golden_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> DIAMOND_ENERGY_MECHANISM = REGISTRY.register("diamond_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> ENDERIAM_ENERGY_MECHANISM = REGISTRY.register("enderiam_energy_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> NETHERITE_ENERGY_MECHANISM = REGISTRY.register("netherite_energy_mechanism", BaseMechanismItem::new);

    // Registering incomplete mechanism items
    public static final DeferredItem<Item> INCOMPLETE_WOODEN_MECHANISM = REGISTRY.register("incomplete_wooden_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_RUBBER_MECHANISM = REGISTRY.register("incomplete_rubber_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_HEAT_MECHANISM = REGISTRY.register("incomplete_heat_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ZINC_MECHANISM = REGISTRY.register("incomplete_zinc_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_PRECISION_MECHANISM = REGISTRY.register("incomplete_advanced_precision_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDER_MECHANISM = REGISTRY.register("incomplete_ender_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_REDSTONE_MECHANISM = REGISTRY.register("incomplete_redstone_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_BASIC_ENERGY_MECHANISM = REGISTRY.register("incomplete_basic_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_IRON_ENERGY_MECHANISM = REGISTRY.register("incomplete_iron_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_GOLDEN_ENERGY_MECHANISM = REGISTRY.register("incomplete_golden_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_DIAMOND_ENERGY_MECHANISM = REGISTRY.register("incomplete_diamond_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_ENDERIAM_ENERGY_MECHANISM = REGISTRY.register("incomplete_enderiam_energy_mechanism", BaseIncompleteMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_NETHERITE_ENERGY_MECHANISM = REGISTRY.register("incomplete_netherite_energy_mechanism", BaseIncompleteMechanismItem::new);

    // Registering other raw materials and items
    public static final DeferredItem<Item> RUBBER = REGISTRY.register("rubber", RubberItem::new);
    public static final DeferredItem<Item> CURED_RUBBER = REGISTRY.register("cured_rubber", CuredRubberItem::new);
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


}
