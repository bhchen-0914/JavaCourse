package com.object.test;
import com.object.exercise2.Student;
import com.object.exercise2.Subject;

public class TestExercise2 {

	public static void main(String[] args) {
		Subject sub1=new Subject("计算机科学与应用", "J00001", 4);
		Student stu1=new Student("S01", "女", "Lucy", 20, sub1);
		Student stu2=new Student("S02", "男", "吴彦祖", 22, sub1);
		System.out.println("sub1的人数："+sub1.getStudentNumber());
		System.out.println(sub1.getMyStudents());
		
	}

}
