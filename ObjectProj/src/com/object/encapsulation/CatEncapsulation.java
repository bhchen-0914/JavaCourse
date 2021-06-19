package com.object.encapsulation;
/*
 * 封装：
 * 将类的某些信息隐藏在类的内部，不允许外部程序直接访问
 * 通过该类实现的方法来实现对隐藏信息的操作和访问
 * 隐藏对象的信息，同时留出访问的接口
 * */
public class CatEncapsulation {
	/*
	 * 封装实现的方法步骤：
	 * 1.修改属性的可见性（private）
	 * 2.创建getter/setter方法（设置为public用于属性的读写）
	 * 3.在getter/setter方法中加入属性控制语句
	 * */
	
	
	String name;
	//修改属性的可见性
	private int age;
	private String sex;
	
	//推荐使用set方法完成构造方法的初始化
	public CatEncapsulation(String name,int age, String sex) {
		this.name=name;
		this.setAge(age);
		this.setSex(sex);
	}
	
	public CatEncapsulation () {
		return;
	}
	
	//创建get/set方法,并添加属性的限制
	//注意：只有getter方法的属性是只读属性，只有setter方法的属性是只写属性
	public void setAge(int age) {
		if(age<=0|age>20) {
			System.out.println("age设置不合理");
		}else {
			this.age=age;
			System.out.println("Setting age successed!");
		}	
	}
	
	public int getAge() {
		return this.age;
	}

	//Source-->Generate Getters and Setters 可以自动创建get/set方法
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if(sex=="M"|sex=="FM") {
			this.sex = sex;
			System.out.println("Setting sex successed!");
		}else {
			System.out.println("sex设置不合理");
		}
	}
	
	
}
