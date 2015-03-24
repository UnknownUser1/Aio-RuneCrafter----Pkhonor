package aiorunecrafterpkhonor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.*;

import org.parabot.environment.api.interfaces.Paintable;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;

import aiorunecrafterpkhonor.misc.Gui;
import aiorunecrafterpkhonor.misc.Variables;
import aiorunecrafterpkhonor.strategies.AntiRandoms;
import aiorunecrafterpkhonor.strategies.Banking;
import aiorunecrafterpkhonor.strategies.ReLogin;
import aiorunecrafterpkhonor.strategies.RuneCraft;

@ScriptManifest(author = "Unknown User", category = Category.RUNECRAFTING, description = "Aio RuneCrafter for pkhonor", name = "UAio RuneCrafter", servers = { "Pkhonor" }, version = 1.1)
public class Main extends Script implements Paintable {

	private final ArrayList<Strategy> strategies = new ArrayList<Strategy>();

	public static int runeCount;
	public static String alterName;
	public static long startTime;

	public boolean onExecute() {
		Gui GUI = new Gui();
		GUI.setVisible(true);
		while (GUI.isVisible()) {
			sleep(20);
		}
		startTime = System.currentTimeMillis();
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

	private final Color color1 = new Color(0, 0, 0, 198);
	private final Color color2 = new Color(0, 0, 0);
	private final Color color3 = new Color(51, 51, 255);
	private final Color color4 = new Color(255, 255, 255);

	private final BasicStroke stroke1 = new BasicStroke(1);

	private final Font font1 = new Font("Calibri", 1, 21);
	private final Font font2 = new Font("Calibri", 1, 15);
	private final Font font3 = new Font("Adobe Arabic", 1, 10);

	public void paint(Graphics C) {
		Graphics2D g = (Graphics2D) C;
		g.setColor(color1);
		g.fillRoundRect(548, 343, 189, 122, 16, 16);
		g.setColor(color2);
		g.setStroke(stroke1);
		g.drawRoundRect(548, 343, 189, 122, 16, 16);
		g.fillRoundRect(549, 343, 188, 26, 16, 16);
		g.setColor(color3);
		g.drawRoundRect(549, 343, 188, 26, 16, 16);
		g.setFont(font1);
		g.setColor(color4);
		g.drawString("UAio RuneCrafter", 568, 367);
		g.setFont(font3);
		g.drawString("Run Time -", 552, 389);
		g.drawString("Making -", 553, 409);
		g.drawString("Per Hour -", 552, 453);
		g.drawString("How Many -", 552, 432);

		C.setColor(Color.white);
		C.setFont(new Font("OCR A Extended", Font.BOLD, 12));

		C.drawString(Variables.runTime(Main.startTime), 630, 389);
		C.drawString(alterName, 616, 409);
		C.drawString(Variables.addDecimals(runeCount), 640, 432);
		C.drawString(Variables.addDecimals(Variables.getHourlyRate(runeCount))
				.toString(), 625, 453);

	}

}
