package com.tool.threatCommunication;
/*
 * ʵ��һ����һ����
 * */

/*
 * �̼߳�ͨ�ţ�
 * -wait()�������жϷ�����ִ�У�ʹ�̵߳ȴ�
 * -notify()���������Ѵ��ڵȴ���ĳһ�̣߳�ʹ������ȴ�
 * -notifyAll()����:���Ѵ��ڵȴ��������̣߳�ʹ���ǽ����ȴ�
 * */
public class Test {

	public static void main(String[] args) {
		Queue queue = new Queue();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();

	}

}
