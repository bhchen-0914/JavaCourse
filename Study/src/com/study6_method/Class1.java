package com.study6_method;

/*
 * ��ν�����������������һ������Ĵ����������ϣ���һ������ģ��
 * �����������﷨��
 * �������η� �������� �������������б�{
 * 		������
 * }
 * ���ݷ����Ƿ�����뷵��ֵ���ɷ�Ϊ�ࣺ
 * 1.�޲��޷���ֵ
 * 2.�޲δ�����ֵ
 * 3.�����޷���ֵ
 * 4.���δ�����ֵ
 * */


public class Class1 {
	//�����Ķ�����������ڲ�
	// �޲��޷���ֵ����
	//һ�д�ӡ���һ���Ǻ�
	public void starPrint() {
			System.out.println("***************");
		}

	public static void main(String[] args) {
		//����һ��Class1 ��Ķ��� class1
		Class1 class1 = new Class1();
		//ʹ�ö�����.������()���÷���
		class1.starPrint();
		System.out.println("HELLO JAVA!!");
		class1.starPrint();
	}
}
