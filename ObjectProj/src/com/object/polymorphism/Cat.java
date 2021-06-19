package com.object.polymorphism;

public class Cat extends Animal {
	//���ԣ�����
	private double weight;
	
	//�޲ι���
	public Cat() {}
	
	//���ι���	
	public Cat(String name,int age,double weight) {
		super(name,age);
		this.setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//�������ܶ�
	public void run() {
		System.out.println("è������");
	}
	//�������Զ���(��д����)
	@Override
	public void eat() {
		System.out.println("è�����");
	}
}
