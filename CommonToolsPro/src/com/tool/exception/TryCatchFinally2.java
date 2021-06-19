package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 终止finally执行的方法
 * return关键字在异常处理中的作用
 * */
public class TryCatchFinally2 {
	//用于测试return
	//无论什么情况，返回值都是-10000.因为finally块会强制执行
	public static int test() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("输入a");
			int a=sc.nextInt();
			System.out.println("输入b");
			int b=sc.nextInt();
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			return 0;
		}finally {
			System.out.println("==========运行结束==========");
			return -10000;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("==========运行开始==========");
		try {
			System.out.println("输入one");
			int one=scanner.nextInt();
			System.out.println("输入two");
			int two=scanner.nextInt();
			System.out.println("one和two的商是："+(one/two));
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			//exit方法可以无条件终止程序运行
			System.exit(0); 
			e.printStackTrace(); 
		}catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("出错了~~~~");
			e.printStackTrace();
		}
		//无论是否有异常被捕获，都会执行finally块
		finally {
			System.out.println("==========运行结束==========");
		}
		
		System.out.println("测试test方法");
		int result=test();
		System.out.println("test方法返回值是："+result);

	}

}
