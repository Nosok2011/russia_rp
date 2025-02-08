
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.russiarp.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RussiaRpModTabs {
	public static CreativeModeTab TAB_RUSSIA_RP_TAB;

	public static void load() {
		TAB_RUSSIA_RP_TAB = new CreativeModeTab("tabrussia_rp_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RussiaRpModItems.RUBLES_100.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
