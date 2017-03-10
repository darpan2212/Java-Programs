package org.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static int countDigit(int num) {
		int cnt = 0;
		while (num > 0) {
			num /= 10;
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the year");
		if (scn.hasNextInt()) {
			int year = scn.nextInt();
			if (countDigit(year) == 4) {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					System.out.println("Your entered year is a leap year");
				} else {
					System.out.println("Your entered year is not a leap year");
				}
			} else {
				System.err.println("Enter valid year with 4 digits only");
			}
		}
		scn.close();
	}
}