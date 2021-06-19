package com.object.exercise2;


/**
 * ѧ����
 * @author bhchen3
 *
 */
public class Subject {
	//��Ա���ԣ�ѧ�����ơ�ѧ�Ʊ�š�ѧ������
	private String subjectName;	
	private String subjectNo;
	private int subjectLife;
	//����һ�����飬���ڴ�Ÿ��ѧ�Ƶ�����
	private Student[] myStudents;
	private int studentNumber; //ͳ��ѡ�޵�ѧ������
	
	//�޲ι��췽������������
	public Subject() {
		
	}
	
	//���ô��ι��췽��
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}


	//�������в����Ĺ��췽��
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}

	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
	}
	
	public String getSubjectName() {
		return this.subjectName;
	}
	
	public void setSubjectNo(String subjectNo){
		this.subjectNo=subjectNo;
	}
	
	public String getSubjectNo() {
		return this.subjectNo;
	}
	
	//�������ޣ��������0������Ĭ��Ϊ1
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0) {
			System.out.println("ѧ�����ޱ������0");
			this.subjectLife=1;
			return;
		}
		this.subjectLife=subjectLife;
	}
	
	public int getSubjectLife() {
		return this.subjectLife;
	}

	/**
	 * ��ȡѡ��רҵ��ѧ����Ϣ���������ѧ����Ϣ������δ��ʼ�������ȳ�ʼ������200
	 * @return ���ذ���ѡ�޴�רҵ��ѧ����Ϣ������
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null) {
			this.myStudents=new Student[200];//Ĭ�ϳ���Ϊ200
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
		
	}
	
	public int getStudentNumber() {
		return this.studentNumber;
	}
	
	public void addStudent(Student stu) {
	/*
	 * 1.��ѧ�����浽������
	 * 2.��ѧ���������浽studentNu	mber��
	 * */	
		for(int i=0;i<this.getMyStudents().length;i++) {
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i]=stu;
				this.studentNumber=i+1;
				break;
			}
		}
	}
}
