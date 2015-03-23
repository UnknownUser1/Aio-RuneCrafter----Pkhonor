package aiorunecrafterpkhonor.misc;

import org.rev317.min.api.methods.SceneObjects;

public class Variables {

	public static int runeId;

	public static boolean isLoggedIn() {
		return SceneObjects.getNearest().length > 0;
	}

	public static boolean toRelog() {
		return Gui.checkBox_reLogin.isSelected();
	}
}
