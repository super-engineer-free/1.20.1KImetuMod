package com.tenthousand.KimetuMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ItemKimetuDemonExtermination extends SwordItem {

  public ItemKimetuDemonExtermination(Tier tier) {
    super(tier, 8,-1.9F,new Item.Properties()
        .stacksTo(1)
        .rarity(Rarity.EPIC)
        .durability(2012)

    );
  }
}
