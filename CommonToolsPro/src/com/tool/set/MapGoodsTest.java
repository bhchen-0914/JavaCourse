package com.tool.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MapGoodsTest {

	/*
	 * ��ɶ���Ʒ������ɾ�Ĳ�Ĳ���
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����HashMap����
		Map<String, MapGoodsDemo> goodsMap = new HashMap<String, MapGoodsDemo>();
		System.out.println("������3����Ʒ��Ϣ");
		
		//�����Ʒ��Ϣ
		System.out.println("***********************");
		for(int i=0;i<3;i++) {
			System.out.println("�������"+(i+1)+"����Ʒ��Ϣ��");
			System.out.println("��������Ʒ���:");
			String goodsId = sc.next();
			//�жϱ���Ƿ��ظ�
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("��Ʒ����ظ�������������");
				i--;
				continue;
			}
			System.out.println("��������Ʒ����:");
			String goodsName = sc.next();
			System.out.println("��������Ʒ�۸�:");
			//��double�����쳣
			try {
				double goodsPrice = sc.nextDouble(); 
				MapGoodsDemo goods = new MapGoodsDemo(goodsId, goodsName, goodsPrice);
				goodsMap.put(goods.getId(), goods);	
			} catch (java.util.InputMismatchException e) {
				System.out.println("��������Ч����");
				sc.next();//���ڽ��մ��������
				i--;
				continue;
			} 
		}
		
		//����Map�������Ʒ��Ϣ
		System.out.println("ȫ����Ʒ��ϢΪ��");
		Iterator<MapGoodsDemo> iterator = goodsMap.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
