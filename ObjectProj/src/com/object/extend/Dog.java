package com.object.extend;

public class Dog extends Animal{
	private String sex; //dog 特有属性
	
	/**
	 * 无参构造
	 */
	public Dog() {}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//dog特有方法
	public void run() {
		System.out.println(this.getName()+"是个"+this.getSex()+",我在奔跑");
	}
	
	
}
