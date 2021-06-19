package com.object.interfaceStudy;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthPhone phone=new FourthPhone();
		//1~4代手机功能都被继承了
		phone.call();
		phone.message();
		phone.video();
		phone.music();
		phone.network();
		phone.game();
		
		System.out.println("=========================");
		
		//接口实现不同实例的相同功能
		Iphoto iphoto=phone;
		iphoto.photo();
		iphoto=new Camera();
		iphoto.photo();
		
		System.out.println("=========================");
//		Inet.temp=1; 默认常量，无法赋值
		System.out.println(Inet.temp); //访问常量
		Inet net=new Computer();
		net.network();
		net.connect();
		net=phone;
		net.network();
		net.connect();
		Inet.disconnect();
		
		System.out.println("=========================");
		Inet net2=new SmartWatch();
		net2.network();
		net2.connect();
	}

}
