package net.MaouGaukken.CreateMechanisms.Compiler;

import net.MaouGaukken.CreateMechanisms.CreateMechanisms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items{
        public static final TagKey<Item> MECHANISM = tagCreator("mechanism");
        public static final TagKey<Item> INCOMPLETE_MECHANISM = tagCreator("incomplete_mechanism");
        public static final TagKey<Item> ENERGY_MECHANISM = tagCreator("energy_mechanism");
        public static final TagKey<Item> FLUID_MECHANISM = tagCreator("fluid_mechanism");
        public static final TagKey<Item> LOGISTIC_MECHANISM = tagCreator("logistic_mechanism");
        public static final TagKey<Item> HEAT_MECHANISM = tagCreator("heat_mechanism");
        public static final TagKey<Item> SAW = tagCreator("saw");
        public static final TagKey<Item> ADVANCED_MECHANISM = tagCreator("advanced_mechanism");
        public static final TagKey<Item> BASIC_MECHANISM = tagCreator("basic_mechanism");
        public static final TagKey<Item> ENDERIAM_MECHANISM = tagCreator("enderiam_mechanism");

        private static TagKey<Item> tagCreator(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CreateMechanisms.MOD_ID, name));
        }
    }
}
