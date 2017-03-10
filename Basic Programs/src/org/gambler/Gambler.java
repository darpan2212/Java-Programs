package org.gambler;

public class Gambler {

	public static double countPerc(double get, double total) {
		return get / total * 100.0D;
	}

	public static void main(String[] args) {
		System.out.println("How much $STACK you have?");
		java.util.Scanner scn = new java.util.Scanner(System.in);

		double winC = 0.0D;
		double lossC = 0.0D;
		double cnt = 0.0D;
		if (scn.hasNextInt()) {
			int stack = scn.nextInt();
			System.out.println("set your goal");
			if (scn.hasNextInt()) {
				int goal = scn.nextInt();
				System.out.println("How many times you want to play");
				if (scn.hasNextInt()) {
					int N = scn.nextInt();
					for (int i = 0; i < N; i++) {
						if ((stack != 0) && (stack != goal)) {
							if (Math.random() < 0.5D) {
								lossC += 1.0D;
								stack--;
								cnt += 1.0D;
							} else {
								winC += 1.0D;
								stack++;
								cnt += 1.0D;
							}
						} else {
							if (stack == goal) {
								System.out.println("congrats, You have reached your goal amount");
								break;
							}
							System.out.println("Sorry, you have loss all your stack amount");
							break;
						}
					}
					System.out.println("you have win " + (int) winC + " times");
					System.out.println("you have loss " + (int) lossC + " times");
					System.out.println("Percentage of win " + countPerc(winC, cnt) + " %");
					System.out.println("Percentage of loss " + countPerc(lossC, cnt) + " %");
					System.out.println("your current stack is " + stack);
				} else {
					System.out.println("invalid input");
				}
			} else {
				System.out.println("invalid input");
			}
		} else {
			System.out.println("invalid input");
		}
		scn.close();
	}
}