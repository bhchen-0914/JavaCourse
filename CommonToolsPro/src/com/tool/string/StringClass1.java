package com.tool.string;
/**
 * 
 * @author bhchen3
 *String常用方法
 */
public class StringClass1 {
	/*
	 * 求长度方法：length()
	 * 求子串方法：substring()
	 * 求特定位置字符方法：charAt()
	 * */
	public static void main(String[] args) {
		//定义一个字符串"Java 编程 基础"
		String str="Java 编程 基础";
		
		//输出字符串长度
		System.out.println("字符串的长度是："+str.length());
		
		//输出特定字符 程：charAt(int index),索引下标从0开始
		System.out.println("特定字符："+str.charAt(6));
		
		//取出子串“编程 基础”并输出：substring()
		System.out.println("子串："+str.substring(5)); //索引位置到结束
		System.out.println("子串："+str.substring(5, 10));//左闭右开规则
	}

}
