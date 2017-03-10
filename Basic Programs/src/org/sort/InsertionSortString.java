package org.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSortString {

	public static List<String> strList = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		do {
			System.out.println("Enter your string which you want to add in list....");
			String s = scn.nextLine();
			strList.add(s);
			System.out.println("do you want to add another string");

			if (!scn.nextLine().equals("y")) {
				break;
			}
		} while (true);
		
		for (int i = 1; i < strList.size(); i++) {
				String index = strList.get(i); int j = i-1;
				while(j>=0 && (strList.get(j).compareTo(index)>0)){
					strList.set(j+1, strList.get(j));
					j--;
				}
				strList.set(j+1, index);
		}
		System.out.println("Sorted string list is........");
		for (String ele : strList) {
			System.out.println(ele);
		}
		scn.close();
	}

}