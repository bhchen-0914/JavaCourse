package com.study;


/*
 * ����ת����Ϊ�Զ�ת����ǿ������ת��
 * �Զ�����ת������Ϊ��ʽת��
 * */
public class Class6 {
	public static void main(String[]args) {
		// ���ݱ�ʾ��Χ����������͸�ֵ����ΧС���������ͣ���Ҫ����ǿ��ת��,�����ܳ������ݾ��ȶ�ʧ
		double d = 123.4;
		float f = (float)d;
		System.out.println("f="+f);
		
		// char���ͺ�int����֮���ת����char���͵����ݱ�ʾ��Χ��0~65535
		char c = 65535;
		char c1 = (char)65536;
		int n;
		n = c1; //��ʽת��
		c1=(char)n; // ǿ��ת��
		
		//���ͺ͸���������ת��
		int x=100;
		long y=x; // �Զ�ת��
		x = (int)y; // ǿ��ת��
		
		//���Է��ֽ�long����ת��Ϊ������ʱ�����ܻᷢ�����ݾ��ȶ�ʧ
		float f1 = 1234231123535L;
		System.out.print("f1="+f1);
	}
}
