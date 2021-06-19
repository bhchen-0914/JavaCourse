package com.object.interfaceStudy;

public class SmartWatch implements Inet,Iphoto{

	@Override
	public void photo() {
		System.out.println("智能手表可以拍照");
	}

	@Override
	public void network() {
		System.out.println("智能手表可以上网");
	}

	//解决接口中重名方法的方案：重写接口中重名的方法
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		Inet.super.connect();
		System.out.println("这里是SmartWatch中重写Inet接口中的connect方法");
	}
}
