package com.tool.thread;

/*
 * ͨ���̳�Thread��ķ�ʽ�����߳��࣬��дrun()����
 * */
class MyThread extends Thread{
	public void run() {
		System.out.println(getName()+"�߳�����ִ�У�");
	}
}

public class ThreadStudy1 {

	public static void main(String[] args) {
		System.out.println("���߳�1");
		MyThread myThread = new MyThread();
		myThread.start(); //�����߳�
//		myThread.start();���׳� IllegalThreadStateException�쳣��һ���߳�ֻ������һ��
		System.out.println("���߳�2");

	}

}
