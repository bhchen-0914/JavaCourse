package com.object.polymorphism;

public class Master {
	/*
	 * �����ࣺ
	 * 1.ιè�����궫������һ��
	 * 2.ι�������궫����˯��
	 * */
	
	//feed���������븸�࣬ͨ������������ת��������ָ�����෽��
	public void feed(Animal animal) {
		animal.eat();
		if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
			cat.run();
		}else if (animal instanceof Dog) {
			Dog dog=(Dog)animal;
			dog.sleep();
		}
	}
	
	/*
	 * �ж�������
	 * ����ʱ��ࣺ����
	 * ����ʱ���٣���è
	 * */
	public Animal raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("ʱ��϶࣬�ʺ�����");
			return new Dog();
		}else {
			System.out.println("ʱ����٣��ʺ���è");
			return new Cat();
		}
	}
}	
