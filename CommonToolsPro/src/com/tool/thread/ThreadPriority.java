package com.tool.thread;
/**
 * �߳����ȼ�
 * @author bhchen3
 *
 */

class MyThreads extends Thread{
//	private String name;
	public MyThreads(String name) {
		super(name);
	}
	
	@Override
	public void run() {	
		for(int i=1;i<=50;i++) {
			System.out.println("�߳�"+this.getName()+"��������"+i);
		}
	}
}

public class ThreadPriority {
/*
 * ���ȼ�������
 * MAX_PRIORITY:�̵߳�������ȼ�10
 * MIN_PRIORITY:�̵߳�������ȼ�1
 * NORM_PROORITY:�̵߳�Ĭ�����ȼ�5
 * */
	
	/*
	 * ���ȼ���ط�����
	 *public int getPriority() ��ȡ���ȼ��ķ���
	 *public void setProority(int newPriority) �����߳����ȼ��ķ���
	 * */
	public static void main(String[] args) {
		//��ȡ���̵߳����ȼ�
		int mainPriority = Thread.currentThread().getPriority();
		System.out.println("���̵߳����ȼ�Ϊ��"+mainPriority);
		
		MyThreads mThreads1 = new MyThreads("�߳�1");
		MyThreads mThreads2 = new MyThreads("�߳�2");
		mThreads1.setPriority(Thread.MAX_PRIORITY);
		mThreads2.setPriority(Thread.MIN_PRIORITY);
		mThreads1.start();
		mThreads2.start();
		System.out.println(mThreads1.getName()+"���ȼ�Ϊ��"+mThreads1.getPriority());
		System.out.println(mThreads2.getName()+"���ȼ�Ϊ��"+mThreads1.getPriority());
	}

}