package com.object.innerClass;


/**
 * �����ڲ���
 * @author bhchen3
 *�������ⲿ�����е��ڲ��࣬Ҳ����Ϊ�ֲ��ڲ���
 */
public class Person3 {
	
	/*
	 * �����ڲ��ࣺ
	 * 1.�����ڷ����ڲ������÷�ΧҲ�ڷ�����
	 * 2.�ͷ����ڲ���Աʹ�ù���һ����classǰ���ܼ�public��private��protected��static�ؼ���
	 * 3.���в��ܰ�����̬��Ա
	 * 4�����п��԰���final��abstract���εĳ�Ա
	 * */
	public Object getHeart() {
		class Heart {
			public int age=12;
			
			public String say() {
				return "hello";
			}
			
			public String beats() {
				return +age+"�������������,"+ say();
			}
		}
		return new Heart().beats();
	}
	

}
