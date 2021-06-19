package com.study6_method;

/*
 * 所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块
 * 方法的声明语法：
 * 访问修饰符 返回类型 方法名（参数列表）{
 * 		方法体
 * }
 * 根据方法是否带参与返回值，可分为类：
 * 1.无参无返回值
 * 2.无参带返回值
 * 3.带参无返回值
 * 4.带参带返回值
 * */


public class Class1 {
	//方法的定义是在类的内部
	// 无参无返回值方法
	//一行打印输出一串星号
	public void starPrint() {
			System.out.println("***************");
		}

	public static void main(String[] args) {
		//创建一个Class1 类的对象 class1
		Class1 class1 = new Class1();
		//使用对象名.方法名()调用方法
		class1.starPrint();
		System.out.println("HELLO JAVA!!");
		class1.starPrint();
	}
}
