package com.tenthousand.KimetuMod.regi.tab;

import com.tenthousand.KimetuMod.main.tenthousandMod;

import com.tenthousand.KimetuMod.regi.KimetuModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class KimetuModTabs {


  public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, tenthousandMod.MOD_ID);

    public static  final RegistryObject<CreativeModeTab> TENTHOUSAND_MAIN = MOD_TABS.register("tenthousand_main",
        ()->{return CreativeModeTab.builder()
            .icon(()->new ItemStack(KimetuModItems.KIMETU_DemonExtermination.get()))
            .title(Component.translatable("tenthousand_main"))
            .displayItems((param,output)->{
              for (Item item:tenthousandMain.items){
                output.accept(item);
              }
            })
            .build();
    });

  public static  final RegistryObject<CreativeModeTab> TENTHOUSAND_SUB = MOD_TABS.register("tenthousand_sub",
      ()->{return CreativeModeTab.builder()
          .icon(()->new ItemStack(Blocks.DIAMOND_BLOCK))
          .title(Component.translatable("itemGroup.tenthousand_sub"))
          .withTabsBefore(KimetuModTabs.TENTHOUSAND_MAIN.getId())
          .displayItems((param,output)->{
            for (Item item:tenthousandMain.items){
              output.accept(item);
            }
          })
          .build();
      });
}
