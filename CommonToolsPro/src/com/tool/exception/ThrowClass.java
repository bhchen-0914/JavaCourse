package com.tool.exception;

import java.util.Scanner;

/**
 * throw�׳��쳣
 * @author bhchen3
 *
 */

/*
 * throw�׳��쳣����Ĵ�����
 * 1.ͨ��try..catch����throw���----�Լ��׳����Լ�����
 * 2.ͨ��throws�ڷ����������׳��쳣����----˭����˭����Ҳ���Լ�������
 * 	  ��ʱ�����׳���throw������ͬ�����ͻ����丸��
 * */
public class ThrowClass {

	/*
	 * throw�����׳�һ���쳣
	 * throw�׳���ֻ�ܹ��ǿ��׳���Throwable�����������ʵ������
	 * throw�ɹ�ܿ��ܳ��ֵķ��գ�Ҳ�����һЩ������߼�
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowClass demo=new ThrowClass();
		//����1����
		demo.testAge();
		
		//����2����
		try {
			demo.testAge2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("������");
			e.printStackTrace();
		}

	}
	

	//�����Ƶ���ס�����޶����䣬18�����£�80�����ϱ�����������ͬ
	//����1
	public void testAge() {
		try {
			System.out.println("����������");
			Scanner scanner=new Scanner(System.in);
			int age=scanner.nextInt(); 
//			scanner.close(); 
			if(age<18 || age>80) {
				throw new Exception("18�����£�80����������������ͬ");
			}else {
				System.out.println("��ӭ����");
			}
		}catch (Exception e) {
			System.out.println("������");
			e.printStackTrace();
		}
	}
	
	//����2
	public void testAge2() throws Exception {
		System.out.println("����������");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		scanner.close(); 
		if(age<18 || age>80) {
			throw new Exception("18�����£�80����������������ͬ");
		}else {
			System.out.println("��ӭ����");
		}
	}

}
