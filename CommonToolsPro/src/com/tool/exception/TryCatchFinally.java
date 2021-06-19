package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *try-catch-finally处理异常方法 
 * @author bhchen3
 *
 */

/*
 * try用于捕获异常，try块后可以接0个或多个catch块，如果没有catch块则必须跟一个finally块
 * catch块不能跟finally块单独使用
 * 当捕获到一个异常时，后面的catch语句就不再进行匹配
 * */
public class TryCatchFinally {
	public static void main(String[] args) {
		//要求：输入2个整数，输出2数的商
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
			e.printStackTrace(); //能打印错误的堆栈信息 
		}catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();
		}
		//一般最后一个catch块中传入Exception父类，用于处理考虑之外的异常。父类Exception只能放在最后一个catch块
		catch (Exception e) {
			System.out.println("出错了~~~~");
			e.printStackTrace();
		}
		//无论是否有异常被捕获，都会执行finally块
		finally {
			System.out.println("==========运行结束==========");
		}
		
	}
}
