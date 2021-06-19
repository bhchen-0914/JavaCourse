package com.object.animal;
/**
 * 实例化对象
 * new 关键字
 * @author bhchen3
 *
 */
public class CatTest {

	public static void main(String[] args) {
		/*
		 * Cat cat1 的含义是声明对象，它在栈里开辟了一块名为cat1的内存空间，但此时还不能使用它,因为空间内为空
		 * new Cat() 的含义是实例化对象，它在堆内存里开辟了一块空间，完成了对象的初始化操作
		 * 栈内存与堆内存之间用=关联，将堆中的内存地址存放在栈中
		 * */
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		//调用对象的方法
		cat1.run();
		cat1.speek();
		cat1.eat();
		//成员属性没有初始化也可以打印输出，String类型默认值为null
		System.out.println(cat1.name);
		System.out.println(cat1.age);//int类型默认为0
		System.out.println(cat1.weigth);//double类型默认为0.0
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		//给成员属性赋值
		cat1.name="coffee";
		cat1.age=2;
		cat1.weigth=6.5;
		cat1.type="xianluo";
		System.out.println("name:"+cat1.name);
		System.out.println("age:"+cat1.age);
		System.out.println("weigth:"+cat1.weigth);
		System.out.println("type:"+cat1.type);
		
		//赋值后调用方法
		cat1.run(cat1.name);
		cat1.eat(cat1.name, "big fish");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		//给cat2附上同样的成员属性
		cat2.name="coffee";
		cat2.age=2;
		cat2.weigth=6.5;
		cat2.type="xianluo";
		
		System.out.println("cat2:"+"name:"+cat2.name);
		System.out.println("cat2:"+"age:"+cat2.age);
		System.out.println("cat2:"+"weigth:"+cat2.weigth);
		System.out.println("cat2:"+"type:"+cat2.type);
		
		cat2.age=3;  //修改cat2的属性，不会影响cat1的属性，说明通过new关键字实例化的
					//对象之间是相互独立的
		System.out.println("cat1:"+"age:"+cat1.age);
		System.out.println("cat2:"+"age:"+cat2.age);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		//另一种实例化的方式，将对象cat1在栈中存放的内存地址，直接赋值给cat3，这两个对象
		//之间是相关联的
		Cat cat3 = cat1;
		System.out.println("cat3:"+"name:"+cat3.name);
		cat3.weigth=7;
		System.out.println("cat1:"+"weigth:"+cat1.weigth);
	}

}
