package com.object.extend;

public class Test2 {

	public static void main(String[] args) {
		Son son=new Son();
		System.out.println(son.temp);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Son son2=new Son("ะกร๗", 16);
		System.out.println(son2.getName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Son2 son3=new Son2("Tom", 20);
		System.out.println(son3.getAge());
	}

}
