package org.username;

import java.util.Scanner;

public class UserName {
	public UserName() {
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String uname = scn.nextLine();
		if (uname.length() < 3) {
			System.err.println("username must be greater than three character long");
			main(null);
		} else {
			System.out.println("Hello " + uname + ", How are you?");
		}
		scn.close();
	}
}