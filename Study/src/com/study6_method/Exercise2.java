package com.study6_method;
/*

1、定义一个方法，求数组的平均值
2、在主方法中定义对象，并初始化一个float类型的数组，
      调用方法求数组元素的平均值，并将平均值打印输出
 * */

public class Exercise2 {
	//求数组元素的平均值
	 public void averageArray(float[] arr){
	        float sum=0,average=0;
	        for(float f:arr){
	            sum+=f;
	        }
	        average=sum/arr.length;
	        System.out.println("数组的平均值为："+average);
	    }

	public static void main(String[] args) {
		//定义对象
		Exercise2 average = new Exercise2();
		
		//创建float类型的数组并初始化
		float floatArray[]={78.5f,98.5f,65.5f,32.5f,75.5f};
		//调用方法求平均值并打印输出
		average.averageArray(floatArray);
		
		
	}

}
