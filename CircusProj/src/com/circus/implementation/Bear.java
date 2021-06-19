package com.circus.implementation;

import com.circus.basic.Animal;
import com.circus.basic.IACT;

public class Bear extends Animal implements IACT {

	/**
	 * Bear构造方法
	 * @param name:姓名
	 * @param age：年龄
	 */
	public Bear(String name, int age) {
		super(name, age);
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "技能：挽着花篮，打着雨伞，自立走秀";
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n" + "年龄：" + this.getAge() + "岁" + "\n" + this.skill() + "\n"
				+ this.love());
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢卖萌";
	}

}
