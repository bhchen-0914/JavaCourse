package com.object.interfaceStudy;

public class Computer implements Inet{

	//抽象方法必须重写
	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("电脑可以上网");	
		}
	
	//重写默认方法，也可不重写
	@Override
	//实现类在重写接口中的默认方法时调用接口默认方法的语句为：<接口名>.super.<默认方法名>
	public void connect() {
		Inet.super.connect(); 
		System.out.println("电脑连接的方法");
	}	

}
