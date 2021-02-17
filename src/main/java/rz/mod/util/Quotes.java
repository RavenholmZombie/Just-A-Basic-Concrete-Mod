package rz.mod.util;

import java.util.Random;
import rz.mod.Main;

public class Quotes 
{
	public static void QuoteSelect()
	{
		Random chooser = new Random();
		int lines;
		lines = chooser.nextInt(10);
		switch(lines) {
			case 1:
				Main.logger.info("[JABCM] Keelah Se'lai!");
			break;
			case 2:
				Main.logger.info("[JABCM] I am the very model of a scientist salarian!");
			break;
			case 3:
				Main.logger.info("[JABCM] Siha");
			break;
			case 4:
				Main.logger.info("[JABCM] Cerberus used to be humanity's sword, not a dagger in its back!");
			break;
			case 5:
				Main.logger.info("[JABCM] I've studied species turian, asari, and batarian...");
			break;
			case 6:
				Main.logger.info("[JABCM] Did you know? JABCM is also available for Minecraft 1.16.3!");
			break;
			case 7:
				Main.logger.info("[JABCM] Laugh it up, Tali...");
			break;
			case 8:
				Main.logger.info("[JABCM] My xenoscience studies range from urban to agrarian, I am the very model of a scientist salaaaaaaarian!");
			break;
			case 9:
				Main.logger.info("[JABCM] Subscribe to RavenholmZombie on YouTube!");
			break;
			case 10:
				Main.logger.info("[JABCM] Thank you to all of the people who have downloaded JABCM. Your support is greatly appreciated!");
			break;
		}
	}
}
