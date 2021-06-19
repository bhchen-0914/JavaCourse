package com.tool.string;


/**
 * 
 * @author bhchen3
 *==运算符和equals方法的区别
 */
public class StringClass4 {

	public static void main(String[] args) {
		// 定义3个字符串，内容都一样
		String str1="hello world";
		String str2="hello world";
		String str3=new String("hello world");
		
		System.out.println("str1和str2内容是否相同："+str1.equals(str2));
		System.out.println("str1和str3内容是否相同："+str1.equals(str3));
		System.out.println("str1和str2地址是否相同："+(str1==str2));
		System.out.println("str1和str3地址是否相同："+(str1==str3));

	}

}
