package com.tool.set;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author bhchen3
 *案例：公告管理
 */
public class ListNoticeTest {

	public static void main(String[] args) {
		// 创建Notice类，生成3条公告
		ListNoticeDemo notice1=new ListNoticeDemo(001, "欢迎来到steam", "管理员", new Date());
		ListNoticeDemo notice2=new ListNoticeDemo(002, "游戏打折啦！", "代理商", new Date());
		ListNoticeDemo notice3=new ListNoticeDemo(003, "开挂封号", "运营商", new Date());
		
		//添加公告
		ArrayList<ListNoticeDemo> noticeList=new ArrayList<ListNoticeDemo>();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//显示公告：
		System.out.println("公告的内容为：");
		for(int i=0;i<noticeList.size();i++) {
//			System.out.println(((Notice)(noticeList.get(i))).getTitle());
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//在第一条公告后添加一条新公告
		ListNoticeDemo notice4=new ListNoticeDemo(4, "更新补丁", "开发商", new Date());
		noticeList.add(1, notice4);
		System.out.println("添加完公告的内容为：");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//删除游戏打折的公告
		noticeList.remove(notice2); //remove notice对象的方法移除
		System.out.println("删除完公告的内容为：");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		noticeList.add(2, notice2);
		
		System.out.println("***********************");
		//删除游戏打折的公告
		noticeList.remove(2); //remove 索引位置的方法移除
		System.out.println("删除完公告的内容为：");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//将第一条公告的title改为：欢迎来到steam，欢迎剁手！
		notice1.setTitle("欢迎来到steam，欢迎剁手！");
		//在这个例子中，可以不用调用set方法，但如果要用一个新的实例化对象去替换时，
		//必须调用ArrayList的set方法
		noticeList.set(0,notice1);
		System.out.println("修改完公告的内容为：");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
	}

}
