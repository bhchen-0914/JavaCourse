package com.study4_loop;
/*
 * while循环：
 * while（）{
 * 	    语句
 * }
 * */
public class Class1 {

	public static void main(String[] args) {
		//求1~100累加和
		int num=1,sum=0;
		while (num<=100) {
			sum+=num;
			num++;	
		}
		System.out.println("1~100累加和为："+sum);
		System.out.println("此时num的值是："+num);
		
		//循环输出26个字母，分两行输出
		char ch='a';
		int count=1;  //用于控制换行
		while(ch<='z') {
			System.out.print(ch+" ");
			if(count==13) {
				System.out.println();
			}
			ch++;
			count++;
		}
	}

}
