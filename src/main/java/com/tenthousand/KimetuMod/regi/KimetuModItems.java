package com.tenthousand.KimetuMod.regi;

import com.tenthousand.KimetuMod.item.ItemKimetuDemonExtermination;
import com.tenthousand.KimetuMod.main.tenthousandMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KimetuModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, tenthousandMod.MOD_ID);

  public  static final RegistryObject<Item> KIMETU_DemonExtermination = ITEMS.register("kimetu_demonextermination",  () -> new ItemKimetuDemonExtermination(Tiers.DIAMOND));

}
