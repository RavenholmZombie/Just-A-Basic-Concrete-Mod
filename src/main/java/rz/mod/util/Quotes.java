package rz.mod.util;

import java.util.Random;

public class Quotes 
{
	public static void QuoteSelect()
	{
		Random chooser = new Random();
		int lines;
		lines = chooser.nextInt(10);
		switch(lines) {
			case 1:
				System.out.println("[JABCM] Keelah Se'lai!");
			break;
			case 2:
				System.out.println("[JABCM] I am the very model of a scientist salarian!");
			break;
			case 3:
				System.out.println("[JABCM] Siha");
			break;
			case 4:
				System.out.println("[JABCM] Cerberus used to be humanity's sword, not a dagger in its back!");
			break;
			case 5:
				System.out.println("[JABCM] I've studied species turian, asari, and batarian...");
			break;
			case 6:
				System.out.println("[JABCM] Did you know? JABCM is also available for Minecraft 1.16.3!");
			break;
			case 7:
				System.out.println("[JABCM] Laugh it up, Tali...");
			break;
			case 8:
				System.out.println("[JABCM] My xenoscience studies range from urban to agrarian, I am the very model of a scientist salaaaaaaarian!");
			break;
			case 9:
				System.out.println("[JABCM] Subscribe to RavenholmZombie on YouTube!");
			break;
			case 10:
				System.out.println("[JABCM] Thank you to all of the people who have downloaded JABCM. Your support is greatly appreciated!");
			break;
		}
	}
}
