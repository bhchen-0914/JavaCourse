package com.object.extend;
/**
 * Animal���࣬������̳�
 * ��������д
 * @author bhchen3
 *
 */

public class Animal {
/*
 * һ������ֻ�ܼ̳�һ������(���̳�)
 * ������Լ̳и���ķ�˽�г�Ա
 * */
	
	
/*
 * �������η�
 * private��ֻ�������н��з���(����Ȩ����С)
 * public:����������λ�÷���(����Ȩ�����)
 * protect:����ǰ�ࡢͬ�����ࡢ������ࡢͬ����������ã���������಻�ܵ���
 *    Ĭ�Ϸ���Ȩ�ޣ������ڵ�ǰ�ࡢͬ������/��������ã��������/�����಻�ܵ���
 * */
	
	
	private String name;
	private int age;
	String color;
	
	/**
	 * �޲ι���
	 * ����Ĺ��췽���������̳У���������д
	 * ���Ǹ��๹���Ӱ�������ʵ����
	 */
	public Animal() {}
	
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void myShow() {
		System.out.println(this.getName()+"is a Animal");
	}
	
}
