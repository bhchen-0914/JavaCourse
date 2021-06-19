package com.object.animal;


/**
 * 初识面向对象
 * 宠物猫类
 * @author bhchen3
 *
 */
public class Cat {
	//成员属性：名字、年龄、体重、品种
	String name;
	int age;
	double weigth;
	String type;
	
	//方法：跑，叫，吃东西
	public void run() {
		System.out.println("Cat is running");
	}
	
	public void speek() {
		System.out.println("mew~mew~");
	}
	
	public void eat() {
		System.out.println("Cat eat fish");
	}
	//重载run方法
	public void run(String name) {
		System.out.println(name+" is running");
	}
	
	//重载eat方法
	public void eat(String name,String food) {
		System.out.println(name+" is eating "+food);
	}
}
