package com.tool.set;

import java.util.Date;

/**
 * 
 * @author bhchen3
 *������
 *���ԣ�ID�����⡢�����ˡ�����ʱ��
 */
public class ListNoticeDemo {
	private int id; //ID
	private String title; //����
	private String creator; //������
	private Date creatTime; // ����ʱ��
	
	//�޲ι���
	public ListNoticeDemo() {
		
	}

	/**
	 * ���ι���
	 * @param id ID
	 * @param title ����
	 * @param creator ������
	 * @param creatTime ����ʱ��
	 */
	public ListNoticeDemo(int id, String title, String creator, Date creatTime) {
		super();
		this.setId(id);
		this.setTitle(title);
		this.setCreator(creator);
		this.setCreatTime(creatTime);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
	
	
	
	

}
