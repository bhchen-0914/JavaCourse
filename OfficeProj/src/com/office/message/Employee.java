package com.office.message;

public class Employee {
	//��Ա���ԣ����������š����䡢�Ա��������š�ְ����Ϣ
	private String empName;
	private String empId;
	private int empAge;
	private String empSex;
	private Department empDepartment;
	private Post emPost;
	
	//�޲ι���
	public Employee() {}

	//���ι��췽��
	public Employee(String empName, String empId, int empAge, String empSex, Department empDepartment, Post emPost) {
		this.setEmpName(empName);
		this.setEmpId(empId);
		this.setEmpAge(empAge);
		this.setEmpSex(empSex);
		this.setEmpDepartment(empDepartment);
		this.setEmPost(emPost);
		this.getEmpDepartment().addEmployee(this); //�ڳ�ʼ��Employee����ʱ��ֱ�ӽ�Ա����ӵ�������
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
	 * �޶�����ֻ����18--65֮��,��֮������Ĭ��Ϊ18��
	 * @param empAge ��������
	 */
	public void setEmpAge(int empAge) {
		if(empAge<=18|empAge>=65) {
			System.out.println("Ա�����䲻�ڷ�Χ�ڣ�Ĭ������Ϊ18");
			this.empAge=18;
		}else {
			this.empAge = empAge;
		}
		
	}

	public String getEmpSex() {
		return empSex;
	}

	/**
	 * �޶��Ա�ֻ���ǡ��С����ߡ�Ů��,��֮������Ĭ��Ϊ"��"
	 * @param empSex �����Ա�
	 */
	public void setEmpSex(String empSex) {
		if(empSex.equals("��")|empSex.equals("Ů")) {
			this.empSex = empSex;
		}else {
			System.out.println("Ա���Ա��������Ĭ������Ϊ��");
			this.empSex="��";
		}
		
	}

	/**
	 * ���������Ϣ����û��ʵ��������ʵ�������ٷ���
	 * @return ���ز�����Ϣ����
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
	 * ���ְ����Ϣ����û��ʵ��������ʵ�������ٷ���
	 * @return ����ְ����Ϣ
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
		String str = "����:" + this.getEmpName() + "\n����:" + this.getEmpId() + "\n�Ա�:" + this.getEmpSex() + "\n����:"
				+ this.getEmpAge() + "\nְ��:" + getEmpDepartment().getDepartmentName() + this.getEmPost().getPostName()
				+ "\n=====================";
		return str;
	}
}
