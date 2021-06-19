package com.object.extend;
/*
 * @Override注解
 * 注解在方法前，标明此方法是重写父类方法
 * 可检测重写是否符合重写逻辑
 * */

public class Cat extends Animal{
	private double weigth; //cat的特有成员
	
	/**
	 * 无参构造
	 */
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name, age);
	}
	
	public void setWeight(double weigth) {
		this.weigth = weigth;
	}
	
	public double getWeight() {
		return this.weigth;
	}
	
	//cat 特有的方法
//	@Override  此方法不是重写的方法，编译失败
	public void eat() {
		System.out.println(this.getName()+"喜欢吃鱼");
	}
	
	/*
	 * 方法重载：
	 * 1.在同一个类中
	 * 2.方法名相同，参数列表不同(顺序、个数、类型)
	 * 3.方法返回值、访问修饰符任意
	 * 4.重载与方法参数名无关
	 * */
	
	/*
	 * 方法的重写，重写规则：
	 * 1.在有继承关系的子类中	
	 * 2.方法名相同，参数列表相同（顺序、个数、类型），返回值相同，但可以允许返回值是子类类型
	 * 3.方法访问修饰符允许有变化，访问范围需要大于等于父类的访问范围
	 * 4.与方法参数名无关 
	 * */
	@Override  //重写父类方法成功
	public void myShow() {
		System.out.println(this.getName()+"is a cat");	
	}
	
	//重写Object类中的toString方法
	@Override
	public String toString() {
		return "name:"+this.getName()+";"+"age:"+this.getAge();
	}
}
