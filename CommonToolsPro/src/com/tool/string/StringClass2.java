package com.tool.string;
/**
 * 
 * @author bhchen3
 *String常用方法2
 */
public class StringClass2 {
	/*
	  * 求字符或子串在字符串中第一次出现的位置:indexOf()
          * 求字符或子串在字符串中最后一次出现的位置:lastIndexOf()
	 * */
	
	public static void main(String[] args) {
		//定义一个字符串
		String str=new String("JAVA编程基础，我喜欢java编程");
		
		//查找'A'第一次出现的位置
		System.out.println("A第一次出现的位置:"+str.indexOf('A'));
		
		//查找子串"编程"第一次出现的位置
		System.out.println("子串\"编程\"在字符串中第一次出现的位置:" + str.indexOf("编程"));
	
		//查找'A'最后一次出现的位置
		System.out.println("A最后一次出现的位置:"+str.lastIndexOf('A'));
		
		//查找子串"编程"最后一次出现的位置
		System.out.println("子串\"编程\"在字符串中最后一次出现的位置:" + str.lastIndexOf("编程"));
		
		//在字符串index为8的位置开始，查找字符串"编程第一次出现的位置"
		System.out.println("子串\"编程\"在字符串index为8开始，第一次出现的位置:" + str.indexOf("编程",8));

	
	}

}
