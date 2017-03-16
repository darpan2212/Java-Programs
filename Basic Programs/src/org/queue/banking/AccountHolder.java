package org.queue.banking;

public class AccountHolder {

	private String owner; // person or business
	private double balance;

	protected AccountHolder(String own, int cash) {
		owner = own;
		balance = cash;
		System.err.println(owner + " you are added in Queue.....");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String own) {
		owner = own;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double cash) {
		balance = cash;
	}

	public String toString() {
		return new StringBuilder("Account Details: ").append(" | Account owner: ").append(this.owner)
				.append(" | Account balance: $").append(this.balance).toString();
	}

}