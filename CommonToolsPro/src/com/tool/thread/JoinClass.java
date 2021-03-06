package com.tool.thread;
/*
 * -join方法
 * -Thread中：public final void join() 
 * -Thread中：public final void join(long mills) -等待该线程终止的最长时间为mills毫秒
 * -作用：等待调用该方法的线程结束后才能执行
 * */


class ThreadJoin implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"正在执行"+i);
		}
		System.out.println(Thread.currentThread().getName()+"执行结束");
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
			System.out.println("主线程运行:"+i);
		}

	}

}
