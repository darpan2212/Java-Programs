package org.catalan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfBinaryTree {

	public static List<Integer> factorial(int num) {

		List<Integer> il = null;
		if (il == null)
			il = new ArrayList<Integer>();

		il.add(num);
		if (num == 0 | num == 1)
			return il;
		else
			return factorial(num - 1);
	}

	public static long catalan(int n) {
		if (n == 1)
			return 1; // since c(1)=1 is my base case
		else {
			return ((catalan(--n) * (2 * n + 2) * (2 * n + 1)) / ((n + 1) * (n + 2)));
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int[] N = new int[T];
		long[] NOB = new long[T];

		for (int i = 0; i < N.length; i++) {
			N[i] = scn.nextInt();
			NOB[i] = catalan(N[i]);
		}
		for (int i = 0; i < NOB.length; i++) {
			System.out.println(NOB[i]);
		}
	}
}