package com.office.message;

public class Post {
	//��Ա���ԣ�ְ���š�ְ������
	private String postNo;
	private String postName;
	
	//�޲ι��췽��
	public Post() {}
	
	//���ι���
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
