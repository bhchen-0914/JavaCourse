package com.object.animal;


/**
 * ���췽����
 * @author bhchen3
 * this�ؼ���
 *
 */
public class DogDeemo {
/*
 * 1.���췽��������ͬ����û�з���ֵ
 * 2.�﷨��ʽ���������η�  ���췽����(����ָ��������){}
 * 3.ֻ���ڶ���ʵ������ʱ�����
 * 4.��û�й��췽��ʱ��ϵͳ���Զ�����޲εĹ��췽��
 * 5.����ָ�����췽�������۴��λ��޲Σ��������Զ�����޲ι��췽��
 * 6.һ��������ж�����췽��
 * */
	
	String name;
	int age;
	double weight;
	//�ֶ�����޲ι��췽��
	public DogDeemo() {
		System.out.println("�����޲ι��췽��");
	}
	
	public DogDeemo(String newname, int newage) {
		//���ݸ�ֵ�ľͽ�ԭ���������������������ı�����һ�£��޷���ʼ�������
		name=newname;
		age=newage;
		System.out.println("�����Ǵ��ι��췽��");
	}
	
	//this����������python�е�self
	public DogDeemo(String name, int age, double weight) {
		System.out.println("������ʹ��this�ؼ��ֵĹ��췽��");
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	//�ڹ��췽���е�����һ�����췽����ʹ��this(�����б�)���
	public DogDeemo(int age) {
		this("aaa",2);
	}
	
	public void eat() {
		System.out.println(this.name+" is eating");
		this.run();
	}
	
	public void run() {
		System.out.println(this.name+" is running");
	}
}
