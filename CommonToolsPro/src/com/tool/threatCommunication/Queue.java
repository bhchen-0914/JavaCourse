package com.tool.threatCommunication;
/**
 * 商品
 * @author bhchen3
 *
 */
public class Queue {
	private int number;
	boolean flag = false; //是否存在已生产商品
	
	public synchronized int reduceNumber() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费数量:"+this.number);
		flag = false; // 消费完毕
		notifyAll();//唤醒线程
		return number;
	}
 
	public synchronized void addNumber(int number) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("生产数量:"+number);
		this.number = number;
		flag = true; //生产完毕，已有生产商品
		notifyAll();//唤醒线程
	}
	

}
