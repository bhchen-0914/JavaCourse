package com.office.message;


public class Department {
	//��Ա���ԣ����ű�ţ��������ơ�Ա�����顢������Ա������
	private String DepartmentNo;
	private String DepartmentName;
	private Employee[] myEmployees;
	private int empNumber;
	
    //�޲ι���
	public Department() {}
	
	//���ι��췽��
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
	 * �������˲���Ա����Ϣ������δ��ʼ�����ȳ�ʼ������Ϊ100
	 * @return ���ذ����˲���Ա����Ϣ������
	 */
	public Employee[] getMyEmployees() {
		if(this.myEmployees==null) {
			this.myEmployees=new Employee[100];//�趨��������Ϊ100��
		}
		return myEmployees;
	}
	
	public int getEmpNumber() {
		return empNumber;
	}
	
	/**
	 * ��Ա����ӵ�����
	 * ���ò���Ա������
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
