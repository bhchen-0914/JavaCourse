package com.object.test;
import com.object.exercise3.Work;
import com.object.exercise3.TestWork;
import com.object.exercise3.DevelopmentWork;


public class TestExercise3 {
	public static void main(String[] args) {
		System.out.print("父类信息测试：");
		Work work=new Work();
		System.out.println(work.work());
	
		System.out.print("测试工作类信息测试：");
		TestWork test=new TestWork("测试工作",10,5);
		System.out.println(test.work());
		
		System.out.print("研发工作类信息测试：");
		DevelopmentWork development=new DevelopmentWork("研发工作",1000,10);
		System.out.println(development.work());
	}
}
