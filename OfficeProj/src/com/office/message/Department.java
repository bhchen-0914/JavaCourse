package com.office.message;


public class Department {
	//成员属性：部门编号，部门名称、员工数组、部门内员工个数
	private String DepartmentNo;
	private String DepartmentName;
	private Employee[] myEmployees;
	private int empNumber;
	
    //无参构造
	public Department() {}
	
	//带参构造方法
	public Department(String departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}


	public String getDepartmentNo() {
		return DepartmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		DepartmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	
	/**
	 * 若包含此部门员工信息的数组未初始化，先初始化长度为100
	 * @return 返回包含此部门员工信息的数组
	 */
	public Employee[] getMyEmployees() {
		if(this.myEmployees==null) {
			this.myEmployees=new Employee[100];//设定部门人数为100人
		}
		return myEmployees;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}
	
	/**
	 * 将员工添加到数组
	 * 设置部门员工个数
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		for(int i=0;i<this.getMyEmployees().length;i++) {
			if(this.getMyEmployees()[i]==null) {
				this.getMyEmployees()[i]=emp;
				this.empNumber=i+1;
				break;
			}
		}
	}
	
}
