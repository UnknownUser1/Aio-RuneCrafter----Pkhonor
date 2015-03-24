package aiorunecrafterpkhonor.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Game;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Menu;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

import aiorunecrafterpkhonor.misc.Variables;

public class Banking implements Strategy {

	@Override
	public boolean activate() {

		return Inventory.getCount(1437) == 0 && Variables.isLoggedIn();
	}

	@Override
	public void execute() {
		SceneObject[] bankBooth = SceneObjects.getNearest(2213);
		if (Game.getOpenInterfaceId() == -1 && bankBooth.length > 0
				&& bankBooth != null) {
			bankBooth[0].interact(0);
			Time.sleep(new SleepCondition() {
				@Override
				public boolean isValid() {
					return Game.getOpenInterfaceId() != -1;
				}

			}, 250);
		} else {
			if (Game.getOpenInterfaceId() != -1) {
				Menu.sendAction(53, 1436, 0, 5382);
				Time.sleep(new SleepCondition() {
					@Override
					public boolean isValid() {
						return Inventory.getCount(1437) >= 1;
					}

				}, 250);
			}
		}

	}

}
