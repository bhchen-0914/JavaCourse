package com.tool.thread;
/**
 * 线程优先级
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
			System.out.println("线程"+this.getName()+"正在运行"+i);
		}
	}
}

public class ThreadPriority {
/*
 * 优先级常量：
 * MAX_PRIORITY:线程的最高优先级10
 * MIN_PRIORITY:线程的最低优先级1
 * NORM_PROORITY:线程的默认优先级5
 * */
	
	/*
	 * 优先级相关方法：
	 *public int getPriority() 获取优先级的方法
	 *public void setProority(int newPriority) 设置线程优先级的方法
	 * */
	public static void main(String[] args) {
		//获取主线程的优先级
		int mainPriority = Thread.currentThread().getPriority();
		System.out.println("主线程的优先级为："+mainPriority);
		
		MyThreads mThreads1 = new MyThreads("线程1");
		MyThreads mThreads2 = new MyThreads("线程2");
		mThreads1.setPriority(Thread.MAX_PRIORITY);
		mThreads2.setPriority(Thread.MIN_PRIORITY);
		mThreads1.start();
		mThreads2.start();
		System.out.println(mThreads1.getName()+"优先级为："+mThreads1.getPriority());
		System.out.println(mThreads2.getName()+"优先级为："+mThreads1.getPriority());
	}

}
