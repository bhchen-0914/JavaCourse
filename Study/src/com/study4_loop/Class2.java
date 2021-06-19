package com.study4_loop;

import java.util.Scanner;


/*
do while循环:
do{
    语句；
}while(循环条件)；
*/
public class Class2 {

	public static void main(String[] args) {
		// do while循环求1~100累加和
		int num=1,sum=0;
		do {
			sum=sum+num;
			num++;
		}while(num<=100);
		System.out.println("1到100累加和为："+sum);
		System.out.println("此时num的值为："+num);

		//猜字游戏，猜一个1~20之间的数字，将猜测值与实际值进行比较，给出提示
		//直到猜测正确
		
		//生成一个20以内的随机数,Math.random()表示随机生成一个[0，1）之间的浮点型数据
		//Math.random()*20 则表示[0，20）之前的随机数，+1则代表[1，21）随机数，也是浮点型
		int number = (int) (Math.random()*20+1); 
		System.out.println("number:"+number);
		int guess;
		do{
			System.out.println("请输入猜测的数:");
			Scanner sc = new Scanner(System.in);
			guess=sc.nextInt();
			if(guess<number) {
				System.out.println("猜小了");
			}else if (guess>number) {
				System.out.println("猜大了");
			}else {
				System.out.print("猜对了,");
			}
		}while(guess!=number);	
		System.out.println("正确值为："+guess);
	}
}
