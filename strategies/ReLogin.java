package aiorunecrafterpkhonor.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Keyboard;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;

import aiorunecrafterpkhonor.misc.Gui;
import aiorunecrafterpkhonor.misc.Variables;

public class ReLogin implements Strategy {
	public static String Pass = Gui.textField_password.getText();

	@Override
	public boolean activate() {

		return Variables.toRelog() && !Variables.isLoggedIn();
	}

	@Override
	public void execute() {
		Keyboard.getInstance().sendKeys(Pass);
		Time.sleep(new SleepCondition() {
			@Override
			public boolean isValid() {
				return Variables.isLoggedIn();
			}

		}, 3250);

	}

}
