package com.object.anonymous;
/**
 * 
 * @author bhchen3
 *匿名内部类适用场景：
 *1.只用到类的1个实例
 *2.类在定义后马上会用到
 *3.给类命名并不会导致代码更容易被理解
 */
public class PersonTest {

	//方案1：根据传入不同的人的类型，调用对应的read方法
	public void getRead(Man man) {
		man.read();
	}
	
	public void getRead(Womam woman) {
		woman.read();
	}
	
	//方案二，使用多态
	public void newRead(Person obj) {
		obj.read();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest test=new PersonTest();
		Man one=new Man();
		Womam womam=new Womam();
		test.getRead(one);
		test.getRead(womam);
	
		System.out.println("======================");
		
		test.newRead(womam);
		test.newRead(one);
		
		System.out.println("======================");
		//方案3 ：匿名内部类
		/*
		 * 1.匿名内部类没有类型名称、实例对象名称
		 * 2.编译后的文件命名：外部类：数字.class
		 * 3.无法使用private，public，protected，abstract，static修饰
		 * 4.无法编写构造方法，可通过构造代码块初始化属性
		 * 5.不能出现静态成员
		 * 6.匿名内部类可以实现接口，也可以继承父类，但不可兼得
		 * */
		test.newRead(new Person() {
			
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("学生学习课本");
			}
		});
		
		
	}

}
