package com.object.interfaceStudy;

public class FourthPhone extends ThirdPhone implements Iphoto,Inet{
//	public void photo() {
//		System.out.println("手机可以拍照");
//	}
	
//	public void network() {
//		System.out.println("手机可以上网");
//	}
	
	public void game() {
		System.out.println("手机可以玩游戏");
	}

	//重写接口类的方法
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("手机可以拍照");
	}
	//重写接口类的方法，自动以public实现
	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("手机可以上网");
		
	
	}

	//若不重写接口中重名方法，如果父类中有同名方法，则调用时优先调用在父类中继承的方法
	@Override
	public void connect() {
		System.out.println("这里是phone类中的connect方法");
	}

}
