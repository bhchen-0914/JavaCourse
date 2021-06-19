package com.study6_method;
/*
 * 方法重载：方法名称相同，参数列表不同
 * */
public class Class4 {
//定义3个方法，实现int、double和数组类型的问题
	
	//求2个int类型的和
	public int addNumber(int a,int b) {
		return a+b;
	}
	
	//求double类型的和
	public double addNumber(double a, double b) {
		return a+b;
	}
	
	
	//求数组元素的累加和
	public int addNumber(int[] arr) {
		int sum=0;
		for(int n:arr) {
			sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		Class4 class4 = new Class4();
		int intArray[] = {1,2,3,4,5};
		System.out.println("int类型和："+ class4.addNumber(2, 3));
		System.out.println("double类型和："+ class4.addNumber(1.2, 2.3));
		System.out.println("数组类型和："+ class4.addNumber(intArray));
	}

}
