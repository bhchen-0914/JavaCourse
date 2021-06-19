package com.circus.implementation;

import com.circus.basic.IACT;

public class Clown implements IACT {

	private String name;
	private int years;

	/**
	 * Clown构造方法
	 * @param name:姓名
	 * @param years:艺龄
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
		return "技能：脚踩高跷，进行杂技魔术表演";
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n" + "艺龄：" + this.getYaers() + "年" + "\n" + this.dress() + "\n"
				+ this.skill());
	}

	public String dress() {
		return "着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
	}

}
