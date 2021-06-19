package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Lion extends Animal implements IACT {
	private String color;
	private String sex;
	
	/**
	 * Lion���ι���
	 * @param name������
	 * @param age:����
	 * @param color:ëɫ
	 * @param sex:�Ա�
	 */
	public Lion(String name, int age,String color,String sex) {
		super(name, age);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ��ó����Ȧ";

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("�����ߣ�" + this.getName() + "\n" + "���䣺" + this.getAge() + "��" + "\n" + "�Ա�" + this.getSex()
				+ "\n" + "ëɫ��" + this.getColor() + "\n" + this.skill() + "\n" + this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ���Ը�������";

	}

}
