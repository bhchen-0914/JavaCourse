package com.tool.threadbank;

public class Bank {
	private String account; //账号
	private double balance; //账户余额
	
	public Bank(String account,double balance) {
		this.setAccount(account);
		this.setBalance(balance);
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [账号：" + this.getAccount() + ", 余额:" + this.getBalance() + "]";
	}
	
	//存款
	public synchronized void saveAccount() {
		/*
		 * 可以在不同位置处添加sleep()方法
		 * */
		double balance = getBalance();
		balance+=100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//存入100
		setBalance(balance);
		//输出存款后的账户余额
		System.out.println("存款后的账户余额为:"+balance);
	}
	
	//取款
	public void drawAccount() {
		/*
		 * 可以在不同位置处添加sleep()方法
		 * */
		synchronized (this) {
			double balance = getBalance();
			balance-=200;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//取200
			setBalance(balance);
			System.out.println("取款后的账户余额："+balance);
		}
		
	}
}
