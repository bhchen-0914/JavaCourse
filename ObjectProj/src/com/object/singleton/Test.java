package com.object.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingletonOne s1=new SingletonOne(); �޷�ֱ�Ӵ���ʵ������
		SingletonOne one=SingletonOne.getInstance();
		SingletonOne two=SingletonOne.getInstance();
		//����ʵ����������ͬ������ģʽ�ɹ�
		System.out.println(one);
		System.out.println(two);
		System.out.println(one.equals(two));
		
		System.out.println("==============================");
		SingletonTwo s1=SingletonTwo.getInstance();
		SingletonTwo s2=SingletonTwo.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
	}

}
