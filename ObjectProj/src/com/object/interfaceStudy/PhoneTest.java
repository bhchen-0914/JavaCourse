package com.object.interfaceStudy;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthPhone phone=new FourthPhone();
		//1~4���ֻ����ܶ����̳���
		phone.call();
		phone.message();
		phone.video();
		phone.music();
		phone.network();
		phone.game();
		
		System.out.println("=========================");
		
		//�ӿ�ʵ�ֲ�ͬʵ������ͬ����
		Iphoto iphoto=phone;
		iphoto.photo();
		iphoto=new Camera();
		iphoto.photo();
		
		System.out.println("=========================");
//		Inet.temp=1; Ĭ�ϳ������޷���ֵ
		System.out.println(Inet.temp); //���ʳ���
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
