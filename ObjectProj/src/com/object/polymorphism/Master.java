package com.object.polymorphism;

public class Master {
	/*
	 * 主人类：
	 * 1.喂猫：吃完东西后，跑一跑
	 * 2.喂狗：吃完东西后，睡觉
	 * */
	
	//feed方法：传入父类，通过方法中类型转换，调用指定子类方法
	public void feed(Animal animal) {
		animal.eat();
		if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
			cat.run();
		}else if (animal instanceof Dog) {
			Dog dog=(Dog)animal;
			dog.sleep();
		}
	}
	
	/*
	 * 判断养宠物
	 * 空闲时间多：养狗
	 * 空闲时间少：养猫
	 * */
	public Animal raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("时间较多，适合养狗");
			return new Dog();
		}else {
			System.out.println("时间较少，适合养猫");
			return new Cat();
		}
	}
}	
