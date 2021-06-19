package com.tool.threatCommunication;

public class Consumer implements Runnable{
	Queue queue;
	public Consumer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			queue.reduceNumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
