package com.object.test;
import com.object.encapsulation.StaticDeemo;

/**
 * 用于测试static关键字
 */
public class TestStatic {
	//静态代码块只执行一次，构造代码块在创建实例化对象时便会调用
	
	public static void main(String[] args) {
		StaticDeemo st1 =new StaticDeemo();
		st1.name="test1";
		st1.price=2000.0;
		//推荐通过类来进行修改静态成员：StaticDeemo.price=1000.00；
		
		StaticDeemo st2=new StaticDeemo();
		st2.name="test2";
		st2.price=100.00;
		
		//static修饰的成员，都共用同一块存储空间，因此2个对象的price都是最后一个对象定义的值
		System.out.println("stu1.name:"+st1.name);
		System.out.println("stu1.price:"+st1.price); //100.00
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("st2.name:"+st2.name);
		System.out.println("st2.price:"+st2.price); //100.00
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		//被static修饰的成员也被称为类成员。可以通过类来直接访问	
		System.out.println(StaticDeemo.price);
		
		//通过成员方法访问静态属性
		st2.test1();
		st1.test2();
		}
}
