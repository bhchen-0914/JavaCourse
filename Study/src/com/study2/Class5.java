package com.study2;

/*
 * 条件运算符，条件运算符是三目运算符
 *布尔表达式？ 表达式1：表达式2，当布尔表达式的值为ture，则返会表达式1的值，否则返回表达式2 的值
 *
 * */
public class Class5 {

	public static void main(String[] args) {
		//求最大值
		int a=10,b=9;
		int max;
		max=a>b?a:b;
		System.out.println("max:"+max);
		
		
		boolean b1=a>b?(3<6|1>2):(true==false);
		System.out.println("b1:"+b1);
	}

}
