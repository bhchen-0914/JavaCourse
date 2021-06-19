package com.object.extend;
/*
 * Object类是所有类的父类
 * 一个类没有使用extends关键字明确标识继承关系，则默认继承Object类(包括数组)
 * java中每个类都能使用Object中定义的方法
 * */

/*
 * final class:该类，没有子类  public final class/final public class
 * final 方法： 该方法不允许被子类重写，但可以正常被子类继承使用
 * final 方法内局部变量：只要在具体使用之前赋值即可，一旦赋值就不允许被修改
 * final 类中成员属性： 赋值操作：1.定义时初始化  2.构造方法中赋值  3.构造代码块赋值 (不允许不赋值)
 * */
public class ObjectStudy {
	public static void main(String[] args) {
		Cat cat1=new Cat("coffee", 2);
		Cat cat2=new Cat("ton", 3);
		Cat cat3=cat1;
		//equals测试:继承Object类中的equals方法时。比较的是2个引用是否指向同一个对象
		boolean flag=cat1.equals(cat2);
		System.out.println("cat1和cat2的引用比较:"+flag);
		System.out.println("cat1和cat2的引用比较:"+(cat1==cat2));
		System.out.println("cat1和cat3的引用比较:"+cat1.equals(cat3));
		System.out.println("==================");
		String str1=new String("hello");
		String str2=new String("hello");
//		String str1="hello";
//		String str2="hello";
		//String 类中equals方法被重写，比较的只是字符串的值
		flag = str1.equals(str2);
		System.out.println("str1和str2的引用比较:"+flag);
		System.out.println("str1和str2的引用比较:"+(str1==str2));
		
		System.out.println("==================");
		//可以通过重写equals方法，使对象只比对传入数据的值
		Bird bird1=new Bird("woody", 1, "white");
		Bird bird2=new Bird("woody", 1, "white");
		Bird bird3=new Bird("woody2", 1, "white");
		System.out.println("bird1和bird2的equals比较:"+bird1.equals(bird2));
		System.out.println("bird1和bird3的equals比较:"+bird1.equals(bird3));
		System.out.println("bird1和bird2的引用比较:"+ (bird1==bird2));
		
		System.out.println("==================");
		/*
		 * toString测试：
		 * 1.输出对象名时，默认会直接调用对象中的toString方法
		 * 2.继承Object中的toString方法时，输出对象字符串的表现形式：类型信息+@+地址信息
		 * 3.子类可以通过重写toString方法的形式，改变输出的内容以及表现形式
		 * */
		System.out.println(bird1);
		System.out.println(bird1.toString()); //@1f32e575是他的内存地址
		System.out.println(cat1);
		System.out.println(cat2);
		
	}
}
	