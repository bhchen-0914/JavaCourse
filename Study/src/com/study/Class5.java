package com.study;
/*
 * 布尔类型的字面值：只能是true 和  false
* 
 * 字符串不属于基本数据类型，它是一个类，但它有许多基本数据类型的特征
 * 定义字符串的字面值是 通过双引号引起来的0个或多个字符
 * */

public class Class5 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		// 定义布尔类型的变量存放布尔值
		System.out.println("t="+t);
		System.out.println("f="+f);
		
		String str1 = "";
		System.out.println("st1="+str1);
		String str2 = "Hello";
		//字符串拼接
		System.out.println("st1+st2="+str1+str2);
		
		// 定义一个包含unicod字符的字符串
		String str3 = "A\u005a\u006EB";
		System.out.println("st3="+str3);
		
		// 定义一个包含空格的字符串
		String str4 = "123  Hello";
		System.out.println("st4="+str4);
		
	}

}
