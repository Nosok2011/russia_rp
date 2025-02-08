package net.mcreator.russiarp.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class SaltKillProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("died_from_salt").bypassArmor(), entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
	}
}
