package com.object.extend;
/**
 * 继承的初始化顺序
 * @author bhchen3
 *
 */

/*
 * 继承的初始化顺序：
 * ①初始化父类静态成员
 * ②初始化子类静态成员
 * ③父类对象构造(初始化父类成员属性->访问父类构造代码块->父类无参构造方法)
 * ④子类对象构造(初始化子类成员属性->访问子类构造代码块->子类无参构造方法)
 * 
 * 访问修饰符不影响成员加载顺序，跟书写位置有关
 * */
public class Father {
	public int temp=3;
	
	private String name;
	private int age;
	
	public Father(){
		System.out.println("我是父类的无参构造方法");
	}
	
	
	
	public Father(String name, int age) {
		System.out.println("我是父类的带参构造方法");
		this.setAge(age);
		this.setName(name);
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
	private static int num1=22;
	public static int num2=23;
	
	static {
		System.out.println("我是父类的静态代码块");
	}
	
	{
		System.out.println("我是父类的构造代码块");
	}
	
	
}
