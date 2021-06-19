package com.tool.set;

import java.util.Date;

/**
 * 
 * @author bhchen3
 *公告类
 *属性：ID、标题、创建人、创建时间
 */
public class ListNoticeDemo {
	private int id; //ID
	private String title; //标题
	private String creator; //创建人
	private Date creatTime; // 创建时间
	
	//无参构造
	public ListNoticeDemo() {
		
	}

	/**
	 * 带参构造
	 * @param id ID
	 * @param title 标题
	 * @param creator 创建人
	 * @param creatTime 创建时间
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
