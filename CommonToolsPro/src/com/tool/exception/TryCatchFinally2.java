package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * ��ֹfinallyִ�еķ���
 * return�ؼ������쳣�����е�����
 * */
public class TryCatchFinally2 {
	//���ڲ���return
	//����ʲô���������ֵ����-10000.��Ϊfinally���ǿ��ִ��
	public static int test() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("����a");
			int a=sc.nextInt();
			System.out.println("����b");
			int b=sc.nextInt();
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
			return 0;
		}finally {
			System.out.println("==========���н���==========");
			return -10000;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("==========���п�ʼ==========");
		try {
			System.out.println("����one");
			int one=scanner.nextInt();
			System.out.println("����two");
			int two=scanner.nextInt();
			System.out.println("one��two�����ǣ�"+(one/two));
		}catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
			//exit����������������ֹ��������
			System.exit(0); 
			e.printStackTrace(); 
		}catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("������~~~~");
			e.printStackTrace();
		}
		//�����Ƿ����쳣�����񣬶���ִ��finally��
		finally {
			System.out.println("==========���н���==========");
		}
		
		System.out.println("����test����");
		int result=test();
		System.out.println("test��������ֵ�ǣ�"+result);

	}

}
