package com.tool.string;

/*
 * String���в��ɱ��ԣ���StringBuilder���߱�
 * ��Ƶ�������ַ���ʱ������ʹ��StringBuilder
 * */

/*
 * StringBuilder��StringBuffer���߻�������
 * StringBuffer���̰߳�ȫ�ģ�StringBuilder��û�У������Ը�
 * */

public class StringBuilderClass {

	public static void main(String[] args) {
		//����һ���ַ�����hello��
		StringBuilder str=new StringBuilder("hello");
		
		//�������ݣ���"hello"��Ϊ"hello��world!"
		str.append(',').append("world��");
		System.out.println("str:"+str);
		
		//���ַ�����Ϊ"hello��WOELD��"
		//����1��ʹ��deleteɾ��world���ٲ���WORLD
		System.out.println("�滻��"+str.delete(6, 11).insert(6, "WORLD"));
		
		//��ʼ��
		str=new StringBuilder("hello,world��");
		
		//����2��ʹ��replace�����滻
		System.out.println("�滻��"+str.replace(6, 11, "WORLD"));
		
		//�������ַ�����ȡ�� hello�����
		System.out.println(str.substring(0, 5));
	}

}
