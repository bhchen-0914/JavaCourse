package com.study6_method;

import java.util.Scanner;

/*
 *  ������Ϊ��������
 * */
public class Class3 {
	
	//����һ����������ӡ�������Ԫ��ֵ
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("��"+(i+1)+"��Ԫ��Ϊ"+arr[i]+", ");
		}
		System.out.println("");
	}

	//��������Ԫ�ص�ֵ
	public boolean search(int n,int[] arr) {
		boolean flag=false; //Ĭ��û�ҵ�
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
	
	}

	public static void main(String[] args) {
		Class3 class3 = new Class3();
		int intArray[] = {1,3,5,7,9,11};
		//����printArray����
		class3.printArray(intArray);
		
		//����Ԫ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("����Ҫ���ҵ�Ԫ��:");
		int numer=scanner.nextInt();
		scanner.close();
		boolean flag=class3.search(numer, intArray);
		if(flag) {
			System.out.println("���������ҵ���Ԫ��:"+numer);
		}else {
			System.out.println("û�����������ҵ���Ԫ�أ�"+numer);
		}
	}

}