package com.object.test;
import com.object.exercise3.Work;
import com.object.exercise3.TestWork;
import com.object.exercise3.DevelopmentWork;


public class TestExercise3 {
	public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		Work work=new Work();
		System.out.println(work.work());
	
		System.out.print("���Թ�������Ϣ���ԣ�");
		TestWork test=new TestWork("���Թ���",10,5);
		System.out.println(test.work());
		
		System.out.print("�з���������Ϣ���ԣ�");
		DevelopmentWork development=new DevelopmentWork("�з�����",1000,10);
		System.out.println(development.work());
	}
}
