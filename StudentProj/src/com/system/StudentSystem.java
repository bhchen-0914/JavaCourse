package com.system;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 学生成绩管理系统
 * @author bhchen3
 *
 */

public class StudentSystem {
	/**
	 * 显示菜单
	 */
	public void displayMenu() {
		System.out.println("********************************************");
		System.out.println("                1--初始化数学成绩");
		System.out.println("                2--求成绩平均值");
		System.out.println("                3--统计成绩大于85分的人数");
		System.out.println("                4--修改指定位置处的成绩");
		System.out.println("                5--打印输出所有成绩");
		System.out.println("                0--退出");
		System.out.println("********************************************");
	}
	
	/**
	 * 初始化数学成绩
	 */
	public float[]  initScore() {
		Scanner sc=new Scanner(System.in);
		int number=0; //初始化成绩个数
		while(true) {
			try {
				System.out.println("请输入需要录入成绩的个数：");
				number=sc.nextInt(); 
				break;
			} catch (InputMismatchException e) {
				System.out.println("只能输入整数");
				sc.next();
			}
		}
		
		float scoreArray[]=new float[number];//初始化数组长度
		for(int i=0;i<scoreArray.length;i++) {
			try {
				System.out.println("请输入第"+(i+1)+"学生的成绩：");
				scoreArray[i]=sc.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("请输入正确的数字，不能为非数字字符：");
				sc.next();
				i--;
			}
			
		}
//		sc.close();
		return scoreArray;
	} 
	
	/**
	 * 
	 * @param f :用于计算平均分的成绩数组
	 * @return 返回平均成绩
	 */
	public float average(float[] f) {
		float sum=0,aver=0;
		for(float s:f) {
			sum+=s;
		}
		aver=sum/f.length;
		return aver;
	}
	
	/**
	 * @param f :用于统计成绩的数组
	 * @return 返回大于85的个数
	 */
	public int count(float[] f) {
		int number=0;
		for(float s:f) {
			if(s>85) {
				number++;
			}
		}
		return number;
	}
	
	/**
	 * 
	 * @param f :用于替换成绩的数组
	 * @param index :替换的位置，从0开始，与数组下标含义相同
	 * @param newScore :新的成绩
	 */

	public float[] update(float[] f,int index,float newScore) {
		Scanner sc=new Scanner(System.in);
		System.out.println("修改前：");
		displayAllScore(f);
		while(true) {
			try {
				System.out.println("请输入要修改数据的位置(从0开始)：");
				index=sc.nextInt(); 
				f[index]=0; //用于判断数组是否越界，抛出异常
				break;
			} catch (InputMismatchException e) {
				System.out.println("请输入正确的数字，不能为非数字字符");
				sc.next();
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("位置不正确！");
			}
		}
		while(true) {
			try {
				System.out.println("请输入新数据：");
				newScore=sc.nextFloat();
				break;
			} catch (InputMismatchException e) {
				System.out.println("请输入正确的数字，不能为非数字字符");
				sc.next();
			}
		}
		f[index]=newScore;
		System.out.println("修改后：");
		displayAllScore(f);
//		sc.close();
		return f;
	}
	
	/**
	 * 
	 * @param f :用于展示成绩的数组
	 */
	public void  displayAllScore(float[] f) {
		System.out.println("成绩为：");
		for(float score:f) {
			System.out.print(score+"  ");
		}
		System.out.println();
	}
	
	//主方法
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentSystem stu=new StudentSystem();
		float scoreArray[]=null;  //主方法定义一个存放成绩的数组
		int index=0;  //初始化索引位置
		int newScore=0;  //初始化修改成绩
		int input=0;
 		while (true) {
			stu.displayMenu();
			System.out.println("请输入对应的数字进行操作：");
			try {
				input=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误");
				sc.next();
				continue;
			}
			if(input==0) {
				System.out.println("退出程序！");
				sc.close();
				break;
			}
			switch(input) {
			case 1:
				//初始化成绩
				scoreArray=stu.initScore();break;
			case 2:
				//求成绩平均值
				if(scoreArray!=null) {
					System.out.println("数学平均成绩为："+stu.average(scoreArray));
					break;
				}else {
					System.out.println("请初始化数学成绩后再进行操作！");
				}break;
			case 3:
				//统计大于85分的人数
				if(scoreArray!=null) {
					System.out.println("成绩大于85分的人数为："+stu.count(scoreArray));
					break;
				}else {
					System.out.println("请初始化数学成绩后再进行操作！");
				}break;
			case 4:
				//修改指定位置处的成绩
				if (scoreArray!=null) {
					scoreArray=stu.update(scoreArray, index, newScore);
					break;
				}else {
					System.out.println("请初始化数学成绩后再进行操作！");
				}break;
			case 5:
				//打印输出成绩
				if(scoreArray!=null) {
					stu.displayAllScore(scoreArray);
					break;
				}else {
					System.out.println("请初始化数学成绩后再进行操作！");
				}break;
			default:
				System.out.println("请输入0~5的数字进行操作");
			}
		}	
	}
}
