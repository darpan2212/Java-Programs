package org.vendingmachine;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		int[] note = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Scanner scn = new Scanner(System.in);
		System.out.println("how many change you want?");
		int chg = scn.nextInt(),totcnt = 0;

		for (int i = note.length - 1; i >= 0; i--) {
			while (chg >= note[i]) {
				chg -= note[i];
				cnt[i]++;
			}
			if(chg == 0)
				break;
		}
		System.out.println("|\tNote\t|\treq\t|");
		for (int j = 0; j < cnt.length; j++){
			if(cnt[j]!=0)
				System.out.println("|\t"+note[j]+"\t|\t"+cnt[j]+"\t|");
			totcnt+=cnt[j];
		}
		
		System.out.println("total number of notes to be given by vending machine are : "+totcnt);
		scn.close();
	}

}