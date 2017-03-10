package org.twodarray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Enter the numbers of row");
		Scanner scn = new Scanner(System.in);

		if (scn.hasNextInt()) {
			int row = scn.nextInt();
			System.out.println("Enter the numbers of column");
			if (scn.hasNextInt()) {
				int col = scn.nextInt();
				int[][] arr = new int[row][col];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print("Enter value of a[" + i + "][" + j + "] :::==> ");
						if (scn.hasNextInt())
							arr[i][j] = scn.nextInt();
					}
				}
				java.io.PrintWriter wr = new java.io.PrintWriter(System.out);
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						wr.print(arr[i][j] + "\t");
					}
					wr.println();
				}
				wr.flush();
				wr.close();
			}
		}
		scn.close();
	}
}