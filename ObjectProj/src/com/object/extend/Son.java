package com.object.extend;

public class Son extends Father{
	public static int num3=24;
	
	static {
		System.out.println("��������ľ�̬�����");
	}
	public Son(){
		System.out.println("����������޲ι��췽��");
	}
	
	public Son(String name,int age){
		//���๹��Ĭ�ϵ��ø����޲ι��췽��
		System.out.println("��������Ĵ��ι��췽��");
		this.setName(name);
		this.setAge(age);
	}
		
	
	{
		System.out.println("��������Ĺ�������");
	}
}
