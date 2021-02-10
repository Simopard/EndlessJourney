package com.simo.EndlessJourney.common.items.tools;

import com.simo.EndlessJourney.EndlessJourney;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

/* Created by Craig */
public class EJSwordItem extends SwordItem {

    public EJSwordItem(IItemTier iItemTier, int attackDamage, int attackSpeed) {
        super(iItemTier, attackDamage, attackSpeed, new Properties()
                .group(EndlessJourney.JOURNEY_GROUP)
                .maxStackSize(1)
                .rarity(Rarity.RARE)
        );
    }
}
