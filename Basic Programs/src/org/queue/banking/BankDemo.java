package org.queue.banking;

public class BankDemo {

	public static void main(String[] args) {
	
		AccountHolder ac = new AccountHolder("Uma", 105100);
		AccountHolder ac1 = new AccountHolder("Amit", 20145);
		AccountHolder ac2 = new AccountHolder("Kartik", 2415);
		AccountHolder ac3 = new AccountHolder("Martin", 4501);
		AccountHolder ac4 = new AccountHolder("Krish", 8458);
		AccountHolder ac5 = new AccountHolder("Natasa", 7100);
		Bank bank = new Bank();
		bank.addAcc(ac);
		bank.addAcc(ac1);
		bank.addAcc(ac2);
		bank.addAcc(ac3);
		bank.addAcc(ac4);
		bank.addAcc(ac5);
		bank.operation();

	}

}