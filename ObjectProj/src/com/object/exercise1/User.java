package com.object.exercise1;
/*
 * 编写自定义类实现用户信息类。
 * 要求：

        1、 设计构造函数实现对属性赋值

        2、 设置私有属性，get/set方法实现对属性的访问

        3、用户信息验证判断两个用户信息是否一致。当用户名和密码都一致的时候返回：用户名和密码一致，否则返回：用户名或密码不一致
 * */
public class User {
	 //定义属性用户名、密码
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
