package org.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Stock {
	private int index;
	private int noOfShare;
	private String shareName;
	private double sharePrice;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
}

public class StockReport {
	public static List<Stock> stockList = new ArrayList<Stock>();

	public static void main(String[] args) {
		System.out.println("How many stocks do you have?");
		Scanner in = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			Stock st = new Stock();
			st.setIndex(i);
			System.out.print("Enter share name : ");
			String shareName = inStr.nextLine();
			st.setShareName(shareName);
			System.out.print("Enter the number of shares you have : ");
			st.setNoOfShare(in.nextInt());
			System.out.print("Enter the share price : ");
			st.setSharePrice(in.nextDouble());
			stockList.add(st);
		}
		double sum = 0.0D;
		System.out.println("index|\tname|\tno.of share|\tprice|\ttotal value");
		for (Stock stock : stockList) {
			double tvalue = stock.getSharePrice() * stock.getNoOfShare();
			System.out.println(stock.getIndex() + "|\t" + stock.getShareName() + "|\t" + stock.getNoOfShare() + "|\t"
					+ stock.getSharePrice() + "|\t" + tvalue);
			sum += tvalue;
		}

		System.out.println("your total stocks value are : " + sum);
		in.close();
		inStr.close();
	}
}