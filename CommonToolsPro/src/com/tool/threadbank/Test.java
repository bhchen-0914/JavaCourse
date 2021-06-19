package com.tool.threadbank;

public class Test {
/*
 * Ϊ��֤�ڴ���ȡ���ʱ�򣬲����������̶߳��˻������в���
 * ��Ҫ��bank�����������
 * ʹ�ùؼ���synchronizedʵ��
 * */
	
/*
 * synchronized�ؼ��ֿ������ڳ�Ա��������̬������������
 * -public synchronized void saveAccount(){}
 * -public static synchronized void saveAccount(){}
 * -synchronized(object){...}
 * */
	public static void main(String[] args) {
		// �����˻����趨���Ϊ1000
		Bank bank = new Bank("B1001", 1000);
		
		//�����̶߳���
		SaveAccount sa = new SaveAccount(bank);
		DrawAccount da = new DrawAccount(bank);
		Thread saveThread = new Thread(sa,"SaveThread");
		Thread drawThread = new Thread(da,"DrawThread");
		saveThread.start();
		drawThread.start();
		 
		
		//ʹ��join������Ϊ���ú������̵߳�print�������ӡ
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
