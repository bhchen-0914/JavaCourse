package com.tool.string;
/**
 * 
 * @author bhchen3
 *String���÷���2
 */
public class StringClass2 {
	/*
	  * ���ַ����Ӵ����ַ����е�һ�γ��ֵ�λ��:indexOf()
          * ���ַ����Ӵ����ַ��������һ�γ��ֵ�λ��:lastIndexOf()
	 * */
	
	public static void main(String[] args) {
		//����һ���ַ���
		String str=new String("JAVA��̻�������ϲ��java���");
		
		//����'A'��һ�γ��ֵ�λ��
		System.out.println("A��һ�γ��ֵ�λ��:"+str.indexOf('A'));
		
		//�����Ӵ�"���"��һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"���ַ����е�һ�γ��ֵ�λ��:" + str.indexOf("���"));
	
		//����'A'���һ�γ��ֵ�λ��
		System.out.println("A���һ�γ��ֵ�λ��:"+str.lastIndexOf('A'));
		
		//�����Ӵ�"���"���һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"���ַ��������һ�γ��ֵ�λ��:" + str.lastIndexOf("���"));
		
		//���ַ���indexΪ8��λ�ÿ�ʼ�������ַ���"��̵�һ�γ��ֵ�λ��"
		System.out.println("�Ӵ�\"���\"���ַ���indexΪ8��ʼ����һ�γ��ֵ�λ��:" + str.indexOf("���",8));

	
	}

}
