package com.object.polymorphism;

/*
 * abstract�ؼ��ֶ���һ��������
 * �����಻����ʵ����������������ת�ͣ�ָ������ʵ��
 * ������ʹ�ó�����
 * ĳ���������������������߱�ĳЩ������������ֱ������������ʵ�ַ������������������ƣ�Ҳ�������Ƹ����������ʵ����
 * */

public abstract class Animal {
	private String name;
	private int age;
	
	//�޲ι���
	public Animal() {}
	
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//�������Զ���
	//���󷽷�������Ҫʵ�֣���������������壻�����б�����д�˷�������������Ҳ�ǳ�����
	//���󷽷����붨���ڳ�������
	//private,static,final���η�������abstract�ؼ���ͬʱ����
	public abstract void eat();
	
	
}
