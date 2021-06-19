package com.object.encapsulation;
/**
 * static关键字的学习
 * 构造代码块的概念
 * @author bhchen3
 *
 */


public class StaticDeemo {
	public String name;
	/*
	 * 使用static关键字修饰的成员被称为静态成员、类成员（修饰属性时称为类属性，修饰方法时称呼为类方法）
	 * 无论实例化出对少对象，对于static修饰的成员，都共用同一块存储空间
	 * 对于普通成员来说，当类的对象创建并后，相关的成员便产生，当这个对象被销毁后，此成员一并销毁	，进行资源释放
	 *但是对于静态成员，当一个类被加载时产生，只有当这个类被销毁时才会进行资源释放，生命周期长
	 *
	 * */
	public static double price; //静态成员可通过对象访问，也可通过类直接访问
	
	public StaticDeemo(){
		System.out.println("这里是构造方法");
	}
	//构造代码块优先于构造方法进行
	//可以有多个构造代码块
	//构造代码块可以给静态成员和普通成员赋值
	{
		System.out.println("这里是构造代码块1");
	}
	public void test1() {
//		static int temp;  static不可用来修饰局部变量
		this.price=1000; //成员方法可以访问类的静态成员
		System.out.println("price："+this.price);
	}
	
	public static void test2() {
		System.out.println("test2是一个静态方法");
//		this.test1();类方法中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中静态成员，不能使用this关键字
//		name="haha"; 不能访问非静态属性
		
//		如果要强行访问非静态成员，只能通过对象的实例化，使用对象.成员 的形式访问
//		StaticDeemo st=new StaticDeemo();
//		st.name="haha";
		price=99;
		test3();//可直接调用静态方法
	}
	
	public static void test3() {
		System.out.println("现在的price："+price);
	}
	
//静态代码块，静态代码块优先于普通代码块执行
//静态代码块可以为静态成员赋值，普通成员无法赋值
	static {
		System.out.println("这里是静态代码块");
	}
	
}
