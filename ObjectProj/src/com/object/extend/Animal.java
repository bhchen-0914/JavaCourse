package com.object.extend;
/**
 * Animal父类，供子类继承
 * 方法的重写
 * @author bhchen3
 *
 */

public class Animal {
/*
 * 一个子类只能继承一个父类(单继承)
 * 子类可以继承父类的非私有成员
 * */
	
	
/*
 * 访问修饰符
 * private：只允许本类中进行访问(访问权限最小)
 * public:允许在任意位置访问(访问权限最大)
 * protect:允许当前类、同包子类、跨包子类、同包非子类调用，跨包非子类不能调用
 *    默认访问权限：允许在当前类、同包子类/非子类调用，跨包子类/非子类不能调用
 * */
	
	
	private String name;
	private int age;
	String color;
	
	/**
	 * 无参构造
	 * 父类的构造方法不允许被继承，不允许被重写
	 * 但是父类构造会影响子类的实例化
	 */
	public Animal() {}
	
	public Animal(String name,int age) {
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
	
	public void myShow() {
		System.out.println(this.getName()+"is a Animal");
	}
	
}
