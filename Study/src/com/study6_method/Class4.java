package com.study6_method;
/*
 * �������أ�����������ͬ�������б�ͬ
 * */
public class Class4 {
//����3��������ʵ��int��double���������͵�����
	
	//��2��int���͵ĺ�
	public int addNumber(int a,int b) {
		return a+b;
	}
	
	//��double���͵ĺ�
	public double addNumber(double a, double b) {
		return a+b;
	}
	
	
	//������Ԫ�ص��ۼӺ�
	public int addNumber(int[] arr) {
		int sum=0;
		for(int n:arr) {
			sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		Class4 class4 = new Class4();
		int intArray[] = {1,2,3,4,5};
		System.out.println("int���ͺͣ�"+ class4.addNumber(2, 3));
		System.out.println("double���ͺͣ�"+ class4.addNumber(1.2, 2.3));
		System.out.println("�������ͺͣ�"+ class4.addNumber(intArray));
	}

}
