package net.MaouGaukken.CreateMechanisms.Compiler.Fluid;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundAction;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.MaouGaukken.CreateMechanisms.CreateMechanisms;

import java.util.function.Supplier;

public class ModFluidsBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, CreateMechanisms.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, CreateMechanisms.MOD_ID);

    public static final DeferredHolder<Block, LiquidBlock> ENDERIAM_BLOCK =
            BLOCKS.register("enderiam_block",
                    () -> new LiquidBlock(ModFluid.SOURCE_ENDERIAM.get(),
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.EMERALD)
                                    .replaceable()
                                    .noCollission()
                                    .strength(100.0F)
                                    .lightLevel(state -> 15)
                                    .noLootTable()
                                    .liquid()
                                    .sound(SoundType.BASALT)
                    )
            );

    //LiquidBlock(Fluids.LAVA, Properties.of().mapColor(MapColor.FIRE).replaceable().noCollission().randomTicks()
    // .strength(100.0F).lightLevel((p_50755_) -> 15).pushReaction(PushReaction.DESTROY).noLootTable().liquid().sound(SoundType.EMPTY)))

    private static DeferredHolder<Block, Block> registerBlock(String name, Supplier<Block> block) {
        DeferredHolder<Block, Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredHolder<T, T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
