package com.tool.string;


/**
 * 
 * @author bhchen3
 *==�������equals����������
 */
public class StringClass4 {

	public static void main(String[] args) {
		// ����3���ַ��������ݶ�һ��
		String str1="hello world";
		String str2="hello world";
		String str3=new String("hello world");
		
		System.out.println("str1��str2�����Ƿ���ͬ��"+str1.equals(str2));
		System.out.println("str1��str3�����Ƿ���ͬ��"+str1.equals(str3));
		System.out.println("str1��str2��ַ�Ƿ���ͬ��"+(str1==str2));
		System.out.println("str1��str3��ַ�Ƿ���ͬ��"+(str1==str3));

	}

}
