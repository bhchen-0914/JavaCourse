package com.study4_loop;
/*
 * 嵌套循环
 * */

public class Class4 {

	public static void main(String[] args) {
		// 使用while循环，打印10行10列的*
		int i=1,j=1;
		while(i<=10) {
			while(j<=10) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			j=1;
			i++;
		}
		
		//打印三角形*
		int m=1,n=1;
		while(m<=10) {
			while(n<=m) {
				System.out.print(" * ");
				n++;
			}
			System.out.println();
			n=1;
			m++; 
		}
		// 使用嵌套循环求阶乘10的累加和
		int s=1,sum=0;
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=x;y++) {
				s*=y;  //s 用于存放某一阶乘的值
			}
			sum+=s;
			s=1;  //对s进行初始化
		}
		System.out.println("x的阶乘是："+sum);
	} 

}
