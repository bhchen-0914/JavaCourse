package com.study4_loop;
/*
 * 编写一个程序，求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为12。
 * */
public class Exercise2 {

	public static void main(String[] args) {
		//定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
		int ge,shi,bai;
		        
		//使用for循环
		for(int num=200;num<=300;num++){
			//取出百位数
			bai=num/100;
			//取出十位数
			shi=(num-100*bai)/10;
	
			//取出个位数
			ge=num-100*bai-10*shi;

			//计算三个数字之积
		    int mul=bai*shi*ge;
			//计算三个数字之和
			int sum=bai+shi+ge;
		    //如果积等于42并且和为12，则将满足条件的数输出
		    if (mul==42&sum==12){
		    	System.out.println(num);
		            }
		 
		        }
			}

	}

