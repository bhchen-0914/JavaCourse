package com.office.message;

public class Employee {
	//成员属性：姓名、工号、年龄、性别、所属部门、职务信息
	private String empName;
	private String empId;
	private int empAge;
	private String empSex;
	private Department empDepartment;
	private Post emPost;
	
	//无参构造
	public Employee() {}

	//带参构造方法
	public Employee(String empName, String empId, int empAge, String empSex, Department empDepartment, Post emPost) {
		this.setEmpName(empName);
		this.setEmpId(empId);
		this.setEmpAge(empAge);
		this.setEmpSex(empSex);
		this.setEmpDepartment(empDepartment);
		this.setEmPost(emPost);
		this.getEmpDepartment().addEmployee(this); //在初始化Employee对象时，直接将员工添加到部门中
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	/**
	 * 限定年龄只能是18--65之间,反之则设置默认为18岁
	 * @param empAge 设置年龄
	 */
	public void setEmpAge(int empAge) {
		if(empAge<=18|empAge>=65) {
			System.out.println("员工年龄不在范围内，默认设置为18");
			this.empAge=18;
		}else {
			this.empAge = empAge;
		}
		
	}

	public String getEmpSex() {
		return empSex;
	}

	/**
	 * 限定性别只能是“男”或者“女”,反之则设置默认为"男"
	 * @param empSex 设置性别
	 */
	public void setEmpSex(String empSex) {
		if(empSex.equals("男")|empSex.equals("女")) {
			this.empSex = empSex;
		}else {
			System.out.println("员工性别输入错误，默认设置为男");
			this.empSex="男";
		}
		
	}

	/**
	 * 如果部门信息对象没有实例化，先实例化后再返回
	 * @return 返回部门信息对象
	 */
	public Department getEmpDepartment() {
		if(this.empDepartment==null) {
			this.empDepartment = new Department();
		}
		return empDepartment;
	}

	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}

	/**
	 * 如果职务信息对象没有实例化，先实例化后再返回
	 * @return 返回职务信息
	 */
	public Post getEmPost() {
		if(this.emPost==null) {
			this.emPost=new Post();
		}
		return emPost;
	}

	public void setEmPost(Post emPost) {
		this.emPost = emPost;
	}
	
	public String introduction() {
		String str = "姓名:" + this.getEmpName() + "\n工号:" + this.getEmpId() + "\n性别:" + this.getEmpSex() + "\n年龄:"
				+ this.getEmpAge() + "\n职务:" + getEmpDepartment().getDepartmentName() + this.getEmPost().getPostName()
				+ "\n=====================";
		return str;
	}
}
