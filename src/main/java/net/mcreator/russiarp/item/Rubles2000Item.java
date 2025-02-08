
package net.mcreator.russiarp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.russiarp.init.RussiaRpModTabs;

public class Rubles2000Item extends Item {
	public Rubles2000Item() {
		super(new Item.Properties().tab(RussiaRpModTabs.TAB_RUSSIA_RP_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
