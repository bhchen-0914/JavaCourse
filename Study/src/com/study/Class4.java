package com.study;
/* 
 �ַ�������ֵ
 �ַ�������ֵ�õ������ڵĵ����ַ���ʾ����'a', '$'��
 �����ַ��ͱ�����char a = 'a'; 
 
 Unicode����
  */

public class Class4 {
	public static void main(String[]args) {
		char a='a';  //����һ������a����ַ���a��
		System.out.println("a="+a);
		char ch=65535; //  �Ὣ65ת��ΪASCII�룬˵�����κ��ַ������ǿ����໥ת����
		int i = 'A';
		System.out.println("i="+i);
		System.out.println("ch="+ch);
		//�������ֵ����char��������ʾ�����ݷ�Χ����Ҫ����ǿ��ת��
		char ch2=(char)65536;
		System.out.println("ch2="+ch2);
		//ASCII��ʹ��7λ��8λ���������������ʾ128��256�ֿ��ܵ��ַ�
		//7λ���������------��׼ASCII��
		//8λ��������ϣ���128λ�� -----��չASCII��
		
		
		char u='\u005d';
		/*unicode��ʾ������ֵ��ǰ�����ǰ׺'���������4λ��16������*/
		System.out.println("u="+u);
		
	}
}