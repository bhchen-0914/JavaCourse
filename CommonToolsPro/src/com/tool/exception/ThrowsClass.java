package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * throws声明异常类型
 * @author bhchen3
 *
 */
public class ThrowsClass {
	//当分类异常包括Checked Exception(检查异常)时，必须在调用此方法时处理
	public static int test() throws ArithmeticException,InputMismatchException,Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第二个数 ：");
		int b=sc.nextInt();
		sc.close();
		System.out.println("=====运算结束=====");
		return a/b;
	}
	

	//如果一个方法可能抛出异常，但没有能力处理这个异常，
	//可以在方法声明处用throws子句来声明抛出异常
	public static void main(String[] args) {
		/*
		 * throws语句用在方法定义时要声明该方法抛出的异常类型
		 * 当方法抛出异常列表中的异常时，方法将不对这些类型及其子类类型的异常作处理，而抛向调用该方法的方法，由它去处理
		 * */
		try {
			int num=test();
			System.out.println("两个数的商是"+num);
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("除数不能是0");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
		}

	}	

}
