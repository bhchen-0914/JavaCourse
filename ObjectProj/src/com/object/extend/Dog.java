package com.object.extend;

public class Dog extends Animal{
	private String sex; //dog ��������
	
	/**
	 * �޲ι���
	 */
	public Dog() {}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//dog���з���
	public void run() {
		System.out.println(this.getName()+"�Ǹ�"+this.getSex()+",���ڱ���");
	}
	
	
}
