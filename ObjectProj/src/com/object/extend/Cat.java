package com.object.extend;
/*
 * @Overrideע��
 * ע���ڷ���ǰ�������˷�������д���෽��
 * �ɼ����д�Ƿ������д�߼�
 * */

public class Cat extends Animal{
	private double weigth; //cat�����г�Ա
	
	/**
	 * �޲ι���
	 */
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name, age);
	}
	
	public void setWeight(double weigth) {
		this.weigth = weigth;
	}
	
	public double getWeight() {
		return this.weigth;
	}
	
	//cat ���еķ���
//	@Override  �˷���������д�ķ���������ʧ��
	public void eat() {
		System.out.println(this.getName()+"ϲ������");
	}
	
	/*
	 * �������أ�
	 * 1.��ͬһ������
	 * 2.��������ͬ�������б�ͬ(˳�򡢸���������)
	 * 3.��������ֵ���������η�����
	 * 4.�����뷽���������޹�
	 * */
	
	/*
	 * ��������д����д����
	 * 1.���м̳й�ϵ��������	
	 * 2.��������ͬ�������б���ͬ��˳�򡢸��������ͣ�������ֵ��ͬ��������������ֵ����������
	 * 3.�����������η������б仯�����ʷ�Χ��Ҫ���ڵ��ڸ���ķ��ʷ�Χ
	 * 4.�뷽���������޹� 
	 * */
	@Override  //��д���෽���ɹ�
	public void myShow() {
		System.out.println(this.getName()+"is a cat");	
	}
	
	//��дObject���е�toString����
	@Override
	public String toString() {
		return "name:"+this.getName()+";"+"age:"+this.getAge();
	}
}
