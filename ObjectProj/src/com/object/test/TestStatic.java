package com.object.test;
import com.object.encapsulation.StaticDeemo;

/**
 * ���ڲ���static�ؼ���
 */
public class TestStatic {
	//��̬�����ִֻ��һ�Σ����������ڴ���ʵ��������ʱ������
	
	public static void main(String[] args) {
		StaticDeemo st1 =new StaticDeemo();
		st1.name="test1";
		st1.price=2000.0;
		//�Ƽ�ͨ�����������޸ľ�̬��Ա��StaticDeemo.price=1000.00��
		
		StaticDeemo st2=new StaticDeemo();
		st2.name="test2";
		st2.price=100.00;
		
		//static���εĳ�Ա��������ͬһ��洢�ռ䣬���2�������price�������һ���������ֵ
		System.out.println("stu1.name:"+st1.name);
		System.out.println("stu1.price:"+st1.price); //100.00
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("st2.name:"+st2.name);
		System.out.println("st2.price:"+st2.price); //100.00
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		//��static���εĳ�ԱҲ����Ϊ���Ա������ͨ������ֱ�ӷ���	
		System.out.println(StaticDeemo.price);
		
		//ͨ����Ա�������ʾ�̬����
		st2.test1();
		st1.test2();
		}
}
