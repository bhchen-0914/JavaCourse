package com.object.interfaceStudy;

public class Computer implements Inet{

	//���󷽷�������д
	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�������");	
		}
	
	//��дĬ�Ϸ�����Ҳ�ɲ���д
	@Override
	//ʵ��������д�ӿ��е�Ĭ�Ϸ���ʱ���ýӿ�Ĭ�Ϸ��������Ϊ��<�ӿ���>.super.<Ĭ�Ϸ�����>
	public void connect() {
		Inet.super.connect(); 
		System.out.println("�������ӵķ���");
	}	

}
