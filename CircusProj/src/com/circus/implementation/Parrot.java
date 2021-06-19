package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Parrot extends Animal implements IACT {
	private String type;
	
	/**
	 * Parrot构造方法
	 * @param name:姓名
	 * @param age:年龄
	 * @param type:品种
	 */
	public Parrot(String name, int age, String type) {
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
		return "技能：擅长模仿";

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n" + "年龄：" + this.getAge() + "岁" +"\n"+"品种："+this.getType()+ "\n" + this.skill() + "\n"
				+ this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢吃坚果和松子";

	}

}
