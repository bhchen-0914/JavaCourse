package com.object.extend;

public class Test1 {
	public static void main(String[] args ) {
		Cat cat1 =new Cat();
		cat1.color="白色";//非私有成员可直接访问
		cat1.setName("coffee");
		cat1.setWeight(5.5);
		cat1.eat();
		cat1.myShow(); //子类重写的结果
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Dog dog1=new Dog();
		dog1.color="黑色";
		dog1.setName("小虎");
		dog1.setSex("男孩");
		dog1.run();
		dog1.myShow();
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Bird bird1=new Bird();
		bird1.setName("woody");
		//默认优先调用子类重写的方法
		bird1.setWingColor("red");
		bird1.fly();
		bird1.fly2();  //调用父类的结果

	}
}
