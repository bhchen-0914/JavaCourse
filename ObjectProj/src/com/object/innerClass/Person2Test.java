package com.object.innerClass;

public class Person2Test {

	public static void main(String[] args) {
		//获取静态内部类对象实例，可以不通过外部类的对象实例
		Person2.Heart heart=new Person2.Heart();
		System.out.println(heart.beats());
		heart.say();
		Person2.Heart.say(); //访问内部类静态成员时，可以通过外部类.静态内部类.静态成员
	}

}
