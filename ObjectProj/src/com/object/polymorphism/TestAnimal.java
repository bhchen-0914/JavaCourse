package com.object.polymorphism;

public class TestAnimal {

	public static void main(String[] args) {

//		Animal one=new Animal();//1 抽象类不允许被实例化
		/*
		 * 向上转型、隐式	转型、自动转型
		 * 父类引用指向子类对象实例，可以调用子类重写父类的方法以及父类派生的方法
		 * 无法调用子类特有的方法
		 * 由小向大转型
		 * */
		Animal two=new Cat();//2
		Animal three=new Dog();//3

//		one.eat();
		two.eat();
		three.eat();
		//two.run();无法调用子类特有方法
		
		System.out.println("===============================");
		/*
		 *向下转型：
		 *子类引用指向父类对象，此处必须进行强转，可以调用子类特有方法
		 *必须满足转换条件
		 *instanceof运算符：可判断左边对象引用类型是否可满足右边类型实例特征，返回true/false	 
		 * */ 
		Cat tempCat=(Cat)two;
		tempCat.eat();
		tempCat.run();
		
		//instanceof运算符运用
		if(three instanceof Dog) {
			Dog tempDog=(Dog)three; 
			tempDog.eat();
			tempDog.sleep();
		}
		
		if(two instanceof Animal) {
			System.out.println("two is Animal");
		}
		
		if(two instanceof Object) {
			System.out.println("two is Object");
		}
		
//		if(one instanceof Cat) {
//			System.out.println("one is Cat");
//		}
	}

}
