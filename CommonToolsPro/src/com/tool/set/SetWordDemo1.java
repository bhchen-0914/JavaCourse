package com.tool.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWordDemo1 {

	public static void main(String[] args) {
		// ����ɫ��ӵ�HashSet��
		Set<String> colorSet = new HashSet<String>();
		
		//�򼯺������Ԫ��
		colorSet.add("blue");
		colorSet.add("red");
		colorSet.add("black");
		colorSet.add("yellow");
		colorSet.add("white");

		/*��ʾ��������
		 * ��ʾset������Ҫʹ�õ������ӿ�
		 *Iterator�ӿڿ�����ͳһ�ķ�ʽ�Ը��ּ���Ԫ�ؽ��б���
		 *hasNext()������⼯�����Ƿ�����һ��Ԫ��
		 *next�������ؼ����е���һ��Ԫ��
		 * */
		Iterator<String> iterator = colorSet.iterator(); //���õ�����
		System.out.println("�����е�Ԫ��Ϊ��");
		//���������������Ԫ��
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		
		System.out.println("***********************");
		//�ڼ����в����ظ�Ԫ��
		//�ظ���Ԫ�ز���ʧ�ܣ��Ӷ����������ݵ��ظ�(���ᱨ��)
		colorSet.add("black");
		iterator = colorSet.iterator();
		System.out.println("�����в����ظ�Ԫ�غ��Ԫ�ر���Ϊ��");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}

