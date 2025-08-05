package com.tenthousand.KimetuMod.main;

import com.tenthousand.KimetuMod.regi.KimetuModItems;
import com.tenthousand.KimetuMod.regi.tab.KimetuModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("kimetumod")
public class tenthousandMod {

  public static final String MOD_ID = "kimetumod";

  public tenthousandMod(FMLJavaModLoadingContext context) {
    IEventBus bus = context.getModEventBus();
    KimetuModItems.ITEMS.register(bus);
    KimetuModTabs.MOD_TABS.register(bus);
  }
}
