package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *try-catch-finally�����쳣���� 
 * @author bhchen3
 *
 */

/*
 * try���ڲ����쳣��try�����Խ�0������catch�飬���û��catch��������һ��finally��
 * catch�鲻�ܸ�finally�鵥��ʹ��
 * ������һ���쳣ʱ�������catch���Ͳ��ٽ���ƥ��
 * */
public class TryCatchFinally {
	public static void main(String[] args) {
		//Ҫ������2�����������2������
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
			e.printStackTrace(); //�ܴ�ӡ����Ķ�ջ��Ϣ 
		}catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();
		}
		//һ�����һ��catch���д���Exception���࣬���ڴ�����֮����쳣������Exceptionֻ�ܷ������һ��catch��
		catch (Exception e) {
			System.out.println("������~~~~");
			e.printStackTrace();
		}
		//�����Ƿ����쳣�����񣬶���ִ��finally��
		finally {
			System.out.println("==========���н���==========");
		}
		
	}
}
