package com.object.exercise2;


/**
 * ѧ����
 * @author bhchen3
 *
 */
public class Student {
	//��Ա���ԣ�ѧ�š��Ա�����������
	private String studentNo;
	private String studentSex;
	private String studentName;
	private int studentAge;
	//����רҵ���ԣ��������ҽ��ܵķ���
	private Subject studentSubject;
	
	//�޲ι��췽��
	public Student() {}
	
	//���ι��췽��
	public Student(String studentNo, String studentSex, String studentName, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
	}

	//��ȫ�������Ĺ��췽��
	public Student(String studentNo, String studentSex, String studentName, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
		this.getStudentSubject().addStudent(this);  //��ѧ����רҵ������
	}

	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		if(studentSex.equals("��")|studentSex.equals("Ů")) {
			this.studentSex = studentSex;
		}else {
			System.out.println("����ֵ�Ƿ�");
			this.studentSex="��";
		}
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	
	//����������0������Ĭ��Ϊ18
	public void setStudentAge(int studentAge) {
		if(studentAge<=0) {
			System.out.println("����������0");	
			this.studentAge=18;
			return;
		}
		this.studentAge=studentAge;
	}

	
	/**
	 * ���רҵ����û��ʵ��������ʵ�������ٷ���
	 * @return ����רҵ��Ϣ����
	 */
	public Subject getStudentSubject() {
		if(this.studentSubject==null) {
			this.studentSubject=new Subject();
		}
		return studentSubject;
	}
	

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}
	
	public String introduction() {
		String string = "ѧ����Ϣ���£�\n����:" + this.getStudentName() + "\n����:" + this.getStudentAge() + "\nѧ��:"
				+ this.getStudentNo() + "\n�Ա�:" + this.getStudentSex() + "\n��ѧרҵ:"
				+ this.getStudentSubject().getSubjectName();
		return string;
	}
	
	
}
