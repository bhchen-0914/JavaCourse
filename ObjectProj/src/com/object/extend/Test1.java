package com.object.extend;

public class Test1 {
	public static void main(String[] args ) {
		Cat cat1 =new Cat();
		cat1.color="��ɫ";//��˽�г�Ա��ֱ�ӷ���
		cat1.setName("coffee");
		cat1.setWeight(5.5);
		cat1.eat();
		cat1.myShow(); //������д�Ľ��
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Dog dog1=new Dog();
		dog1.color="��ɫ";
		dog1.setName("С��");
		dog1.setSex("�к�");
		dog1.run();
		dog1.myShow();
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Bird bird1=new Bird();
		bird1.setName("woody");
		//Ĭ�����ȵ���������д�ķ���
		bird1.setWingColor("red");
		bird1.fly();
		bird1.fly2();  //���ø���Ľ��

	}
}
