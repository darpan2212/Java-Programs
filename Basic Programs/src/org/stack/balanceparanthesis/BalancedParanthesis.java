package org.stack.balanceparanthesis;

import java.util.Scanner;

public class BalancedParanthesis {

	public static boolean balanceStrCheck(String str) {
		Stack st = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case '(':
			case '{':
			case '[':
				st.push(ch);
				break;
			case ')':
				if (st.isEmpty() || !st.pop().equals('('))
					return false;
				break;
			case '}':
				if (st.isEmpty() || !st.pop().equals('{'))
					return false;
				break;
			case ']':
				if (st.isEmpty() || !st.pop().equals('['))
					return false;
				break;
			}
		}
		if (st.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string which you want to check  : ");
		String str = scn.nextLine();
		if (balanceStrCheck(str))
			System.out.println(str + " has balanced paranthesis");
		else
			System.out.println(str + " has not balanced paranthesis");
		scn.close();
	}
}