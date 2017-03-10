package org.coupon;

import java.util.Scanner;

public class Coupon {

	public static int random(int min, int max) {
		if (min > max) {
			System.err.println("Enter valid range ::: min must be less than max");
		}
		return (int) (Math.random() * max + min);
	}

	public static void main(String[] args) {
		System.out.println("How many coupon are there?");
		Scanner scn = new Scanner(System.in);

		if (scn.hasNextInt()) {
			int N = scn.nextInt();
			int[] coupon = new int[N];
			boolean flag = true;
			for (int i = 0; i < N; i++) {
				int r = random(100, 500);
				for (int j = 0; j < i; j++) {
					if (r == coupon[i])
						flag = false;
				}
				if (flag) {
					coupon[i] = r;
				}
			}
			for (int i = 0; i < coupon.length; i++) {
				System.out.println("coupon number " + (i + 1) + " is " + coupon[i]);
			}
		} else {
			System.out.println("invalid input");
		}
		scn.close();
	}
}