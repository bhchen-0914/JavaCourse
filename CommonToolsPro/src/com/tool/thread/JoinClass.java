package com.tool.thread;
/*
 * -join����
 * -Thread�У�public final void join() 
 * -Thread�У�public final void join(long mills) -�ȴ����߳���ֹ���ʱ��Ϊmills����
 * -���ã��ȴ����ø÷������߳̽��������ִ��
 * */


class ThreadJoin implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"����ִ��"+i);
		}
		System.out.println(Thread.currentThread().getName()+"ִ�н���");
	}
	
}

public class JoinClass {

	public static void main(String[] args) {
		ThreadJoin tJoin = new ThreadJoin();
		Thread t1 = new Thread(tJoin);
		t1.start();
		try {
			t1.join(10);
			//t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=10;i++) {
			System.out.println("���߳�����:"+i);
		}

	}

}