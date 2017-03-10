package org.stopwatch;

import java.util.Scanner;

public class StopWatch {

	private static double startTime = 0.0D;
	private static double stopTime = 0.0D;
	private boolean running = false;

	public void start() {
		startTime = System.currentTimeMillis();
		running = true;
	}

	public void stop() {
		stopTime = System.currentTimeMillis();
		running = false;
	}

	public double getElapsedTime() {
		double elapsed;
		if (running) {
			elapsed = System.currentTimeMillis() - startTime;
		} else {
			elapsed = stopTime - startTime;
		}
		return elapsed;
	}

	public double getElapsedTimeSecs() {
		double elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime) / 1000.0D;
		} else {
			elapsed = (stopTime - startTime) / 1000.0D;
		}
		return elapsed;
	}

	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		Scanner scn = new Scanner(System.in);
		if (scn.nextLine().equals("y")) {
			s.start();
		}
		if (scn.nextLine().equals("n")) {
			s.stop();
		}
		scn.close();

		double secs = s.getElapsedTimeSecs();
		System.out.println("elapsed time in seconds: " + secs);
		System.out.println("In hh:mm:ss:ms format");

		int ms = (int) (secs * 1000.0D) % 1000;
		int ss = (int) secs;
		int m = (int) secs / 60;
		int h = m / 60;

		System.out.println(h + ":" + m + ":" + ss + ":" + ms);
	}
}