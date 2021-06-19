package com.object.extend;
/**
 * 总结super
 * @author bhchen3
 *访问父类成员方法： super.	print();
 *访问父类成员属性:    super.name;
 *访问父类构造方法： super();
 */

public class Son2 extends Father{
	public Son2(String name, int age) {
		/*
		 * 可以通过super()关键字调用父类允许被访问的其他构造方法
		 * super()必须放在子类构造方法有效代码的第一行
		 * */
		super(name, age);
		System.out.println("我是子类Son2的带参构造方法");
	}
}
