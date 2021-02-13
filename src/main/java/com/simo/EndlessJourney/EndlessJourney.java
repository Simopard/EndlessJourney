package com.simo.EndlessJourney;

import com.simo.EndlessJourney.init.BlockInit;
import com.simo.EndlessJourney.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EndlessJourney.MOD_ID)
@Mod.EventBusSubscriber(modid = EndlessJourney.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EndlessJourney {

    public static final String MOD_ID = "endless_journey";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup JOURNEY_GROUP = new JourneyGroup("journeytab");
    public static final ItemGroup JOURNEY_FOOD = new JourneyFoodGroup("journeyfoodtab");

    public EndlessJourney() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    //Item Groups
    public static class JourneyGroup extends ItemGroup {

        public JourneyGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.LONG_BOW.get().getDefaultInstance();
        }

    }

    public static class JourneyFoodGroup extends ItemGroup {

        public JourneyFoodGroup(String label) {
            super(label);
        }
        @Override
        public ItemStack createIcon() {
            return ItemInit.MEAT_SKEWER.get().getDefaultInstance();
        }
    }

}
