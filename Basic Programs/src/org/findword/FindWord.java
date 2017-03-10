package org.findword;

import java.util.List;
import java.util.Scanner;

public class FindWord {

	public static boolean search(String str, List<String> l) {
		int i = 0;
		while (i < l.size()) {
			i++;
			if (str.equals(l.get(i)))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new java.io.File(
				"/home/bridgeit/Desktop/Darpan/Eclipse workspace/JavaPrograms/Basic Programs/src/org/findword/input.txt"));
		Scanner scn = new Scanner(System.in);
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		s.close();
		java.util.Collections.sort(list);

		System.out.println("which word you want to find? : ");
		String str = scn.nextLine();
		scn.close();
		if (search(str, list)) {
			System.out.println("File contains your searched word....");
		} else {
			System.out.println("File does not contains your searched word....");
		}

		for (String string : list) {
			System.out.println(string);
		}
	}
}