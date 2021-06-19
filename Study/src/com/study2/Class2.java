package com.study2;
// 自增自减运算符


public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		//当自增自减运算符在操作变量前时，先进行自增自减运算，再进行赋值运算
		int num2 = ++num1; // num1++ --> num2=num1
		System.out.println("num2:"+num2);
		
		//当自增自减运算符在操作变量后时，先进行赋值运算再进行自增自减运算
		num1=1;
		num2=num1++;  // num2=num1 --> num1++
		System.out.println("num2:"+num2);
		System.out.println("num1:"+num1);
		
		int x=4;
		int y=(x++)+5;
		System.out.println("y="+y+",x="+x); //y=x+5 -->x++
		x=4;
		y =++x+5;
		System.out.println("y="+y+",x="+x); //x== --> y=x+5
		
	}	

}
