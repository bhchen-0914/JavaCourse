package com.object.innerClass;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person tom=new Person();
		tom.age=18;
		//��ȡ�ڲ���ʵ�����󣬷���1��new �ⲿ��.new �ڲ���
		Person.Heart heart1=new Person().new Heart();
		System.out.println(heart1.beats());
		
		System.out.println("=============================");
		
		//��ȡ�ڲ���ʵ�����󣬷���2���ⲿ�����.new �ڲ���
		Person.Heart heart2=tom.new Heart();
		System.out.println(heart2.beats());
		
		System.out.println("=============================");
		
		//��ȡ�ڲ���ʵ�����󣬷���3���ⲿ�����.��ȡ����()
		Person.Heart heart3=tom.getHeart();
		System.out.println(heart3.beats());
	}

}
