package com.object.extend;

public class Son extends Father{
	public static int num3=24;
	
	static {
		System.out.println("我是子类的静态代码块");
	}
	public Son(){
		System.out.println("我是子类的无参构造方法");
	}
	
	public Son(String name,int age){
		//子类构造默认调用父类无参构造方法
		System.out.println("我是子类的带参构造方法");
		this.setName(name);
		this.setAge(age);
	}
		
	
	{
		System.out.println("我是子类的构造代码块");
	}
}
