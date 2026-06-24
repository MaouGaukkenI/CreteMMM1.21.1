package net.MaouGaukken.CreateMechanisms.Item.Parts;

import net.MaouGaukken.CreateMechanisms.Compiler.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

// EnderiamItem Mod class, responsible for creating the item
public class EnderiamItem extends BucketItem {
    //Defines the item data
    public EnderiamItem() {
        super(ModFluids.ENDERIAM.get(), new Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
    }
}

