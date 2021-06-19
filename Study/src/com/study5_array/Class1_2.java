package com.study5_array;
/*
 * 二维数组的声明（3种形式）
 * */
public class Class1_2 {

	public static void main(String[] args) {
		//声明二维数组的3种形式
		int [][] intArray;
		float floatArray[][];
		double [] doubleArray[];
		
		//创建一个3行3列的整型数组
		intArray = new int[3][3];
		intArray[1][2] = 9;
		System.out.println("intArray数组第二行第三列元素赋值后为；"+intArray[1][2]);
		
		//声明的同时创建
		char charArray[][] = new char[3][3];
		
		//只指定行数创建
		floatArray = new float[3][];
		
		//每一行相当于一个一维数组
		
		//第一行有三列
		floatArray[0] = new float[3];
		//第二行有4列
		floatArray[1] = new float[4];
		//第3行有5列
		floatArray[2] = new float[4];
		 
		System.out.println(floatArray[1][3]);
		//System.out.println(floatArray[0][3]); 数组下标越界
		
	}

}
