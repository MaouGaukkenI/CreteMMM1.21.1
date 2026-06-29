package net.MaouGaukken.CreateMechanisms.Compiler.AddonsCompiler;

import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.MaouGaukken.CreateMechanisms.Item.InconpleteMechanism.*;
import net.MaouGaukken.CreateMechanisms.Item.Mechanism.*;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AeItens {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateMechanisms.MOD_ID);

    public static final DeferredItem<Item> COMPUTING_MECHANISM = REGISTRY.register("computing_mechanism", ComputingMechanismItem::new);
    public static final DeferredItem<Item> INCOMPLETE_COMPUTING_MECHANISM = REGISTRY.register("incomplete_computing_mechanism", IncompleteComputingMechanismItem::new);

}
