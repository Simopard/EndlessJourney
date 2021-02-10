package com.simo.EndlessJourney.init;

import com.simo.EndlessJourney.EndlessJourney;
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
    public static final RegistryObject<Block> INGOT_BLOCK = BLOCKS.register("ingot_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE).hardnessAndResistance(15f,30f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));

}
