package com.office.test;

import com.office.message.Department;
import com.office.message.Employee;
import com.office.message.Post;

public class Test {

	public static void main(String[] args) {
		//实例化各对象
		Department personnelDepartment=new Department("D001", "人事部");
		Department marketingDepartment=new Department("D002", "市场部");
		Post manager=new Post("P001", "经理");
		Post assistant=new Post("P002", "助理");
		Post staff=new Post("P003", "职员");
		Employee emp1=new Employee("张铭", "S001", 29, "男", personnelDepartment, manager);
		Employee emp2=new Employee("李艾爱", "S002", 21, "女", personnelDepartment, assistant);
		Employee emp3=new Employee("孙超", "S003", 29, "男", personnelDepartment, staff);
		Employee emp4=new Employee("张美美", "S004", 26, "女", marketingDepartment, staff);
		Employee emp5=new Employee("蓝迪", "S005", 37, "男", marketingDepartment, manager);
		Employee emp6=new Employee("米莉", "S006",24 , "女", marketingDepartment, staff);
		
		//测试
		System.out.println(emp1.introduction());
		System.out.println(emp2.introduction());
		System.out.println(emp3.introduction());
		System.out.println(emp4.introduction());
		System.out.println(emp5.introduction());
		System.out.println(emp6.introduction());
		System.out.println("人事部总共有"+personnelDepartment.getEmpNumber()+"名员工");
		System.out.println("市场部总共有"+marketingDepartment.getEmpNumber()+"名员工");
	}

}
