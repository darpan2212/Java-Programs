package org.guessnum;

import java.util.Scanner;

public class GuessNum {
	public GuessNum() {
	}

	public static int search(int lo, int hi) {
		Scanner scn = new Scanner(System.in);
		if (hi - lo == 1)
			return lo;
		int mid = lo + (hi - lo) / 2;
		System.out.println("Is it less than " + mid);
		if (scn.nextLine().equals("y"))
			return search(lo, mid);
		return search(mid, hi);
	}

	public static void main(String[] args) {
		int k = Integer.parseInt("5");
		int n = (int) Math.pow(2.0D, k);
		System.out.println("Think of an integer between 0 and " + (n - 1));
		int secret = search(0, n);
		System.out.println("Your number is " + secret);
	}
}