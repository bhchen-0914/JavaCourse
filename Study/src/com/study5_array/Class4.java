package com.study5_array;

public class Class4 {

	public static void main(String[] args) {
		//ð�����򣬴�С��������
		int intArray[] = {12,23,11,9,0,22,10};
		int temp;
		System.out.println("����ǰ������Ϊ��");
		for(int n:intArray) {
			System.out.print(n+"  ");
		}
		System.out.println();
		//���ѭ������ѭ������
		for(int i=0;i<intArray.length-1;i++) {
			//�ڲ�ѭ������ÿ�ε�����
			for(int j=0;j<intArray.length-1-i;j++) {
				if (intArray[j]>intArray[j+1]) {
					temp = intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
					
				}
			}
		}
		System.out.println("����������Ϊ��");
		for(int n:intArray) {
			System.out.print(n+"  ");
		}
	}

}
