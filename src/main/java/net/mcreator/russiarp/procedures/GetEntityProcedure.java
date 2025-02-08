package net.mcreator.russiarp.procedures;

import net.minecraft.world.entity.Entity;

public class GetEntityProcedure {
	public static Entity execute(Entity entity) {
		if (entity == null)
			return null;
		return entity;
	}
}
