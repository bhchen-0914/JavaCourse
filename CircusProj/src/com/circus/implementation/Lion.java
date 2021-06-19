package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Lion extends Animal implements IACT {
	private String color;
	private String sex;
	
	/**
	 * Lion带参构造
	 * @param name：姓名
	 * @param age:年龄
	 * @param color:毛色
	 * @param sex:性别
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
		return "技能：擅长钻火圈";

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n" + "年龄：" + this.getAge() + "岁" + "\n" + "性别：" + this.getSex()
				+ "\n" + "毛色：" + this.getColor() + "\n" + this.skill() + "\n" + this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢吃各种肉类";

	}

}
