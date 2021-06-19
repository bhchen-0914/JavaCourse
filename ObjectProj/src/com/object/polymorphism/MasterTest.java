package com.object.polymorphism;


public class MasterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master=new Master();
		Cat cat1=new Cat();
		Dog dog1=new Dog();
		master.feed(cat1);
		master.feed(dog1);

		System.out.println("=============================");
		boolean isManyTime=false;
		Animal temp = master.raise(isManyTime);
		System.out.println(temp);
		temp.eat();
		Cat cat2=(Cat)temp;
		cat2.run();
		
	}

}
