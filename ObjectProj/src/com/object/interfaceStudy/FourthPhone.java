package com.object.interfaceStudy;

public class FourthPhone extends ThirdPhone implements Iphoto,Inet{
//	public void photo() {
//		System.out.println("�ֻ���������");
//	}
	
//	public void network() {
//		System.out.println("�ֻ���������");
//	}
	
	public void game() {
		System.out.println("�ֻ���������Ϸ");
	}

	//��д�ӿ���ķ���
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ���������");
	}
	//��д�ӿ���ķ������Զ���publicʵ��
	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ���������");
		
	
	}

	//������д�ӿ������������������������ͬ�������������ʱ���ȵ����ڸ����м̳еķ���
	@Override
	public void connect() {
		System.out.println("������phone���е�connect����");
	}

}
