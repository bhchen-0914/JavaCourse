package com.object.innerClass;

public class Person2Test {

	public static void main(String[] args) {
		//��ȡ��̬�ڲ������ʵ�������Բ�ͨ���ⲿ��Ķ���ʵ��
		Person2.Heart heart=new Person2.Heart();
		System.out.println(heart.beats());
		heart.say();
		Person2.Heart.say(); //�����ڲ��ྲ̬��Աʱ������ͨ���ⲿ��.��̬�ڲ���.��̬��Ա
	}

}
