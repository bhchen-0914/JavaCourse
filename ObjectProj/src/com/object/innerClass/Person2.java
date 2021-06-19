package com.object.innerClass;
/**
 * 静态内部类
 * @author bhchen3
 *
 */

public class Person2 {
	static int age=19;

	public Heart getHeart() {
		return new Heart();	
	}
	
	public void eat() {
		System.out.println("人在吃东西");
	}
	
	public static void walk() {
		System.out.println("人会走路");
	}

	/*
	 * 静态内部类
	 * 1.静态内部类中，只能访问外部类的静态成员,如果需要调用非静态成员，可以通过对象实例调用
	 * 2.静态内部类实例时，可以不依赖于外部对象
	 * 3.访问内部类静态成员，可以通过外部类.静态内部类.静态成员 的方法实现
	 * 4.当内部类与外部类属性同名时，默认直接调用内部类中变量，如果需要访问外部类中静态成员属性，
	 * 	 可以通过外部类.属性 的方法；如果需要访问外部类中非静态属性，则可以通过 new 外部类()。属性的方法实现
	 * */
	public static class Heart {
		static int temp=10;
		int age=20;
		
		public static void say() {
			System.out.println("hello");
		}
		
		public String beats() {
			walk();
			new Person2().eat();
			System.out.println("外部类中的age："+Person2.age);
			return age+"岁的心脏在跳动";
		}
	}

}
