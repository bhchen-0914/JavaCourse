package com.study3_choose;

import java.util.Scanner;

/*
 * ����if�ṹ����
 * �ɼ����ڵ���90�������A
 * ���ڵ���80����С��90�������B
 * ���ڵ���60��С��80�������C
 * С��60�������D
 * */
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ɼ�");
		Scanner scanner = new Scanner(System.in);
		int score=scanner.nextInt();
		if(score>=90) 
			System.out.println("A");
		if(80<=score&score<90)
			System.out.println("B");
		if(score>=60&score<80)
			System.out.println("C");
		if(score<60)
			System.out.println("D");
		
		System.out.println("~~~~~~"+"�����Ƕ���ѡ��ṹ"+"~~~~~~~");
		
		System.out.println("������ɼ�");
		int score2=scanner.nextInt();
		if(score2>=90)
			System.out.println("A");
		else if(score2>=80)
			System.out.println("B");
		else if(score2>=60)
			System.out.println("C");
		else 
			System.out.println("D");

		
	}

}