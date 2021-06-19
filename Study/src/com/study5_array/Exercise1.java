package com.study5_array;
/*
 * 从键盘接收数据，
 * 求整型数组的累加和
 *求数组中最大值
 * */

import java.util.Scanner;

public class Exercise1 { 

	public static void main(String[] args) {
		int intArray[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素的值");
			intArray[i]=sc.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.println("第"+(i+1)+"个元素的值为"+intArray[i]);
	}
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.println("数组累加和为："+sum);
		
		//求数组中最大值
		int max = intArray[0];
		for(int i=1;i<intArray.length;i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
		}
		System.out.println("数组中最大值为："+max);
		
	}
}
