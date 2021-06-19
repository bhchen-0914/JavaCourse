package com.tool.threadbank;
/**
 * ´æ¿î
 * @author bhchen3
 *
 */
public class SaveAccount implements Runnable {	
	Bank bank;
	
	public SaveAccount(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		this.bank.saveAccount();

	}

}
