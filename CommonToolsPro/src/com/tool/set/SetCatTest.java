package com.tool.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCatTest {

	public static void main(String[] args) {
		// ����cat����
		SetCatDemo cat1=new SetCatDemo("����", 1, "Ӣ����ëè");
		SetCatDemo cat2=new SetCatDemo("����", 2, "����è");
		
		Set<SetCatDemo> catSet=new HashSet<SetCatDemo>();
		//��Ŷ���
		catSet.add(cat1);
		catSet.add(cat2);
		
		//��ʾè����Ϣ
		Iterator<SetCatDemo> iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//���һ������һ���Ķ���
		//������дhashCode()��equals()���˶����ǻ���ӣ���Ϊ����2����ͬ�Ķ������õ��ڴ��ַ��ͬ
		SetCatDemo cat3 = new SetCatDemo("����", 2, "����è");
		catSet.add(cat3);
		System.out.println("***********************");
		System.out.println("����ظ���Ϣ��ĳ���è��Ϣ");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//����һ���µ���Ϣ
		SetCatDemo cat4 = new SetCatDemo("����", 2, "����è");
		catSet.add(cat4);
		System.out.println("***********************");
		System.out.println("�µ���Ϣ��ĳ���è��Ϣ");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//�ڼ����в��ҿ��ȵ���Ϣ�����
		if(catSet.contains(cat4)) {
			System.out.println("�ҵ���"+cat4.getName());
		}else {
			System.out.println("û�ҵ�");
		}
		
		//ͨ���������ϣ��������è����Ϣ
		System.out.println("***********************");
		System.out.println("�������ϲ�������è");
		iterator = catSet.iterator();
		SetCatDemo cat=null; //�յ�cat�࣬����ѭ���ڲ�����ʹ��next()������ɵ�����Խ���쳣
		while(iterator.hasNext()) {
			cat = iterator.next();
			if (cat.getSpecies().equals("����è")) {
				System.out.println(cat);
			}
		}

		System.out.println("***********************");
		//ɾ����������Ϣ,��ǿ��forѭ��
		for(SetCatDemo catDeemo:catSet) {
			if(catDeemo.getName().equals("����")) {
				catSet.remove(catDeemo);
				break;  //����break���׳�һ��ConcurrentModificationException�쳣����Ϊjava�����ƣ������ڶ�ȡ����ʱ�������������
			    }
			}
		System.out.println("ɾ�����������Ϣ");
		for(SetCatDemo catDeemo2:catSet) {
			System.out.println(catDeemo2);
		 	}
		
		SetCatDemo cat5 = new SetCatDemo("����", 5, "����");
		SetCatDemo cat6 = new SetCatDemo("����", 6, "��԰è");
		catSet.add(cat2);
		catSet.add(cat5);
		catSet.add(cat6);
		System.out.println("***********************");
		System.out.println("���ڵ�è����Ϣ");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//ɾ������4���è����Ϣ
		//��Ҫ����ɾ����è����Ϣ�����һ���Ӽ����������ConcurrentModificationException�쳣����Ϊ���ڶ������
		Set<SetCatDemo> catSet2 = new HashSet<SetCatDemo>();
		for (SetCatDemo cats:catSet) {
			if (cats.getAge()>4) {
				catSet2.add(cats);
			}
		}
		catSet.removeAll(catSet2); //������Ϊ����ʱ��������մ˼���
		System.out.println("***********************");
		System.out.println("�Ƴ�����4��è����Ϣ��");
		for (SetCatDemo cats:catSet) {
			System.out.println(cats);
		}
	}
}

