package org.factor;

import java.util.Scanner;

public class PrimeFactors {

	public static boolean checkPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean checkFactor(int multiple, int multiplier) {
		return multiple % multiplier == 0;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the integer number");
		if (scn.hasNextInt()) {
			int N = scn.nextInt();
			System.out.println("Prime factors for given number are :");
			for (int i = 2; i <= N / 2; i++) {
				if ((checkFactor(N, i)) && (checkPrime(i))) {
					System.out.print(i + "\t");
				}
			}
		} else {
			System.err.println("Enter integers only");
		}
		scn.close();
	}
}