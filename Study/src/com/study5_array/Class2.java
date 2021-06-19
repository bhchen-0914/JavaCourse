package com.study5_array;
/*
 * 一维数组的应用
 * */
public class Class2 {

	public static void main(String[] args) {
		// 声明一个整形数组
		int intArray[];
		// 声明一个字符串型数组
		String strArray[];
		// 声明一个字符串型数组
		float floArray[] = new float[10];
		
		intArray = new int[5];
		strArray = new String[5];
		char chrArray[] = {'a','b','c','d','e'};
		System.out.println("intArry的长度是"+intArray.length);
		System.out.println("chrArray的第二个元素是："+chrArray[1]);
		
		//对象型数组的默认值为null
		System.out.println("strArray的最后一个元素是："+strArray[strArray.length-1]);
		//float数组默认值是0.0
		System.out.println("floArray第一个元素是："+floArray[0]);
		//int数组默认值是0
		System.out.println("intArray第三个元素是："+intArray[2]);
		
		//循环为int数组赋值
		for(int i=0;i<5;i++) {
			intArray[i]=i+1;
		}
		//循环打印intArray
		for(int i=0;i<5;i++) {
			System.out.println("数组intArray第"+ (i+1) +"元素的值为："+intArray[i]);
		}

	}

}
