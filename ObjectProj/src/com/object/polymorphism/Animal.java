package com.object.polymorphism;

/*
 * abstract关键字定义一个抽象类
 * 抽象类不允许被实例化，但可以向上转型，指向子类实例
 * 抽象类使用场景：
 * 某个父类作用限制子类必须具备某些方法，但无需直到子类具体如何实现方法，可限制子类的设计，也可以限制父类无意义的实例化
 * */

public abstract class Animal {
	private String name;
	private int age;
	
	//无参构造
	public Animal() {}
	
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//方法：吃东西
	//抽象方法：不需要实现，不允许包含方法体；子类中必须重写此方法，否则子类也是抽象类
	//抽象方法必须定义在抽象类中
	//private,static,final修饰符不能与abstract关键字同时存在
	public abstract void eat();
	
	
}
