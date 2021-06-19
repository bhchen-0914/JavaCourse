package com.study4_loop;
/*
 * for循环
 * for(表达式1;表达式2;表达式3){
 * 		语句
 * }
 * */

public class Class3 {

	public static void main(String[] args) {
		//使用for循环，求1~100累加和
		int sum=0;
		//n=1首先执行，判断n<=100第二次执行，sum+=n 第三个执行，n++最后执行
		for(int n=1;n<=100;n++) {  //可以使用时定义变量n
			sum+=n;
		}
		System.out.println("1~100累加和："+sum);
//		System.out.println("n:"+n); 会报错，因为n为局部变量，作用范围只在定义它的大括号内有效
//		也就是只在循环体内有效
		
		//当for循环表达式2为空时，默认为true，循环不会停止，可使用break跳出循环
		int i=1;
		for(i=1;;i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}		
		}
		System.out.print("此时i的值："+i);
	}

}
