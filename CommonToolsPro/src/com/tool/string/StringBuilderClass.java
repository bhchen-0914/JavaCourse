package com.tool.string;

/*
 * String具有不可变性，而StringBuilder不具备
 * 当频繁操作字符串时，建议使用StringBuilder
 * */

/*
 * StringBuilder和StringBuffer二者基本相似
 * StringBuffer是线程安全的，StringBuilder则没有，性能略高
 * */

public class StringBuilderClass {

	public static void main(String[] args) {
		//定义一个字符串“hello”
		StringBuilder str=new StringBuilder("hello");
		
		//加入内容，将"hello"变为"hello，world!"
		str.append(',').append("world！");
		System.out.println("str:"+str);
		
		//将字符串变为"hello，WOELD！"
		//方法1，使用delete删除world，再插入WORLD
		System.out.println("替换后："+str.delete(6, 11).insert(6, "WORLD"));
		
		//初始化
		str=new StringBuilder("hello,world！");
		
		//方法2：使用replace方法替换
		System.out.println("替换后："+str.replace(6, 11, "WORLD"));
		
		//在上述字符串中取出 hello并输出
		System.out.println(str.substring(0, 5));
	}

}
