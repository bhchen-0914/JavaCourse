package com.study2;

import java.util.Scanner;

/*
 * ��ϵ�����������һ������ֵ
 * >,<,>=,<=,==,!=
 * ��ϵ�����һ���������������
 * ��if����ʽ��
 * if��������{
 * 		<����>
 * }
 * */	
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=15;
		System.out.println("num1<num2:"+(num1<num2));
		
		//�̳����ۣ�������� ��Ʒ�ܼ۴���100���20������ԭ�ۺ��ۺ�۷ֱ����
		double price1,price2;
		price1=45.5;price2=56.5;
		double sum=price1+price2;
		System.out.println("ԭ�ۣ�"+sum);
		if (sum>100){
			sum-=20;
		}
		System.out.println("�ۺ�ۣ�"+sum);
		
		//�ж�һ��������������ż����������
		//�Ӽ��̽�������
		System.out.println("����һ������:");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		if(number%2==0) {
			System.out.println(number+" ��һ��ż��");
		}
		else {
			System.out.println(number+" ��һ������");
		}
	}

}
