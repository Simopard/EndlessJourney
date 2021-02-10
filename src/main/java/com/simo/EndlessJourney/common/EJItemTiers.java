package com.simo.EndlessJourney.common;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

/* Created by Craig */
public class EJItemTiers {

    public static IItemTier IRON = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 50;
        }

        @Override
        public float getEfficiency() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 4;
        }

        @Override
        public int getHarvestLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT));
        }
    };
}
