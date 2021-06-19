package com.object.encapsulation;
/*
 * ��װ��
 * �����ĳЩ��Ϣ����������ڲ����������ⲿ����ֱ�ӷ���
 * ͨ������ʵ�ֵķ�����ʵ�ֶ�������Ϣ�Ĳ����ͷ���
 * ���ض������Ϣ��ͬʱ�������ʵĽӿ�
 * */
public class CatEncapsulation {
	/*
	 * ��װʵ�ֵķ������裺
	 * 1.�޸����ԵĿɼ��ԣ�private��
	 * 2.����getter/setter����������Ϊpublic�������ԵĶ�д��
	 * 3.��getter/setter�����м������Կ������
	 * */
	
	
	String name;
	//�޸����ԵĿɼ���
	private int age;
	private String sex;
	
	//�Ƽ�ʹ��set������ɹ��췽���ĳ�ʼ��
	public CatEncapsulation(String name,int age, String sex) {
		this.name=name;
		this.setAge(age);
		this.setSex(sex);
	}
	
	public CatEncapsulation () {
		return;
	}
	
	//����get/set����,��������Ե�����
	//ע�⣺ֻ��getter������������ֻ�����ԣ�ֻ��setter������������ֻд����
	public void setAge(int age) {
		if(age<=0|age>20) {
			System.out.println("age���ò�����");
		}else {
			this.age=age;
			System.out.println("Setting age successed!");
		}	
	}
	
	public int getAge() {
		return this.age;
	}

	//Source-->Generate Getters and Setters �����Զ�����get/set����
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if(sex=="M"|sex=="FM") {
			this.sex = sex;
			System.out.println("Setting sex successed!");
		}else {
			System.out.println("sex���ò�����");
		}
	}
	
	
}
