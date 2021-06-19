package com.object.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingletonOne s1=new SingletonOne(); 无法直接创建实例对象
		SingletonOne one=SingletonOne.getInstance();
		SingletonOne two=SingletonOne.getInstance();
		//两个实例的引用相同，单例模式成功
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
