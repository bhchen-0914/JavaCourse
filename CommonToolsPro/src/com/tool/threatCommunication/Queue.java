package com.tool.threatCommunication;
/**
 * ��Ʒ
 * @author bhchen3
 *
 */
public class Queue {
	private int number;
	boolean flag = false; //�Ƿ������������Ʒ
	
	public synchronized int reduceNumber() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("��������:"+this.number);
		flag = false; // �������
		notifyAll();//�����߳�
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
		System.out.println("��������:"+number);
		this.number = number;
		flag = true; //������ϣ�����������Ʒ
		notifyAll();//�����߳�
	}
	

}
