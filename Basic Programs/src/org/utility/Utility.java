package org.utility;

import org.stopwatch.StopWatch;

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

	public void insertionSortInt(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int index = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > index) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = index;
		}
	}

	public void insertionSortStr(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String index = a[i];
			int j = i - 1;
			while (j >= 0 && (a[j].compareTo(index)) > 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = index;
		}
	}

	public void bubbleSortInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void bubbleSortStr(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[i]) < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		StopWatch st = new StopWatch();

		Utility ut = new Utility();
		int[] arr =new int[100000];
		for (int i = 0; i < arr.length; i=(i+2)*2) {
			arr[i] = i;
		}
		st.start();
		int flag = ut.binarySearchInt(arr, 19);
		st.stop();
		if (flag >= 0)
			System.out.println("your search element at position : " + flag);
		else
			System.out.println("your search element is not there......");
		System.out.println("Elapsed time for binarysearch int : " + st.getElapsedTime());
		String[] str = { "a", "b", "ca", "cb", "da", "dd" };

		st.start();
		flag = ut.binarySearchStr(str, "cc");
		st.stop();
		if (flag >= 0)
			System.out.println("your search element at position : " + flag);
		else
			System.out.println("your search element is not there......");
		System.out.println("Elapsed time for binarysearch string : " + st.getElapsedTime());

		int[] a = { 5, 6, 9, 7, 3, 11, 10 };
		st.start();
		ut.bubbleSortInt(a);
		st.stop();
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("Elapsed time for bubblesort int : " + st.getElapsedTime());

		String[] as = { "cd", "fd", "abc", "op", "po", "bc" };
		st.start();
		ut.bubbleSortStr(as);
		st.stop();
		for (String string : as) {
			System.out.println(string);
		}
		System.out.println("Elapsed time for binarysearch String : " + st.getElapsedTime());
		int[] intArr = { 5, 6, 9, 7, 3, 11, 10 };
		st.start();
		ut.insertionSortInt(intArr);
		st.stop();
		for (int i : intArr) {
			System.out.println(i);
		}
		System.out.println("Elapsed time for insertionsort int : " + st.getElapsedTime());

		String[] strArr = { "cd", "fd", "abc", "op", "po", "bc" };
		st.start();
		ut.insertionSortStr(strArr);
		st.stop();
		for (String string : strArr) {
			System.out.println(string);
		}
		System.out.println("Elapsed time for insertionsort int : " + st.getElapsedTime());
	}
}