package com.study4_loop;
/*
1、定义整型变量n作为循环变量，并初始化
2、定义整型变量sum存放和，并初始化
3、使用while循环求1到5的平方和
4、输出平方和
*/

public class Exercise1 {
	public static void main(String[] args) {
		//定义整型变量n作为循环变量，并初始化
		int n=1;

        //定义整型变量sum存放和，并初始化
        int sum=0;

        //使用while循环求1到5的平方和
        while(n<=5){
            sum+=n*n;
            n++;
        }

        //输出平方和
        System.out.println("1到5的平方和为:"+sum);
	}
}
