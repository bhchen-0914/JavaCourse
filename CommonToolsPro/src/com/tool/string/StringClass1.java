package com.tool.string;
/**
 * 
 * @author bhchen3
 *String���÷���
 */
public class StringClass1 {
	/*
	 * �󳤶ȷ�����length()
	 * ���Ӵ�������substring()
	 * ���ض�λ���ַ�������charAt()
	 * */
	public static void main(String[] args) {
		//����һ���ַ���"Java ��� ����"
		String str="Java ��� ����";
		
		//����ַ�������
		System.out.println("�ַ����ĳ����ǣ�"+str.length());
		
		//����ض��ַ� �̣�charAt(int index),�����±��0��ʼ
		System.out.println("�ض��ַ���"+str.charAt(6));
		
		//ȡ���Ӵ������ �������������substring()
		System.out.println("�Ӵ���"+str.substring(5)); //����λ�õ�����
		System.out.println("�Ӵ���"+str.substring(5, 10));//����ҿ�����
	}

}
