package com.study5_array;
/*
 * �Ӽ��̽������ݣ�
 * ������������ۼӺ�
 *�����������ֵ
 * */

import java.util.Scanner;

public class Exercise1 { 

	public static void main(String[] args) {
		int intArray[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ");
			intArray[i]=sc.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.println("��"+(i+1)+"��Ԫ�ص�ֵΪ"+intArray[i]);
	}
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.println("�����ۼӺ�Ϊ��"+sum);
		
		//�����������ֵ
		int max = intArray[0];
		for(int i=1;i<intArray.length;i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
		}
		System.out.println("���������ֵΪ��"+max);
		
	}
}
