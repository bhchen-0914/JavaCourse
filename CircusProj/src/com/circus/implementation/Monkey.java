package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Monkey extends Animal implements IACT {

	private String type;
	
	/**
	 * Monkey���췽��
	 * @param name:����
	 * @param age:����
	 * @param type:Ʒ��
	 */
	public Monkey(String name, int age, String type) {
		super(name, age);
		this.setType(type);
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ�����ֳ�����ľ��";

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("�����ߣ�" + this.getName() + "\n" + "���䣺" + this.getAge() + "��" +"\n"+"Ʒ�֣�"+this.getType()+ "\n" + this.skill() + "\n"
				+ this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ��ģ���˵Ķ�������";

	}

}
