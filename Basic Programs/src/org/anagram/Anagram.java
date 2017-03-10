package org.anagram;

import java.util.Scanner;

public class Anagram {

	public static boolean checkAnagram(String a, String b) {
		int[] first = new int[26];
		int[] second = new int[26];
		for (int i = 0; i < a.length(); i++) {
			first[(a.charAt(i) - 'a')] += 1;
		}
		for (int i = 0; i < a.length(); i++) {
			second[(b.charAt(i) - 'a')] += 1;
		}

		return java.util.Arrays.equals(first, second);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = null;
		String b = null;
		if (scn.hasNextLine()) {
			a = scn.nextLine();
			if (scn.hasNextLine()) {
				b = scn.nextLine();
			}
		}

		if (checkAnagram(a, b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
		scn.close();
	}
}