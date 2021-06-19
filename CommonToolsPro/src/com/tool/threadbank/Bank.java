package com.tool.threadbank;

public class Bank {
	private String account; //�˺�
	private double balance; //�˻����
	
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
		return "Bank [�˺ţ�" + this.getAccount() + ", ���:" + this.getBalance() + "]";
	}
	
	//���
	public synchronized void saveAccount() {
		/*
		 * �����ڲ�ͬλ�ô����sleep()����
		 * */
		double balance = getBalance();
		balance+=100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����100
		setBalance(balance);
		//���������˻����
		System.out.println("������˻����Ϊ:"+balance);
	}
	
	//ȡ��
	public void drawAccount() {
		/*
		 * �����ڲ�ͬλ�ô����sleep()����
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
			//ȡ200
			setBalance(balance);
			System.out.println("ȡ�����˻���"+balance);
		}
		
	}
}
