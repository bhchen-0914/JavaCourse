package com.object.interfaceStudy;

//接口访问修饰符：使用public 或者默认修饰符
public interface Inet {
	//接口抽象方法不使用访问修饰符也会默认使用public去实现
	//接口中抽象方法可以不写abstract关键字
	//当类实现接口时，需要实现接口中所有抽象类方法，否则需要将该类设计为抽象类
	abstract void network();
	
	//接口中可以设置常量，默认public static final
	int temp=20;
	
	//default:默认方法，可以带方法体  jdk1.8后新增
	//可以在实现类中重写，可以通过接口的引用调用
	public default void connect() {
		System.out.println("这里是Inet接口中的默认connect方法");
	}
	
	//静态方法可以带方法体   jdk1.8后新增
	//不可以在实现类中重写，可以通过接口名调用
	static void disconnect() {
		System.out.println("这里是接口中的静态断开连接方法");
	}
}
	