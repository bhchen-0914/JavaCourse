package com.tool.set;

import java.util.ArrayList;
import java.util.List;
/*
 * list�������������ظ��ļ���
 * */
public class ListDemo1 {

	/*
	 * ��ArrayList���������Ե����ƣ������
	 * ������"java","C","C++","Go","python"
	 * */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); //��̬
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("python");
		
		//����б���Ԫ�صĸ���
		System.out.println("�б��е�Ԫ�ظ���Ϊ��"+list.size());
		
		//���������������
		System.out.println("******************");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		//�Ƴ��б��е�C++
		System.out.println();
		list.remove(2); //ͨ���Ƴ�����ֵ�ķ���
		System.out.println("******************");
		System.out.println("�Ƴ�C++����б�Ԫ�أ�");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.remove("Go"); //ͨ���Ƴ�"Go"�ַ�������ķ���
		System.out.println("�Ƴ�Go����б�Ԫ�أ�");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
