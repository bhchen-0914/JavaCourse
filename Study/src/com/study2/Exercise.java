package com.study2;

import java.util.Scanner;


/*
 * 判断闰年：
 * 能被4整除且不能被100整除，或者能被400整除
 * */


public class Exercise {

	public static void main(String[] args) {
		System.out.println("输入一个年份：");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		if(((year%4==0)&(year%100!=0)) | (year%400==0)) {
			System.out.println(year+"年是闰年");
		}else {
			System.out.println(year+"年不是闰年");
		}

	}

}
