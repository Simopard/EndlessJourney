package com.simo.EndlessJourney.init;

import com.simo.EndlessJourney.EndlessJourney;
import com.simo.EndlessJourney.common.EJItemTiers;
import com.simo.EndlessJourney.common.items.tools.EJSwordItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessJourney.MOD_ID);

    //Items
    public static final RegistryObject<Item> INGOT = ITEMS.register("ingot", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> IRON_KNIFE = ITEMS.register("iron_knife", () -> new EJSwordItem(EJItemTiers.IRON, 0, 0));
    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP).rarity(Rarity.EPIC)));


    //BlockItems
    public static final RegistryObject<BlockItem> INGOT_BLOCK = ITEMS.register("ingot_block", () -> new BlockItem(BlockInit.INGOT_BLOCK.get(), new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
}
