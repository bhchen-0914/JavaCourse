package com.object.exercise1;
/*
 * ��д�Զ�����ʵ���û���Ϣ�ࡣ
 * Ҫ��

        1�� ��ƹ��캯��ʵ�ֶ����Ը�ֵ

        2�� ����˽�����ԣ�get/set����ʵ�ֶ����Եķ���

        3���û���Ϣ��֤�ж������û���Ϣ�Ƿ�һ�¡����û��������붼һ�µ�ʱ�򷵻أ��û���������һ�£����򷵻أ��û��������벻һ��
 * */
public class User {
	 //���������û���������
	private String userName;
	private String passWord;
	
	public User(String userName,String passWord) {
		this.setUserName(userName);
		this.setPassWord(passWord);
	}
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
