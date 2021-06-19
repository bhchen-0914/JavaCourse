package com.study6_method;


/*
 * 无参带返回值方法
 * 带参无返回值方法
 * 带参有返回值的方法
 * */
public class Class2 {
	//无参带返回值方法，定义一个求长方形面积的方法
	public int getArea() {
		int length=10;
		int width=8;
		int area=length*width;
		return area;
	}
	
	//带参无返回值方法，定义一个求2个float类型数据最大值的方法，打印出最大值
	public void maxFloat(float a,float b) {
		float max;
		if(a>b) {
			max=a;
		 }else {
			 max=b;
		 }System.out.println("最大值是："+max);
	}
	
	//带参有返回值的方法，返回一个值的阶乘累加和
	public int fac(int num) {
		int sum=0,temp=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				temp=temp*j;
			}
			sum+=temp;
			temp=1;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		int area = class2.getArea();
		System.out.println("长方形面积为："+area);
		
		class2.maxFloat(1.34f, 1.35f);
		int a=5,b=10;
		class2.maxFloat(a, b);
		
		int num = 5;
		int sum = class2.fac(num);
		System.out.println(num+"的阶乘累加和为："+sum);
	}
	

}
