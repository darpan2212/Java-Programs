package org.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortInt {

	public static List<Integer> li = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("Enter integer number to add in list.....");
			int ele = in.nextInt();
			li.add(ele);
			System.out.println("do you want to add another integer???");
			if(in.nextInt()!=1){
				break;
			}
		}while(true);
		
		for (int i = 0; i < li.size(); i++) {
			for (int j = i+1; j < li.size(); j++) {
				if(li.get(i)>li.get(j)){
					int temp = li.get(i);
					li.set(i, li.get(j));
					li.set(j, temp);
				}
			}
		}
		System.out.println("sorted integer list is.....");
		for (int i : li) {
			System.out.println(i);
		}
		
		in.close();
	}
	
}