package com.office.message;

public class Post {
	//成员属性：职务编号、职务名称
	private String postNo;
	private String postName;
	
	//无参构造方法
	public Post() {}
	
	//带参构造
	public Post(String postNo, String postName) {
		this.setPostNo(postNo);
		this.setPostName(postName);
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}
	
}
