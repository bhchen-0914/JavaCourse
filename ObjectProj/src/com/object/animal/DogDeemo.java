package com.object.animal;


/**
 * 构造方方法
 * @author bhchen3
 * this关键字
 *
 */
public class DogDeemo {
/*
 * 1.构造方法与类名同名且没有返回值
 * 2.语法格式：访问修饰符  构造方法名(“可指定参数”){}
 * 3.只能在对象实例化的时候调用
 * 4.当没有构造方法时，系统会自动添加无参的构造方法
 * 5.当有指定构造方法，无论带参或无参，都不会自动添加无参构造方法
 * 6.一个类可以有多个构造方法
 * */
	
	String name;
	int age;
	double weight;
	//手动添加无参构造方法
	public DogDeemo() {
		System.out.println("这是无参构造方法");
	}
	
	public DogDeemo(String newname, int newage) {
		//根据赋值的就近原则，如果方法参数与类变量的变量名一致，无法初始化类变量
		name=newname;
		age=newage;
		System.out.println("这里是带参构造方法");
	}
	
	//this作用类似与python中的self
	public DogDeemo(String name, int age, double weight) {
		System.out.println("这里是使用this关键字的构造方法");
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	//在构造方法中调用另一个构造方法，使用this(参数列表)完成
	public DogDeemo(int age) {
		this("aaa",2);
	}
	
	public void eat() {
		System.out.println(this.name+" is eating");
		this.run();
	}
	
	public void run() {
		System.out.println(this.name+" is running");
	}
}
