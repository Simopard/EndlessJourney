package com.simo.EndlessJourney.init;

import com.simo.EndlessJourney.EndlessJourney;
import com.simo.EndlessJourney.common.blocks.BlueBerryBushBlock;
import com.simo.EndlessJourney.common.blocks.TomatoBlock;
import com.simo.EndlessJourney.common.blocks.TreasureBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EndlessJourney.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> INGOT_BLOCK = BLOCKS.register("ingot_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(10f,20f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> TOMATO_BLOCK = BLOCKS.register("tomato_block", () -> new TomatoBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP)));
    public static final RegistryObject<Block> BLUE_BERRY_BUSH = BLOCKS.register("blue_berry_bush", () -> new BlueBerryBushBlock(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> TREASURE = BLOCKS.register("treasure", () -> new TreasureBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1f, 2f).sound(SoundType.CHAIN)));
    public static final RegistryObject<Block> TREASURE_BLOCK = BLOCKS.register("treasure_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1f,2f).sound(SoundType.CHAIN)));

}
