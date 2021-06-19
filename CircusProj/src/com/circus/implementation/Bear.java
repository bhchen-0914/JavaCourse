package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Bear extends Animal implements IACT {

	/**
	 * Bear���췽��
	 * @param name:����
	 * @param age������
	 */
	public Bear(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ����Ż�����������ɡ����������";
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("�����ߣ�" + this.getName() + "\n" + "���䣺" + this.getAge() + "��" + "\n" + this.skill() + "\n"
				+ this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ������";
	}

}
