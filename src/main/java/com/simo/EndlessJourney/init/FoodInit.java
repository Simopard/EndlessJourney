package com.simo.EndlessJourney.init;

import net.minecraft.item.Food;

public class FoodInit {

    /*.food(new Food.Builder().effect(() -> new EffectInstance(Effects.POISON, 200, 2), 1.0f).build())));*/
    public static final Food MEAT_SKEWER = new Food.Builder().hunger(6).saturation(1.6f).meat().build();
}
