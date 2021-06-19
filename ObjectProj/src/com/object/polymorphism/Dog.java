package com.object.polymorphism;

public class Dog extends Animal{
	//���ԣ��Ա�
	private String sex;
	
	//�޲ι���
	public Dog() {}

	//���ι���
	public Dog(String name,int age, String sex) {
		super(name,age);
		this.setSex(sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//������˯��
	public void sleep() {
		System.out.println("����˯��");
	}
	//�������Զ���(��д����)
	@Override
	public void eat() {
		System.out.println("��ϲ���Թ�ͷ");
	}
}
