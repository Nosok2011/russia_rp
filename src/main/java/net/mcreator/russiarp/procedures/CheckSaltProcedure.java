package net.mcreator.russiarp.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.russiarp.network.RussiaRpModVariables;

public class CheckSaltProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(RussiaRpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RussiaRpModVariables.PlayerVariables())).AteSalt + 1;
			entity.getCapability(RussiaRpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AteSalt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(RussiaRpModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RussiaRpModVariables.PlayerVariables())).AteSalt == 5) {
			{
				double _setval = 0;
				entity.getCapability(RussiaRpModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AteSalt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SaltKillProcedure.execute(entity);
		}
	}
}
