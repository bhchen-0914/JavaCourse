package com.office.test;

import com.office.message.Department;
import com.office.message.Employee;
import com.office.message.Post;

public class Test {

	public static void main(String[] args) {
		//ʵ����������
		Department personnelDepartment=new Department("D001", "���²�");
		Department marketingDepartment=new Department("D002", "�г���");
		Post manager=new Post("P001", "����");
		Post assistant=new Post("P002", "����");
		Post staff=new Post("P003", "ְԱ");
		Employee emp1=new Employee("����", "S001", 29, "��", personnelDepartment, manager);
		Employee emp2=new Employee("���", "S002", 21, "Ů", personnelDepartment, assistant);
		Employee emp3=new Employee("�ﳬ", "S003", 29, "��", personnelDepartment, staff);
		Employee emp4=new Employee("������", "S004", 26, "Ů", marketingDepartment, staff);
		Employee emp5=new Employee("����", "S005", 37, "��", marketingDepartment, manager);
		Employee emp6=new Employee("����", "S006",24 , "Ů", marketingDepartment, staff);
		
		//����
		System.out.println(emp1.introduction());
		System.out.println(emp2.introduction());
		System.out.println(emp3.introduction());
		System.out.println(emp4.introduction());
		System.out.println(emp5.introduction());
		System.out.println(emp6.introduction());
		System.out.println("���²��ܹ���"+personnelDepartment.getEmpNumber()+"��Ա��");
		System.out.println("�г����ܹ���"+marketingDepartment.getEmpNumber()+"��Ա��");
	}

}
