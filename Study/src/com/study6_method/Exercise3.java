package com.study6_method;
/*
 * 定义两个重载的方法，分别求圆和长方形的面积。
 
1、定义两个求面积的重载方法，圆周率可以用Math.PI表示
2、在主方法中调用方法并将结果输出。
注意：当圆的半径为4.5，长方形长和宽分别为8和5时，可得到如效果图所示的结果
 * */
public class Exercise3 {
	//求圆形面积
		public double findArea(double r){
		     return Math.PI*r*r;
		}
	    
		//求长方形面积
		public double findArea(double a,double b){
		    return a*b;
		}

	public static void main(String[] args) {
		Exercise3 areademo = new Exercise3();
		//定义一个double类型的变量存放半径，并初始化
		double r=4.5;
		
		//定义两个变量存放长和宽，并初始化
		double a=8,b=5;
		
		//调用方法，求圆的面积并打印输出
		double s1 = areademo.findArea(r);
		System.out.println("圆的面积为："+s1);
		//调用方法，求长方形面积并打印输出
		double s2 = areademo.findArea(a,b);
		System.out.println("长方形面积为："+s2);

	}

}
