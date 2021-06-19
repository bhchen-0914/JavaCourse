package com.study2;

import java.util.Scanner;

/*
 * 逻辑运算符用于连接一个或多个条件，判断这些条件是否成立。逻辑运算符的操作数即操作结果都是布尔值
 *与：&& 或&
 *或：|| 或|
 *非：！
 * */
public class Class4 {

	public static void main(String[] args) {
		// 与运算练习
		//升学考试，语数英总成绩大于等于300分，且英语大于等于90分才成功
		int chscore = 100,mascore=109,enscore=90;
		int sum=chscore+mascore+enscore;
		if(sum>=300&enscore>=90) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
		
		//&与&&
		int n=3;
		boolean b1=(3>7)&((n++)<4);
		System.out.println("b1:"+b1+" n:"+n);
		n=3;
		boolean b2=(3>7)&&((n++)<4); //&&是短路运算符，如果之前的表达式就可以决定最后的结果，将不会执行计算后面的表达式了
		System.out.println("b2:"+b1+" n:"+n);
		
		// |与||
		int m=3;
		boolean b3=(3<7)|(m++)<4;
		System.out.println("b3:"+b3+" m:"+m);
		m=3;
		boolean b4=(3<7)||(m++)<4;
		System.out.println("b4:"+b4+" m:"+m); // ||也是一个短路运算符，与上述类似
		
		// ！  判断输入的数能否被3整除
		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		if(!(number%3==0)) {
			System.out.println(number+"不能被3整除");
		}else {
			System.out.println(number+"能被3整除");
		}
	}

}
