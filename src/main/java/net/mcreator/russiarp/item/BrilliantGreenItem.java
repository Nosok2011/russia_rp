
package net.mcreator.russiarp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.russiarp.procedures.ZelyonkaHealProcedure;
import net.mcreator.russiarp.init.RussiaRpModTabs;

public class BrilliantGreenItem extends Item {
	public BrilliantGreenItem() {
		super(new Item.Properties().tab(RussiaRpModTabs.TAB_RUSSIA_RP_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ZelyonkaHealProcedure.execute(entity, itemstack);
		return ar;
	}
}
