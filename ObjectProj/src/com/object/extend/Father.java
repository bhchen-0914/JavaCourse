package com.object.extend;
/**
 * �̳еĳ�ʼ��˳��
 * @author bhchen3
 *
 */

/*
 * �̳еĳ�ʼ��˳��
 * �ٳ�ʼ�����ྲ̬��Ա
 * �ڳ�ʼ�����ྲ̬��Ա
 * �۸��������(��ʼ�������Ա����->���ʸ��๹������->�����޲ι��췽��)
 * �����������(��ʼ�������Ա����->�������๹������->�����޲ι��췽��)
 * 
 * �������η���Ӱ���Ա����˳�򣬸���дλ���й�
 * */
public class Father {
	public int temp=3;
	
	private String name;
	private int age;
	
	public Father(){
		System.out.println("���Ǹ�����޲ι��췽��");
	}
	
	
	
	public Father(String name, int age) {
		System.out.println("���Ǹ���Ĵ��ι��췽��");
		this.setAge(age);
		this.setName(name);
	}



	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private static int num1=22;
	public static int num2=23;
	
	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}
	
	{
		System.out.println("���Ǹ���Ĺ�������");
	}
	
	
}
