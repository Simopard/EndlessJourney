package com.simo.EndlessJourney.init;

import com.simo.EndlessJourney.EndlessJourney;
import com.simo.EndlessJourney.common.EJItemTiers;
import com.simo.EndlessJourney.common.items.LongBowItem;
import com.simo.EndlessJourney.common.items.tools.EJSwordItem;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessJourney.MOD_ID);

    //Items
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> IRON_KNIFE = ITEMS.register("iron_knife", () -> new EJSwordItem(EJItemTiers.IRON, 0, 0));
    public static final RegistryObject<Item> LONG_BOW = ITEMS.register("long_bow", () -> new LongBowItem(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));

    //Food Items
    public static final RegistryObject<Item> MEAT_SKEWER = ITEMS.register("meat_skewer", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_FOOD).food(FoodInit.MEAT_SKEWER)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_FOOD).food(FoodInit.CHEESE)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_FOOD).food(FoodInit.TOMATO)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new BlockNamedItem(BlockInit.TOMATO_BLOCK.get(), new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<Item> BLUE_BERRIES = ITEMS.register("blue_berries", () -> new BlockNamedItem(BlockInit.BLUE_BERRY_BUSH.get(), new Item.Properties().group(EndlessJourney.JOURNEY_FOOD).food(FoodInit.BLUE_BERRIES)));
    public static final RegistryObject<Item> BLUE_BERRY_PIE = ITEMS.register("blue_berry_pie", () -> new Item(new Item.Properties().group(EndlessJourney.JOURNEY_FOOD).food(FoodInit.BLUE_BERRY_PIE)));

    //BlockItems
    public static final RegistryObject<BlockItem> INGOT_BLOCK = ITEMS.register("ingot_block", () -> new BlockItem(BlockInit.INGOT_BLOCK.get(), new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<BlockItem> TREASURE = ITEMS.register("treasure", () -> new BlockItem(BlockInit.TREASURE.get(), new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
    public static final RegistryObject<BlockItem> TREASURE_BLOCK = ITEMS.register("treasure_block", () -> new BlockItem(BlockInit.TREASURE_BLOCK.get(), new Item.Properties().group(EndlessJourney.JOURNEY_GROUP)));
}
