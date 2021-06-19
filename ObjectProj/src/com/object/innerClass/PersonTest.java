package com.object.innerClass;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person tom=new Person();
		tom.age=18;
		//获取内部类实例对象，方法1：new 外部类.new 内部类
		Person.Heart heart1=new Person().new Heart();
		System.out.println(heart1.beats());
		
		System.out.println("=============================");
		
		//获取内部类实例对象，方法2：外部类对象.new 内部类
		Person.Heart heart2=tom.new Heart();
		System.out.println(heart2.beats());
		
		System.out.println("=============================");
		
		//获取内部类实例对象，方法3：外部类对象.获取方法()
		Person.Heart heart3=tom.getHeart();
		System.out.println(heart3.beats());
	}

}
