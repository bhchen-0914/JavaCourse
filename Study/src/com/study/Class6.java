package com.study;


/*
 * 类型转换分为自动转换与强制类型转换
 * 自动类型转化被称为隐式转化
 * */
public class Class6 {
	public static void main(String[]args) {
		// 数据表示范围大的数据类型赋值给范围小的数据类型，需要进行强制转换,但可能出现数据精度丢失
		double d = 123.4;
		float f = (float)d;
		System.out.println("f="+f);
		
		// char类型和int类型之间的转换，char类型的数据表示范围是0~65535
		char c = 65535;
		char c1 = (char)65536;
		int n;
		n = c1; //隐式转换
		c1=(char)n; // 强制转换
		
		//整型和浮点型类型转换
		int x=100;
		long y=x; // 自动转换
		x = (int)y; // 强制转换
		
		//可以发现将long类型转换为浮点型时，可能会发生数据精度丢失
		float f1 = 1234231123535L;
		System.out.print("f1="+f1);
	}
}
