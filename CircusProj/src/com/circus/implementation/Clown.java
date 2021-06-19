package com.circus.implementation;

import com.circus.basic.IACT;

public class Clown implements IACT {

	private String name;
	private int years;

	/**
	 * Clown���췽��
	 * @param name:����
	 * @param years:����
	 */
	public Clown(String name,int years) {
		this.setName(name);
		this.setYears(years);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getYaers() {
		return this.years;
	}
	
	public void setYears(int years) {
		this.years=years;
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ��Ųȸ��Σ������Ӽ�ħ������";
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("�����ߣ�" + this.getName() + "\n" + "���䣺" + this.getYaers() + "��" + "\n" + this.dress() + "\n"
				+ this.skill());
	}

	public String dress() {
		return "��װ������ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ";
	}

}
