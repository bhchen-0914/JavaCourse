package com.object.animal;

public class DogTest {

	public static void main(String[] args) {
		//ʵ��������ʱ�����췽���Զ�����
		DogDeemo dogDeemo=new DogDeemo();
		dogDeemo.run();
		
		//���ι��췽��
		DogDeemo dog1=new DogDeemo("tiger",2);
		System.out.println("name:"+dog1.name+"  age:"+dog1.age);  //���췽����ʼ���ɹ�
		
		DogDeemo dog2=new DogDeemo("wow",1,5.02);
		System.out.println("dog2:"+"name:"+dog2.name);
		System.out.println("dog2:"+"age:"+dog2.age);
		System.out.println("dog2:"+"weight:"+dog2.weight);	
		dog2.eat();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		DogDeemo dog3;
		dog3=new DogDeemo(2);
		System.out.println("dog3:"+"name:"+dog3.name);
		System.out.println("dog3:"+"age:"+dog3.age);
	}

}
