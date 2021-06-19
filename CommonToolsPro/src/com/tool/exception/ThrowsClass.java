package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * throws�����쳣����
 * @author bhchen3
 *
 */
public class ThrowsClass {
	//�������쳣����Checked Exception(����쳣)ʱ�������ڵ��ô˷���ʱ����
	public static int test() throws ArithmeticException,InputMismatchException,Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ����� ��");
		int b=sc.nextInt();
		sc.close();
		System.out.println("=====�������=====");
		return a/b;
	}
	

	//���һ�����������׳��쳣����û��������������쳣��
	//�����ڷ�����������throws�Ӿ��������׳��쳣
	public static void main(String[] args) {
		/*
		 * throws������ڷ�������ʱҪ�����÷����׳����쳣����
		 * �������׳��쳣�б��е��쳣ʱ��������������Щ���ͼ����������͵��쳣��������������ø÷����ķ���������ȥ����
		 * */
		try {
			int num=test();
			System.out.println("������������"+num);
		} catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("����������0");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("������");
			e.printStackTrace();
		}

	}	

}
