package com.object.interfaceStudy;

public class SmartWatch implements Inet,Iphoto{

	@Override
	public void photo() {
		System.out.println("�����ֱ��������");
	}

	@Override
	public void network() {
		System.out.println("�����ֱ��������");
	}

	//����ӿ������������ķ�������д�ӿ��������ķ���
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		Inet.super.connect();
		System.out.println("������SmartWatch����дInet�ӿ��е�connect����");
	}
}
