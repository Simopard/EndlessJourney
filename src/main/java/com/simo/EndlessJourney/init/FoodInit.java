package com.simo.EndlessJourney.init;

import net.minecraft.item.Food;

public class FoodInit {

    /*.food(new Food.Builder().effect(() -> new EffectInstance(Effects.POISON, 200, 2), 1.0f).build())));*/
    public static final Food MEAT_SKEWER = new Food.Builder().hunger(6).saturation(1.6f).meat().build();
    public static final Food TOMATO = new Food.Builder().hunger(4).saturation(0.5f).fastToEat().build();
    public static final Food CHEESE = new Food.Builder().hunger(5).saturation(0.8f).build();
    public static final Food BLUE_BERRIES = new Food.Builder().hunger(3).saturation(1.5f).build();
    public static final Food BLUE_BERRY_PIE = new Food.Builder().hunger(9).saturation(0.5f).build();
}
