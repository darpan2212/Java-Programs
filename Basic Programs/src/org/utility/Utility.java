package org.utility;

public class Utility {

	public int binarySearchInt(int[] a, int ele) {

		System.out.println("This method would work only on sorted list.....");
		int min = 0, max = (a.length - 1);
		while (max >= min) {
			int guess = (min + max) / 2;

			if (ele == a[guess]) {
				return guess;
			} else if (a[guess] < ele) {
				min = guess + 1;
			} else {
				max = guess - 1;
			}
		}
		return -1;
	}

	public int binarySearchStr(String[] a, String ele) {
		System.out.println("This method would work only on sorted list.....");
		int min = 0, max = (a.length);
		while (max >= min) {
			int guess = (min + max) / 2;

			if (ele.equals(a[guess])) {
				return guess;
			} else if (a[guess].compareTo(ele) < 0) {
				min = guess + 1;
			} else {
				max = guess - 1;
			}
		}
		return -1;
	}

	public void insertionSortInt(int[] a){
		for (int i = 1; i < a.length; i++) {
			int index = a[i],j=i-1;
			while (j>=0 && a[j]>index) {
				
			}
		}
	}
	
	public static void main(String[] args) {

		Utility ut = new Utility();
		int[] arr = { 7, 11, 13, 17, 19, 23, 29 };
		System.out.println(ut.binarySearchInt(arr, 19));

		String[] str = {"a","b","ca","cb","da","dd"};
		System.out.println(ut.binarySearchStr(str, "cc"));
	}

}