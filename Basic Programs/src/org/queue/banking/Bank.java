package org.queue.banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	public static ArrayList<AccountHolder> ac = new ArrayList<AccountHolder>();
	int bankCash = 0;
	Scanner sc = new Scanner(System.in);

	public ArrayList<AccountHolder> addAcc(AccountHolder acc) {
		ac.add(acc);
		return ac;
	}

	public int getsize() {
		return ac.size();
	}

	public void operation() {
		int i = 0;
		while (i < ac.size()) {

			System.out.println(ac.get(i).getOwner() + " Which operation Do you want to perform: (Withdraw/Deposit)");
			String st = sc.next();
			if (st.equalsIgnoreCase("Withdraw")) {
				System.out.println("Enter Amount to withdraw:");
				double amt = sc.nextDouble();
				double bal = ac.get(i).getBalance();
				if (amt > bal) {
					System.out.println("Insufficient Balance.....");
					ac.remove(i);

				} else {

					ac.get(i).setBalance(bal - amt);
					System.out.print(
							ac.get(i).getOwner() + " " + amt + " rupee Sucessfully Withdraw from your account...");
					System.out.println("Do you want to check Account details: (Yes/No)");
					String st1 = sc.next();
					if (st1.equalsIgnoreCase("yes")) {
						checkDetail(ac.get(i).getOwner());
						ac.remove(i);

					} else if (st1.equalsIgnoreCase("No")) {
						ac.remove(i);

					}
				}

			} else if (st.equalsIgnoreCase("Deposit")) {

				System.out.println("Enter Amount to Deposit:");
				double amt = sc.nextDouble();
				double bal = ac.get(i).getBalance();
				ac.get(i).setBalance(bal + amt);
				System.out.print(ac.get(i).getOwner() + " " + amt + " rupee Sucessfully Deposited in your account...");
				System.out.println("Do you want to check Account details: (Yes/No)");
				String st1 = sc.next();
				if (st1.equalsIgnoreCase("yes")) {
					checkDetail(ac.get(i).getOwner());
					ac.remove(i);

				} else {
					ac.remove(i);
				}
			}
			System.out.println(getsize());
		}
	}

	public void checkDetail(String name) {
		for (int i = 0; i < ac.size(); i++) {
			if (ac.get(i).getOwner().equalsIgnoreCase(name)) {
				System.out.println(
						"Account Holder Name: " + ac.get(i).getOwner() + ", Balance: " + ac.get(i).getBalance());
			}
		}
	}

}