package net.MaouGaukken.CreateMechanisms.Item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.item.Rarity;

// IncompleteAdvancedPrecisionMechanismItem Mod class, responsible for creating the item
public class BaseIncompleteMechanismItem extends SequencedAssemblyItem {
    //Defines the item data
    public BaseIncompleteMechanismItem() {
        super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
    }
}
