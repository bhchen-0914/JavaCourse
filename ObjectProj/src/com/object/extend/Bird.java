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

	// ʹ��super�ؼ��ֶԸ���������ã������ø�������ó�Ա
	public void fly2() {
		super.myShow();
		super.color = "blue"; // �޸ĸ��������
		System.out.println("I can fly");
	}

	//��дequals�����������жϴ��������Ƿ����
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Bird temp = (Bird) obj; // �������Object��ǿתΪBird��
		if (this.getName().equals(temp.getName()) && this.getAge() == temp.getAge()
				&& this.getWingColor().equals(temp.getWingColor()))
			return true;
		else {
			return false;
		}
	}
	
	//������equals����������
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
