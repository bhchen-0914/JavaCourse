package com.tool.thread;

/*
 * 通过继承Thread类的方式创建线程类，重写run()方法
 * */
class MyThread extends Thread{
	public void run() {
		System.out.println(getName()+"线程正在执行！");
	}
}

public class ThreadStudy1 {

	public static void main(String[] args) {
		System.out.println("主线程1");
		MyThread myThread = new MyThread();
		myThread.start(); //启动线程
//		myThread.start();会抛出 IllegalThreadStateException异常，一个线程只能启动一次
		System.out.println("主线程2");

	}

}
