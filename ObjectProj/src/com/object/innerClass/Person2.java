package com.object.innerClass;
/**
 * ��̬�ڲ���
 * @author bhchen3
 *
 */

public class Person2 {
	static int age=19;

	public Heart getHeart() {
		return new Heart();	
	}
	
	public void eat() {
		System.out.println("���ڳԶ���");
	}
	
	public static void walk() {
		System.out.println("�˻���·");
	}

	/*
	 * ��̬�ڲ���
	 * 1.��̬�ڲ����У�ֻ�ܷ����ⲿ��ľ�̬��Ա,�����Ҫ���÷Ǿ�̬��Ա������ͨ������ʵ������
	 * 2.��̬�ڲ���ʵ��ʱ�����Բ��������ⲿ����
	 * 3.�����ڲ��ྲ̬��Ա������ͨ���ⲿ��.��̬�ڲ���.��̬��Ա �ķ���ʵ��
	 * 4.���ڲ������ⲿ������ͬ��ʱ��Ĭ��ֱ�ӵ����ڲ����б����������Ҫ�����ⲿ���о�̬��Ա���ԣ�
	 * 	 ����ͨ���ⲿ��.���� �ķ����������Ҫ�����ⲿ���зǾ�̬���ԣ������ͨ�� new �ⲿ��()�����Եķ���ʵ��
	 * */
	public static class Heart {
		static int temp=10;
		int age=20;
		
		public static void say() {
			System.out.println("hello");
		}
		
		public String beats() {
			walk();
			new Person2().eat();
			System.out.println("�ⲿ���е�age��"+Person2.age);
			return age+"�������������";
		}
	}

}
