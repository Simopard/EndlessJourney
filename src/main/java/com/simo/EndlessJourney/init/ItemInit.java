package com.simo.EndlessJourney.init;

import com.simo.EndlessJourney.EndlessJourney;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessJourney.MOD_ID);

    //Items
    public static final RegistryObject<Item> INGOT = ITEMS.register("ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //BlockItems
    public static final RegistryObject<BlockItem> INGOT_BLOCK = ITEMS.register("ingot_block", () -> new BlockItem(BlockInit.INGOT_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
