package com.wipro.bank.entity;

public class Account {
	private int accountID;
	private String userName;
	private double balance;
	public Account()
	{
		this.accountID = 0;
		this.userName = "";
		this.balance = 0;
	}
	public Account(int accountID,String userName,double balance)
	{
		this.accountID = accountID;
		this.userName = userName;
		this.balance = balance;
	}
	
	public int getID()
	{
		return this.accountID;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public String getName()
	{
		return this.userName;
	}
	
	public void print()
	{
		System.out.println("ID:"+this.accountID);
		System.out.println("Name:"+this.userName);
		System.out.println("Balance:"+this.balance);
	}
}


