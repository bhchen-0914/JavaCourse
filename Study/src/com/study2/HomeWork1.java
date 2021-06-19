package com.study2;
/*
 * 1、定义整型变量m并初始化为10

2、定义整型变量n并初始化为5

3、将变量m的值加3，n的值加5

4、求m和n的平均值，并将结果存于变量p中

5、将m的平方乘以n的平方，并将结果存于变量q中

6、将p和q的值打印输出
 * */

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将变量m的初值赋值为10，变量n的初值赋值为5
        int m=10,n=5;
   
    //变量m的值加3，n的值加5
        m+=3;n+=5;
 
    //求m和n的平均值，并将结果存于变量p中
        double p = (m+n)/2;
    
    //求m的平方乘以n的平方，并将结果存于变量q中
        
        float q = m*m * n*n;
    //将p和q的值打印输出
        System.out.println("m和n的平均值为："+p);
        System.out.println("m的平方乘以n的平方为："+q);
	}

}
