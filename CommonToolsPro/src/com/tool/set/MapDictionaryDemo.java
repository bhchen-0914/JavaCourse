package com.tool.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDictionaryDemo {

	public static void main(String[] args) {
		/*
		 * ���һ�������ֵ�Ĺ���
		 * -�������Լ�����ע�ʹ洢��HashMap��
		 * -��ʾHashMap�е�����
		 * -����ĳ�����ʵ�ע�Ͳ���ʾ
		 * */
		
		Map<String, String> animal = new HashMap<String, String>();
		System.out.println("���������鵥�ʲ�ע�ͣ���ŵ�HashMap��");
		Scanner sc = new Scanner(System.in);
		//�������
		for (int i=0;i<3;i++) {
			System.out.println("������keyֵ��");
			String key = sc.next();
			System.out.println("������valueֵ��");
			String value = sc.next();
			animal.put(key, value); //ʹ��put�������Ԫ��
		}	
		
		//��ӡ���valueֵ
		System.out.println("***********************");
		System.out.println("ʹ�õ������������value");
		Iterator<String> iterator = animal.values().iterator(); //����valueֵ
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		
		//��ӡ���key��valueֵ
		//ͨ��entrSet����
		System.out.println();
		System.out.println("***********************");
		System.out.println("ͨ��entrySet�����õ�key-valueֵ");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry:entrySet) {
			System.out.print(entry.getKey()+"-");
			System.out.print(entry.getValue());
			System.out.println();
		}
		
		
		System.out.println("***********************");
		System.out.println("������Ҫ������");
		//ͨ�������ҵ�ע�Ͳ����
		//ʹ��keySet����
		String keyIn = sc.next();
		//1 ȡ��keySet
		Set<String> keySet = animal.keySet();
		//2����keySet
		for (String key:keySet) {
			if (keyIn.equals(key)) {
				System.out.println("�ҵ��ˣ�"+key+"-"+animal.get(key));
				break;
			}
		}
		sc.close();
	}

}
