package com.tool.set;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author bhchen3
 *�������������
 */
public class ListNoticeTest {

	public static void main(String[] args) {
		// ����Notice�࣬����3������
		ListNoticeDemo notice1=new ListNoticeDemo(001, "��ӭ����steam", "����Ա", new Date());
		ListNoticeDemo notice2=new ListNoticeDemo(002, "��Ϸ��������", "������", new Date());
		ListNoticeDemo notice3=new ListNoticeDemo(003, "���ҷ��", "��Ӫ��", new Date());
		
		//��ӹ���
		ArrayList<ListNoticeDemo> noticeList=new ArrayList<ListNoticeDemo>();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		
		//��ʾ���棺
		System.out.println("���������Ϊ��");
		for(int i=0;i<noticeList.size();i++) {
//			System.out.println(((Notice)(noticeList.get(i))).getTitle());
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//�ڵ�һ����������һ���¹���
		ListNoticeDemo notice4=new ListNoticeDemo(4, "���²���", "������", new Date());
		noticeList.add(1, notice4);
		System.out.println("����깫�������Ϊ��");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//ɾ����Ϸ���۵Ĺ���
		noticeList.remove(notice2); //remove notice����ķ����Ƴ�
		System.out.println("ɾ���깫�������Ϊ��");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		noticeList.add(2, notice2);
		
		System.out.println("***********************");
		//ɾ����Ϸ���۵Ĺ���
		noticeList.remove(2); //remove ����λ�õķ����Ƴ�
		System.out.println("ɾ���깫�������Ϊ��");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
		System.out.println("***********************");
		//����һ�������title��Ϊ����ӭ����steam����ӭ���֣�
		notice1.setTitle("��ӭ����steam����ӭ���֣�");
		//����������У����Բ��õ���set�����������Ҫ��һ���µ�ʵ��������ȥ�滻ʱ��
		//�������ArrayList��set����
		noticeList.set(0,notice1);
		System.out.println("�޸��깫�������Ϊ��");
		for(int i=0;i<noticeList.size();i++) {
			System.out.println(noticeList.get(i).getId() + ":" + noticeList.get(i).getTitle());
		}
		
	}

}
