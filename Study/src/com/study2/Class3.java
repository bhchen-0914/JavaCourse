package com.study2;

import java.util.Scanner;

/*
 * 关系运算符：返回一个布尔值
 * >,<,>=,<=,==,!=
 * 关系运算符一般与条件语句连用
 * 简单if语句格式：
 * if（条件）{
 * 		<语句块>
 * }
 * */	
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=15;
		System.out.println("num1<num2:"+(num1<num2));
		
		//商场打折，如果两件 商品总价大于100则减20，并把原价和折后价分别输出
		double price1,price2;
		price1=45.5;price2=56.5;
		double sum=price1+price2;
		System.out.println("原价："+sum);
		if (sum>100){
			sum-=20;
		}
		System.out.println("折后价："+sum);
		
		//判断一个数是奇数还是偶数，输出结果
		//从键盘接收数据
		System.out.println("输入一个整数:");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		if(number%2==0) {
			System.out.println(number+" 是一个偶数");
		}
		else {
			System.out.println(number+" 是一个奇数");
		}
	}

}
