package com.study5_array;
/*
 * һά�����Ӧ��
 * */
public class Class2 {

	public static void main(String[] args) {
		// ����һ����������
		int intArray[];
		// ����һ���ַ���������
		String strArray[];
		// ����һ���ַ���������
		float floArray[] = new float[10];
		
		intArray = new int[5];
		strArray = new String[5];
		char chrArray[] = {'a','b','c','d','e'};
		System.out.println("intArry�ĳ�����"+intArray.length);
		System.out.println("chrArray�ĵڶ���Ԫ���ǣ�"+chrArray[1]);
		
		//�����������Ĭ��ֵΪnull
		System.out.println("strArray�����һ��Ԫ���ǣ�"+strArray[strArray.length-1]);
		//float����Ĭ��ֵ��0.0
		System.out.println("floArray��һ��Ԫ���ǣ�"+floArray[0]);
		//int����Ĭ��ֵ��0
		System.out.println("intArray������Ԫ���ǣ�"+intArray[2]);
		
		//ѭ��Ϊint���鸳ֵ
		for(int i=0;i<5;i++) {
			intArray[i]=i+1;
		}
		//ѭ����ӡintArray
		for(int i=0;i<5;i++) {
			System.out.println("����intArray��"+ (i+1) +"Ԫ�ص�ֵΪ��"+intArray[i]);
		}

	}

}
