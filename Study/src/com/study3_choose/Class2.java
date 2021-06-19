package com.study3_choose;

import java.util.Scanner;

/*
 * 嵌套if语句的使用
 * */

public class Class2 {
	public static void main(String[] args) {
		// 判断一个输入的数是正数、负数还是0
		System.out.println("输入一个数：");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if(number!=0) {
			if(number>0) {
				System.out.println("正数");
			}else {
				System.out.println("负数");
			}
		}else {
			System.out.println("等于0");
		}
	}

}
