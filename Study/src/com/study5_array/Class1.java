package com.study5_array;

/*
 * 数组是相同类型的数据按照顺序组成的一种引用数据类型
 * 数组在内存中的存储，是一个连续的空间，数组有默认值
 * 数组的声明
 * 数组的创建
 * 数组的初始化
 * 数组的引用
 * */

public class Class1 {

	public static void main(String[] args) {
		/*
		 * 数组的声明：
		1.数据类型[] 数组名；
		2.数据类型 数组名[]；
		 * */
		int[] myIntArray;
		String myStrArray[];

		//数组的创建：
		//1.先声明再创建
		myIntArray = new int[10]; //创建一个长度为10的整型数组
		
		//2.声明的同时创建数组
		int[] arr = new int[10]; //同样创建一个长度为10的整型数组
		
		//声明数组的同时给数组赋值称为数组的初始化
		int arr2[] = {1,2,3,4,5}; //赋值的同时，定义了长度为5
		
		//数组元素的引用
		System.out.println(arr2[0]); //数组名[下标],下标从0开始 
		
		
	}

}
