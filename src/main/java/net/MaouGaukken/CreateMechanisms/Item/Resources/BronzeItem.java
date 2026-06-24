package net.MaouGaukken.CreateMechanisms.Item.Resources;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

// BronzeItem Mod class, responsible for creating the item
public class BronzeItem extends Item{
    //Defines the item data
    public BronzeItem() {
        super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
