package net.MaouGaukken.CreateMechanisms.Compiler.Fluid;

import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluidItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, CreateMechanisms.MOD_ID);

    public static final DeferredHolder <Item, BucketItem> ENDERIAM_BUCKET = ITEMS.register("enderiam_bucket",
            ()-> new BucketItem(ModFluid.SOURCE_ENDERIAM.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
