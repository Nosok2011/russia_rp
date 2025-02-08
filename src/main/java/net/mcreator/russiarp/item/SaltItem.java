
package net.mcreator.russiarp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.russiarp.procedures.SaltKillProcedure;
import net.mcreator.russiarp.init.RussiaRpModTabs;

public class SaltItem extends Item {
	public SaltItem() {
		super(new Item.Properties().tab(RussiaRpModTabs.TAB_RUSSIA_RP_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SaltKillProcedure.execute(entity);
		return retval;
	}
}
