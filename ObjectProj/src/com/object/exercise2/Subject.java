package com.object.exercise2;


/**
 * 学科类
 * @author bhchen3
 *
 */
public class Subject {
	//成员属性：学科名称、学科编号、学制年限
	private String subjectName;	
	private String subjectNo;
	private int subjectLife;
	//定义一个数组，用于存放该填报学科的人数
	private Student[] myStudents;
	private int studentNumber; //统计选修的学生人数
	
	//无参构造方法，建议设置
	public Subject() {
		
	}
	
	//设置带参构造方法
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}


	//带有所有参数的构造方法
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
	
	//设置年限，必须大于0，否则默认为1
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0) {
			System.out.println("学制年限必须大于0");
			this.subjectLife=1;
			return;
		}
		this.subjectLife=subjectLife;
	}
	
	public int getSubjectLife() {
		return this.subjectLife;
	}

	/**
	 * 获取选修专业的学生信息，如果保存学生信息的数组未初始化，则先初始化长度200
	 * @return 返回包含选修此专业的学生信息的数组
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null) {
			this.myStudents=new Student[200];//默认长度为200
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
	 * 1.将学生保存到数组中
	 * 2.将学生个数保存到studentNu	mber中
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
