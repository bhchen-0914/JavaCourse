package com.tool.thread;

class MyThread2 extends Thread{
	public MyThread2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println(this.getName()+" is running "+i);
		}
	}
}

public class ThreadStudy2 {	

	public static void main(String[] args) {
		MyThread2 mThread1 = new MyThread2("线程1");
		MyThread2 mThread2 = new MyThread2("线程2");
		mThread1.start();
		mThread2.start();
	}

}
