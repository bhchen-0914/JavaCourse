package com.study5_array;

public class Class4 {

	public static void main(String[] args) {
		//冒泡排序，从小到大排序
		int intArray[] = {12,23,11,9,0,22,10};
		int temp;
		System.out.println("排序前的数组为：");
		for(int n:intArray) {
			System.out.print(n+"  ");
		}
		System.out.println();
		//外层循环控制循环次数
		for(int i=0;i<intArray.length-1;i++) {
			//内层循环控制每次的排序
			for(int j=0;j<intArray.length-1-i;j++) {
				if (intArray[j]>intArray[j+1]) {
					temp = intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
					
				}
			}
		}
		System.out.println("排序后的数组为：");
		for(int n:intArray) {
			System.out.print(n+"  ");
		}
	}

}
