package com.object.extend;
/**
 * �ܽ�super
 * @author bhchen3
 *���ʸ����Ա������ super.	print();
 *���ʸ����Ա����:    super.name;
 *���ʸ��๹�췽���� super();
 */

public class Son2 extends Father{
	public Son2(String name, int age) {
		/*
		 * ����ͨ��super()�ؼ��ֵ��ø����������ʵ��������췽��
		 * super()����������๹�췽����Ч����ĵ�һ��
		 * */
		super(name, age);
		System.out.println("��������Son2�Ĵ��ι��췽��");
	}
}
