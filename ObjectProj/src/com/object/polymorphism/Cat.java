package com.object.polymorphism;

public class Cat extends Animal {
	//属性：体重
	private double weight;
	
	//无参构造
	public Cat() {}
	
	//带参构造	
	public Cat(String name,int age,double weight) {
		super(name,age);
		this.setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//方法：跑动
	public void run() {
		System.out.println("猫咪在跑");
	}
	//方法：吃东西(重写父类)
	@Override
	public void eat() {
		System.out.println("猫咪吃鱼");
	}
}
