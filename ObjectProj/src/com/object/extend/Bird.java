package com.object.extend;

/**
 * super
 * 
 * @author bhchen3
 *
 */

public class Bird extends Animal {
	protected String wingColor;

	public Bird() {
	}

	public Bird(String name, int age, String wingColo) {
		super(name, age);
		this.setWingColor(wingColo);
	}

	public String getWingColor() {
		return wingColor;
	}

	public void setWingColor(String wingColor) {
		this.wingColor = wingColor;
	}

	public void myShow() {
		System.out.println(this.getName() + "is a bird,my wing 's color is " + this.getWingColor());
	}

	public void fly() {
		myShow();
		System.out.println("I can fly");
	}

	// 使用super关键字对父类进行引用，能引用父类可引用成员
	public void fly2() {
		super.myShow();
		super.color = "blue"; // 修改父类的属性
		System.out.println("I can fly");
	}

	//重写equals方法，用于判断传入数据是否相等
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Bird temp = (Bird) obj; // 将传入的Object类强转为Bird类
		if (this.getName().equals(temp.getName()) && this.getAge() == temp.getAge()
				&& this.getWingColor().equals(temp.getWingColor()))
			return true;
		else {
			return false;
		}
	}
	
	//对上述equals方法的重载
	public boolean equals(Bird obj) {
		if (obj == null)
			return false;
		if (this.getName().equals(obj.getName()) && this.getAge() == obj.getAge()
				&& this.getWingColor().equals(obj.getWingColor()))
			return true;
		else {
			return false;
		}
	}
}
