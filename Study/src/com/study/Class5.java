package com.study;
/*
 * �������͵�����ֵ��ֻ����true ��  false
* 
 * �ַ��������ڻ����������ͣ�����һ���࣬�������������������͵�����
 * �����ַ���������ֵ�� ͨ��˫������������0�������ַ�
 * */

public class Class5 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		// ���岼�����͵ı�����Ų���ֵ
		System.out.println("t="+t);
		System.out.println("f="+f);
		
		String str1 = "";
		System.out.println("st1="+str1);
		String str2 = "Hello";
		//�ַ���ƴ��
		System.out.println("st1+st2="+str1+str2);
		
		// ����һ������unicod�ַ����ַ���
		String str3 = "A\u005a\u006EB";
		System.out.println("st3="+str3);
		
		// ����һ�������ո���ַ���
		String str4 = "123  Hello";
		System.out.println("st4="+str4);
		
	}

}
