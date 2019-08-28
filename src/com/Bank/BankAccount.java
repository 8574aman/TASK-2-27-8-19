package com.Bank;

public class BankAccount {

	private int accno;
	private String acname;
	private double balance;
	private String accType;
	private static double totalDeposit = 0;
	private static double totalWithdrawl = 0;

	public BankAccount(int accno, String acname, double balance, String accType) {
		this.accno = accno;
		this.acname = acname;
		this.balance = balance;
		this.accType = accType;

	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void showDetails() {

		System.out
				.println(accno + " " + acname + " " + balance + " " + accType);
	}

	public void withdrawMoney(double bal) {

		this.balance = this.balance - bal;
		System.out.println("Current Balance  of" + this.acname
				+ " after withdrawl of Rs." + bal + " is " + balance);
		totalWithdrawl = totalWithdrawl + bal;

	}

	public void depositMoney(double bal) {
		this.balance = this.balance + bal;
		System.out.println("Current Balance of " + this.acname
				+ " after Deposit of Rs." + bal + " is " + balance);
		totalDeposit = totalDeposit + bal;

	}

	public static void computeAvg(BankAccount... obj) {
		double total = 0;
		for (BankAccount avg : obj) {
			total = total + avg.balance;
		}
		System.out.println("Average Balance=" + total / obj.length);
	}

	public void transactionAmount() {
		System.out.println("Total Transaction Amount");
		System.out.println("*************************************");
		System.out.println("Total Deposited Amount=" + totalDeposit);
		System.out.println("Total withdrawn Amount=" + totalWithdrawl);
	}

	public static void main(String[] ar) {
		BankAccount account1 = new BankAccount(101, "Ross", 8453.20,
				"Current Account");
		BankAccount account2 = new BankAccount(102, "Watson", 9047,
				"Saving Account");
		BankAccount account3 = new BankAccount(103, "Malcom", 10061,
				"Current Account");
		BankAccount account4 = new BankAccount(104, "Stark", 57640,
				"Saving Account");

		System.out.println("Bank Customers_____________");
		System.out
				.println("...........................................................................");

		account1.showDetails();
		account2.showDetails();
		account3.showDetails();
		account4.showDetails();

		System.out
				.println("...........................................................................");
		account1.withdrawMoney(500);
		// account1.showDetails();

		account1.depositMoney(1000);
		// account1.showDetails();

		System.out
				.println("...........................................................................");
		computeAvg(account1, account2, account3);

		System.out
				.println("...........................................................................");

		account1.transactionAmount();
	}

}