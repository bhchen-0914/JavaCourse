package com.study6_method;
/*
 * 基本数据类型传值问题
 * 数组的传值
 * */
public class Class5 {
	
	//定义一个int交换传值方法
	public void exchange(int a,int b) {
		int temp;
		System.out.println("交换前：a="+a+",b="+b);
		temp=a;a=b;b=temp;
		System.out.println("交换后：a="+a+",b="+b);
		
	}
	//定义一个数组交换传值的方法
	public void exchange(int[] arr) {
		arr[0]=100;
	}
	
	public void exchangeTest() {
		int m=3,n=8;
		System.out.println("test方法  交换前：m="+m+",n="+n);
		//主方法外调用同类下方法，，无需初始化对象
		exchange(m, n);
		//调用交换方法后变量的值并没有改变，因为改变的只是传递的参数的值
		System.out.println("test方法  交换后：m="+m+",n="+n);
		
		
		int intArray[] = {1,2,3,4,5};
		System.out.println("方法调用前数组第一个元素为："+intArray[0]);
		exchange(intArray);
		// 调用方法后数组的元素的值发生了改变，因为数组是引用数据类型
		System.out.println("方法调用后数组第一个元素为："+intArray[0]);
	}

	public static void main(String[] args) {
		Class5 class5 = new Class5();
		class5.exchangeTest();

	}

}
