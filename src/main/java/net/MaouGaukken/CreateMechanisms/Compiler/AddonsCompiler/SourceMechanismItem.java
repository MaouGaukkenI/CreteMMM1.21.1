package net.MaouGaukken.CreateMechanisms.Compiler.AddonsCompiler;

import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.MaouGaukken.CreateMechanisms.Item.BaseIncompleteMechanismItem;
import net.MaouGaukken.CreateMechanisms.Item.BaseMechanismItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SourceMechanismItem {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateMechanisms.MOD_ID);

    public static final DeferredItem<Item> SOURCE_MECHANISM = REGISTRY.register("source_mechanism", BaseMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_SOURCE_MECHANISM = REGISTRY.register("incomplete_source_mechanism", BaseIncompleteMechanismItem::new);
}
