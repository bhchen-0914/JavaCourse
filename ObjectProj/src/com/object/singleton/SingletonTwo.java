package com.object.singleton;
/**
 * 
 * @author bhchen3
 *懒汉模式:类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始化操作
 *时间换空间
 */
public class SingletonTwo {
	//1.创建私有构造方法
	private SingletonTwo() {
		
	}
	//2.创建该类型的私有静态实例
	private static SingletonTwo instance=null;
	
	//3.创建公有的静态方法提供实例对象
	public static SingletonTwo getInstance() {
		if(instance==null) {
			instance=new SingletonTwo();
		}
		return instance;
	}
}
