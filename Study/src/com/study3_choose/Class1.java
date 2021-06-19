package com.study3_choose;

import java.util.Scanner;

/*
 * 多重if结构案例
 * 成绩大于等于90分输出：A
 * 大于等于80分且小于90分输出：B
 * 大于等于60分小于80分输出：C
 * 小于60分输出：D
 * */
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩");
		Scanner scanner = new Scanner(System.in);
		int score=scanner.nextInt();
		if(score>=90) 
			System.out.println("A");
		if(80<=score&score<90)
			System.out.println("B");
		if(score>=60&score<80)
			System.out.println("C");
		if(score<60)
			System.out.println("D");
		
		System.out.println("~~~~~~"+"以下是多重选择结构"+"~~~~~~~");
		
		System.out.println("请输入成绩");
		int score2=scanner.nextInt();
		if(score2>=90)
			System.out.println("A");
		else if(score2>=80)
			System.out.println("B");
		else if(score2>=60)
			System.out.println("C");
		else 
			System.out.println("D");

		
	}

}
