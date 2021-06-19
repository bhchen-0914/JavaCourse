package com.object.exercise2;


/**
 * 学生类
 * @author bhchen3
 *
 */
public class Student {
	//成员属性：学号、性别、姓名、年龄
	private String studentNo;
	private String studentSex;
	private String studentName;
	private int studentAge;
	//新增专业属性，用于自我介绍的方法
	private Subject studentSubject;
	
	//无参构造方法
	public Student() {}
	
	//带参构造方法
	public Student(String studentNo, String studentSex, String studentName, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
	}

	//带全部参数的构造方法
	public Student(String studentNo, String studentSex, String studentName, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
		this.getStudentSubject().addStudent(this);  //将学生与专业关联。
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
		if(studentSex.equals("男")|studentSex.equals("女")) {
			this.studentSex = studentSex;
		}else {
			System.out.println("输入值非法");
			this.studentSex="男";
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
	
	//年龄必须大于0，否则默认为18
	public void setStudentAge(int studentAge) {
		if(studentAge<=0) {
			System.out.println("年龄必须大于0");	
			this.studentAge=18;
			return;
		}
		this.studentAge=studentAge;
	}

	
	/**
	 * 如果专业对象没有实例化，先实例化后再返回
	 * @return 返回专业信息对象
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
		String string = "学生信息如下：\n姓名:" + this.getStudentName() + "\n年龄:" + this.getStudentAge() + "\n学号:"
				+ this.getStudentNo() + "\n性别:" + this.getStudentSex() + "\n所学专业:"
				+ this.getStudentSubject().getSubjectName();
		return string;
	}
	
	
}
