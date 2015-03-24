package aiorunecrafterpkhonor.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

import aiorunecrafterpkhonor.Main;
import aiorunecrafterpkhonor.misc.Variables;

public class RuneCraft implements Strategy {

	@Override
	public boolean activate() {
		return Inventory.getCount(1437) >= 27 && Variables.isLoggedIn();
	}

	@Override
	public void execute() {
		SceneObject[] alter = SceneObjects.getNearest(Variables.runeId);
		if (alter.length > 0 && alter != null && alter[0].distanceTo() > 0) {
			alter[0].interact(0);
			Time.sleep(new SleepCondition() {
				@Override
				public boolean isValid() {
					return Inventory.getCount(1437) == 0;
				}

			}, 250);
			Main.runeCount += 27;
		}

	}

}
