package com.object.innerClass;
/**
 * ��Ա�ڲ���
 * @author bhchen3
 *
 */

//�ⲿ��
public class Person {
	int age;

	public Heart getHeart() {
		return new Heart();	
	}
	
	public void eat() {
		System.out.println("���ڳԶ���");
		new Heart().temp=10; //�ⲿ������ڲ�����Ϣ����Ҫͨ���ڲ���ʵ��
	}
	
	/*
	 * ��Ա�ڲ���
	 * 1.�ڲ������ⲿʹ��ʱ���޷�ֱ��ʵ��������Ҫ�����ⲿ����Ϣ�������ʵ����
	 * 2.�ڲ������ʹ������������η��������ʷ�Χ���յ�Ӱ�� 
	 * 3���ڲ������ֱ��ʹ���ⲿ��ʵ���ĳ�Ա�����뷽��,������ͬ�����ԣ������ȷ����ڲ����ж��������
	 * 4.����ʹ���ⲿ��.this.��Ա���ԣ������ⲿ����ͬ����Ϣ
	 * 5.�ⲿ������ڲ�����Ϣ����Ҫͨ���ڲ���ʵ�����޷�ֱ�ӷ���
	 * 6.�ڲ�������.class�ļ��������ⲿ��	$�ڲ���.class
	 * */	
	public class Heart {
		int temp=10;
		int age=20;
		
//		public void eat() {
//			System.out.println("�ڲ����eat");
//		}
		
		public String beats() {
			eat();
			return Person.this.age+"�������������"; //�ⲿ��.this.��Ա���� ��ָ�������ⲿ������
			
		}
	}

}
