package aiorunecrafterpkhonor;

import java.util.ArrayList;

import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;

import aiorunecrafterpkhonor.misc.Gui;
import aiorunecrafterpkhonor.strategies.AntiRandoms;
import aiorunecrafterpkhonor.strategies.Banking;
import aiorunecrafterpkhonor.strategies.ReLogin;
import aiorunecrafterpkhonor.strategies.RuneCraft;

@ScriptManifest(author = "Unknown User", category = Category.RUNECRAFTING, description = "Aio RuneCrafter for pkhonor, Start with rune ess first inventory slot! More runes to comes!", name = "UAio RuneCrafter", servers = { "Pkhonor" }, version = 1)
public class Main extends Script {

	private final ArrayList<Strategy> strategies = new ArrayList<Strategy>();

	public static int runeCount;
	public static String alterName;

	public boolean onExecute() {
		Gui GUI = new Gui();
		GUI.setVisible(true);
		while (GUI.isVisible()) {
			sleep(20);
		}
		strategies.add(new AntiRandoms());
		strategies.add(new ReLogin());
		strategies.add(new Banking());
		strategies.add(new RuneCraft());

		provide(strategies);

		return true;
	}

	public void onFinish() {
		System.out
				.println("********************************************************************************");
		System.out.println("Scriped Ended, Thank you for using!");
		System.out.println("You Used " + runeCount + " Essences on "
				+ alterName + "!");
		System.out.println("Script Made By UnknownUser");
		System.out
				.println("********************************************************************************");

	}

}
