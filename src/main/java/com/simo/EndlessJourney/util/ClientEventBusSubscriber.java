package com.simo.EndlessJourney.util;

import com.simo.EndlessJourney.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        RenderTypeLookup.setRenderLayer(BlockInit.TOMATO_BLOCK.get(), RenderType.getCutout());
    }
}
