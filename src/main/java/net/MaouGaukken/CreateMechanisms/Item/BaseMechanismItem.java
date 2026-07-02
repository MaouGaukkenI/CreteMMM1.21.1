package net.MaouGaukken.CreateMechanisms.Item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

// AdvancedPrecisionMechanismItem Mod class, responsible for creating the item
public class BaseMechanismItem extends Item {
    //Defines the item data
    public BaseMechanismItem() {
        super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
