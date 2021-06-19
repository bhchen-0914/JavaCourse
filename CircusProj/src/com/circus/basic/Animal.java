package com.circus.basic;

/**
 * 抽象父类，用于规定实现子类行为
 * @author bhchen3
 *
 */
public abstract class Animal {
	private String name;
	private int age;
	
	//无参构造
	public Animal() {
		
	}

	//带餐构造
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 抽象方法，描述喜好
	 */
	public abstract String love();
	
}
