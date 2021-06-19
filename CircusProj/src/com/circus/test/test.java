package com.circus.test;

import java.util.Scanner;
import com.circus.basic.IACT;
import com.circus.implementation.*;


public class test {

	public static void main(String[] args) {
		//用于判断演出循环的终止条件
		boolean flag=true;
		
		//实例化对象
		View view=new View();
		IACT bearAct=new Bear("Bill", 1);
		IACT lionAct=new Lion("Lain", 2, "灰色", "公狮");
		IACT monkeyAct=new Monkey("Tom", 1, "金丝猴");
		IACT parrotACT=new Parrot("Rose", 1, "牡丹鹦鹉");
		IACT clownAct=new Clown("Kahle", 5);
		Scanner input=new Scanner(System.in);
		
		//表演的循环
		while (flag) {
			view.showView();
			int choose=input.nextInt();
			//选择表演项目
			switch (choose) {
			case 1:
				bearAct.act();
				break;
			case 2:
				lionAct.act();
				break;
			case 3:
				monkeyAct.act();
				break;
			case 4:
				parrotACT.act();
				break;
			case 5:
				clownAct.act();
				break;
			default:
				System.out.println("*******输入信息不正确*******");;
				break;
			}
			
			//选择继续的循环
			while (true) {
				System.out.println("******* 是否继续观看(1/0) *******");
				int keep=input.nextInt();
				if (keep==1) {
					break;
				}else if (keep==0) {
					flag=false; //停止表演的循环
					System.out.println("********  欢迎下次光临  ********");
					break;
				}else {
					System.out.println("***输入信息不正确，请重新输入***");
				}
			}
		}
		input.close();	
	}

}
