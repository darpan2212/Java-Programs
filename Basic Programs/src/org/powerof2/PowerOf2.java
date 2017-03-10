package org.powerof2;

public class PowerOf2 {

	public static int pow(int base, int power) {
		int temp = base;
		if (power == 0) {
			return 1;
		}
		while (power > 1) {
			base *= temp;
			power--;
		}
		return base;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		if (N > 30) {
			System.err
					.println("You should not give greater value than 30 because 2^31 will overflows an INTEGER limit");
		} else {
			for (int i = 0; i <= N; i++) {
				System.out.println(i + "\t" + pow(2, i));
			}
		}
	}
}