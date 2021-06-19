package com.study4_loop;
/*
 * break和continue
 * */
public class Class5 {

	public static void main(String[] args) {
		//break作用是跳出当前循环，外层循环不受影响
		
		int i=0;
		for(int j=1;j<=5;j++) {
			for(int k=1;k<=5;k++) {
				i=j+k;
				if(k==3)
					break;
			}
		}
		System.out.println("i="+i); //结果是8，break跳出内层循环后，外层循环仍然会继续
		
		
		//continue 表示跳出本次循环
		//求1，3，5，7，9.....99等差数列的和
		int sum=0;
		for(int number=1;number<=100;number++) {
			if(number%2==0) {
				continue;
			}
			sum+=number;
			number++;
		}
		
		System.out.println("sum="+sum);
	}

}
