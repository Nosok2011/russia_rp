package net.mcreator.russiarp.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class SetPassportOwnerProcedure {
	public static String execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return "";
		if (!(itemstack.getOrCreateTag().getString("owner")).equals(entity.getDisplayName().getString())) {
			if ((itemstack.getOrCreateTag().getString("owner")).equals("")) {
				itemstack.getOrCreateTag().putString("owner", (entity.getDisplayName().getString()));
			}
		}
		return itemstack.getOrCreateTag().getString("owner");
	}
}
