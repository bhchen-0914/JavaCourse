package com.study3_choose;

import java.util.Scanner;

/*
 * if�ṹ��switch�ṹ������
 * if�ṹ��
 * 		1.�ж������ǲ�������
 * 		2.�ж�������һ����Χ
 * switch�ṹ��
 * 		�ж������ǳ���ֵ 
 * */
public class Class3 {

	public static void main(String[] args) {
		// switch��ϰ��ƥ������
		Scanner scanner = new Scanner(System.in);
		System.out.println("������1~7:");
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("��������");

		}
		System.out.println("�������ڵ��ʣ�");
		String week=scanner.next();
		week=week.toUpperCase();//����ĸת��Ϊ��д�ķ���
		switch(week) {
		case "MONDAY":
			System.out.println("����һ");
			break;
		case "TUESDAY":
			System.out.println("���ڶ�");
			break;
		case "WEDNESDAY":
			System.out.println("������");
			break;
		case "THURSDAY":
			System.out.println("������");
			break;
		case "FRIDAY":
			System.out.println("������");
			break;
		case "SATURDAY":
			System.out.println("������");
			break;
		case "SUNDAY":
			System.out.println("������");
			break;
		default:
			System.out.println("��������");
		}
	}

}
