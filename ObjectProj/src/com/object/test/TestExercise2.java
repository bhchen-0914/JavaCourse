package com.object.test;
import com.object.exercise2.Student;
import com.object.exercise2.Subject;

public class TestExercise2 {

	public static void main(String[] args) {
		Subject sub1=new Subject("�������ѧ��Ӧ��", "J00001", 4);
		Student stu1=new Student("S01", "Ů", "Lucy", 20, sub1);
		Student stu2=new Student("S02", "��", "������", 22, sub1);
		System.out.println("sub1��������"+sub1.getStudentNumber());
		System.out.println(sub1.getMyStudents());
		
	}

}
