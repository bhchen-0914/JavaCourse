package com.object.innerClass;
/**
 * 成员内部类
 * @author bhchen3
 *
 */

//外部类
public class Person {
	int age;

	public Heart getHeart() {
		return new Heart();	
	}
	
	public void eat() {
		System.out.println("人在吃东西");
		new Heart().temp=10; //外部类访问内部类信息，需要通过内部类实例
	}
	
	/*
	 * 成员内部类
	 * 1.内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
	 * 2.内部类可以使用任意访问修饰符，但访问范围会收到影响 
	 * 3。内部类可以直接使用外部类实例的成员属性与方法,若出现同名属性，则优先访问内部类中定义的属性
	 * 4.可以使用外部类.this.成员属性，访问外部类中同名信息
	 * 5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
	 * 6.内部类编译后.class文件命名：外部类	$内部类.class
	 * */	
	public class Heart {
		int temp=10;
		int age=20;
		
//		public void eat() {
//			System.out.println("内部类的eat");
//		}
		
		public String beats() {
			eat();
			return Person.this.age+"岁的心脏在跳动"; //外部类.this.成员属性 可指定访问外部类属性
			
		}
	}

}
