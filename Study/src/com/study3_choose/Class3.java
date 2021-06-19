package com.study3_choose;

import java.util.Scanner;

/*
 * if结构与switch结构的区别
 * if结构：
 * 		1.判断条件是布尔类型
 * 		2.判断条件是一个范围
 * switch结构：
 * 		判断条件是常量值 
 * */
public class Class3 {

	public static void main(String[] args) {
		// switch练习，匹配星期
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1~7:");
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入有误");

		}
		System.out.println("输入星期单词：");
		String week=scanner.next();
		week=week.toUpperCase();//把字母转换为大写的方法
		switch(week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入有误");
		}
	}

}
