package com.study5_array;
/*
 * ��ά�����������3����ʽ��
 * */
public class Class1_2 {

	public static void main(String[] args) {
		//������ά�����3����ʽ
		int [][] intArray;
		float floatArray[][];
		double [] doubleArray[];
		
		//����һ��3��3�е���������
		intArray = new int[3][3];
		intArray[1][2] = 9;
		System.out.println("intArray����ڶ��е�����Ԫ�ظ�ֵ��Ϊ��"+intArray[1][2]);
		
		//������ͬʱ����
		char charArray[][] = new char[3][3];
		
		//ָֻ����������
		floatArray = new float[3][];
		
		//ÿһ���൱��һ��һά����
		
		//��һ��������
		floatArray[0] = new float[3];
		//�ڶ�����4��
		floatArray[1] = new float[4];
		//��3����5��
		floatArray[2] = new float[4];
		 
		System.out.println(floatArray[1][3]);
		//System.out.println(floatArray[0][3]); �����±�Խ��
		
	}

}
