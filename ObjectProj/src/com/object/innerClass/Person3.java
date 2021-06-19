package com.object.innerClass;


/**
 * 方法内部类
 * @author bhchen3
 *定义在外部方法中的内部类，也被称为局部内部类
 */
public class Person3 {
	
	/*
	 * 方法内部类：
	 * 1.定义在方法内部，作用范围也在方法内
	 * 2.和方法内部成员使用规则一样，class前不能加public，private，protected，static关键字
	 * 3.类中不能包含静态成员
	 * 4，类中可以包含final、abstract修饰的成员
	 * */
	public Object getHeart() {
		class Heart {
			public int age=12;
			
			public String say() {
				return "hello";
			}
			
			public String beats() {
				return +age+"岁的心脏在跳动,"+ say();
			}
		}
		return new Heart().beats();
	}
	

}
