package com.tool.threatCommunication;
/*
 * 实现一生产一消费
 * */

/*
 * 线程间通信：
 * -wait()方法：中断方法的执行，使线程等待
 * -notify()方法：唤醒处于等待的某一线程，使其结束等待
 * -notifyAll()方法:唤醒处于等待的所有线程，使他们结束等待
 * */
public class Test {

	public static void main(String[] args) {
		Queue queue = new Queue();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();

	}

}
