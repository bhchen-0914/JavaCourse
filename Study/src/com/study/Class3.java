package com.study;
/*
 整型字面值与变量声明
 java中有3种表示整型的方法：十进制、八进制、十六进制
 十进制：123， 12
 八进制：以0开头，包括0~7的数字，如 036， 067
 十六进制：以0x或0X开头，包括0~9数字和字母a~f，A~F，如0x12，0XABCF
 
 */


/*
 浮点型字面值默认情况下表示double型，也可以在值后加D或d，如：12.32D或 12.43d
 如要表示float类型，，则需要在后面加F或f
  */
public class Class3 {
	public static void main(String[] args) {
		int n; //声明整形变量n
		n = 1;
		System.out.println("n:"+n);
		long counnt; //声明长整型变量count
		counnt = 133455L;
		System.out.println("count:"+counnt);
		int a = 2; //定义变量的同时给变量赋值，即变量的初始化
		System.out.println("a:"+a);
		int octl = 037; // 定义int类型变量存放八进制数据 
		System.out.println("octl:"+octl);
		long longNumber = 0xa2cdf3ffL; // 定义长整型变量存放十六进制长整型数据
		System.out.println("longNumber:"+longNumber);
		short shortNummber = 123; // 定义变量存放短整型数据
		System.out.println("shortNummber:"+shortNummber);
		byte b = 10;  // 定义存放byte类型数据
		System.out.println("b:"+b);
		
		double d1 = 12.21; //定义一个双精度浮点型变量，存放d1的值
		double d2;
		d2 = 12.22D;
		float f1;
		f1 = 12.22F;
		float f2 = 0.001f;
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		double d3 = 123;  //当把一个整形数赋值给浮点类型的变量时，会保留一位小数点,变成浮点型
		System.out.println("d3:"+d3);  //当把一个整形
		double d4 = d2; 
		System.out.println("d4:"+d4); // 将一个变量的值赋值给另一个变量
		
		
		//规律：但把数据范围较大的变量赋值给数据范围小的变量时，是不允许的。double的数据范围是最大的
		
	}
	
} 
