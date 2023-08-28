package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		//接水滴游戏
//		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
//		config.setTitle("Drop");//game name
//		config.setWindowedMode(800,480);//window size
//		config.useVsync(true);
//		config.setForegroundFPS(60);
//		new Lwjgl3Application(new Drop(),config);

		//跑步游戏
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Person");//game name
		config.setWindowedMode(800,480);//window size
		config.useVsync(true);
		config.setForegroundFPS(60);
		new Lwjgl3Application(new Person(),config);
	}
}
