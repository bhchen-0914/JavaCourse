package com.object.polymorphism;

public class TestAnimal {

	public static void main(String[] args) {

//		Animal one=new Animal();//1 �����಻����ʵ����
		/*
		 * ����ת�͡���ʽ	ת�͡��Զ�ת��
		 * ��������ָ���������ʵ�������Ե���������д����ķ����Լ����������ķ���
		 * �޷������������еķ���
		 * ��С���ת��
		 * */
		Animal two=new Cat();//2
		Animal three=new Dog();//3

//		one.eat();
		two.eat();
		three.eat();
		//two.run();�޷������������з���
		
		System.out.println("===============================");
		/*
		 *����ת�ͣ�
		 *��������ָ������󣬴˴��������ǿת�����Ե����������з���
		 *��������ת������
		 *instanceof����������ж���߶������������Ƿ�������ұ�����ʵ������������true/false	 
		 * */ 
		Cat tempCat=(Cat)two;
		tempCat.eat();
		tempCat.run();
		
		//instanceof���������
		if(three instanceof Dog) {
			Dog tempDog=(Dog)three; 
			tempDog.eat();
			tempDog.sleep();
		}
		
		if(two instanceof Animal) {
			System.out.println("two is Animal");
		}
		
		if(two instanceof Object) {
			System.out.println("two is Object");
		}
		
//		if(one instanceof Cat) {
//			System.out.println("one is Cat");
//		}
	}

}
