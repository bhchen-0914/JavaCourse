package com.object.animal;


/**
 * ��ʶ�������
 * ����è��
 * @author bhchen3
 *
 */
public class Cat {
	//��Ա���ԣ����֡����䡢���ء�Ʒ��
	String name;
	int age;
	double weigth;
	String type;
	
	//�������ܣ��У��Զ���
	public void run() {
		System.out.println("Cat is running");
	}
	
	public void speek() {
		System.out.println("mew~mew~");
	}
	
	public void eat() {
		System.out.println("Cat eat fish");
	}
	//����run����
	public void run(String name) {
		System.out.println(name+" is running");
	}
	
	//����eat����
	public void eat(String name,String food) {
		System.out.println(name+" is eating "+food);
	}
}
