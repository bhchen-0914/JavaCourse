package com.study2;

public class Class1 {
/*
 * 表达式是由运算符和操作数组成，比如：sum = num1 + num2 
 * 赋值运算符： 变量=表达式； 从右往左运算
 * 算数运算符：用于数据的加减乘除等操作
 * %：求余数 ， ++：自增1  --：自减1
 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将一个已经定义好的变量赋值给另一个变量
		float f1=1.23f;
		double d1=f1;
		
		//复合赋值运算符有
		int x=5;
		x +=5;
		System.out.println("x="+x);
		
		//自增自减
		int n=1;
		n++;
		System.out.println("n:"+n);
		n--;
		System.out.println("n:"+n);
		
		// + 的应用
		int num1=10,num2=5;
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		System.out.println(num1+num2); //进行算数运算，15
		System.out.println(""+num1+num2); //进行字符串拼接运算，105
		
		//- 的应用
		result = num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		// *应用
		result = num1*num2;
		System.out.println(num1+"x"+num2+"="+result);
		
		// /应用
		result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		//分子分母都是整型时，结果为整除后的结果
		System.out.println("12/5="+12/5);
		//要使除法结果为浮点型，需要使分子分母任意一个为浮点型
		System.out.println("12/5="+12.0/5);
		System.out.println("12/5="+12/5.0);
		
		//求余数,当分子分母之一时浮点型时，结果也是浮点型
		System.out.println("12%5="+12.0%5);
		System.out.println("12.5%5="+12.5%5);
		System.out.println("12%5.5="+12.5%5.5);
	}

}
