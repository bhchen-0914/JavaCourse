package com.tool.threadbank;

public class Test {
/*
 * 为保证在存款或取款的时候，不允许其他线程对账户余额进行操作
 * 需要将bank对象进行锁定
 * 使用关键字synchronized实现
 * */
	
/*
 * synchronized关键字可以用在成员方法、静态方法、语句块中
 * -public synchronized void saveAccount(){}
 * -public static synchronized void saveAccount(){}
 * -synchronized(object){...}
 * */
	public static void main(String[] args) {
		// 创建账户，设定余额为1000
		Bank bank = new Bank("B1001", 1000);
		
		//创建线程对象
		SaveAccount sa = new SaveAccount(bank);
		DrawAccount da = new DrawAccount(bank);
		Thread saveThread = new Thread(sa,"SaveThread");
		Thread drawThread = new Thread(da,"DrawThread");
		saveThread.start();
		drawThread.start();
		 
		
		//使用join方法是为了让后面主线程的print方法后打印
		try {
			saveThread.join();
			drawThread.join();			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bank);

	}

}
