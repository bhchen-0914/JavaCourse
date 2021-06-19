package com.study6_method;

import java.util.Scanner;

/*
 *  数组作为方法参数
 * */
public class Class3 {
	
	//定义一个方法，打印输出数组元素值
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("第"+(i+1)+"个元素为"+arr[i]+", ");
		}
		System.out.println("");
	}

	//查找数组元素的值
	public boolean search(int n,int[] arr) {
		boolean flag=false; //默认没找到
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
	
	}

	public static void main(String[] args) {
		Class3 class3 = new Class3();
		int intArray[] = {1,3,5,7,9,11};
		//调用printArray方法
		class3.printArray(intArray);
		
		//查找元素
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入要查找的元素:");
		int numer=scanner.nextInt();
		scanner.close();
		boolean flag=class3.search(numer, intArray);
		if(flag) {
			System.out.println("在数组中找到了元素:"+numer);
		}else {
			System.out.println("没有在数组中找到该元素："+numer);
		}
	}

}
