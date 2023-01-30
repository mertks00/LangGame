package main;

import utils.Frames;
import utils.Timer;

public class Main {

	public static void main(String[] args) {
		
		Frames.getOpenPanel();

        Timer timer = new Timer();

        Thread thread = new Thread(timer);

        thread.start();

	}

}
