package com.ThreadDome;

public class BankDome
{
	public static void main(String[] args)
	{
		Bank bank=new Bank();
		bank.setMoney(200);
		System.out.println("银行有200块");
		
		Thread accountant=new Thread(bank);
		accountant.setName("会计");
		
		Thread cashier=new Thread(bank);
		cashier.setName("出纳");
		
		accountant.start();
		cashier.start();
	}
}
