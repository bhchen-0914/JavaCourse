package com.object.polymorphism;

public class Dog extends Animal{
	//属性：性别
	private String sex;
	
	//无参构造
	public Dog() {}

	//带参构造
	public Dog(String name,int age, String sex) {
		super(name,age);
		this.setSex(sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//方法：睡觉
	public void sleep() {
		System.out.println("狗在睡觉");
	}
	//方法：吃东西(重写父类)
	@Override
	public void eat() {
		System.out.println("狗喜欢吃骨头");
	}
}
