package com.tool.threadbank;
/**
 * ȡ��
 * @author bhchenw3
 *
 */
public class DrawAccount implements Runnable {
	Bank bank;
	
	public DrawAccount(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		this.bank.drawAccount();

	}

}
