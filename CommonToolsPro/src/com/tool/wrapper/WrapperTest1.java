package com.tool.wrapper;
/**
 * 
 * @author bhchen3
 *�����������ͺͰ�װ��֮���ת��
 */
public class WrapperTest1 {

	public static void main(String[] args) {
		/*
		 * װ�䣺�ѻ�����������ת���ɰ�װ��
		 * �Զ�װ��
		 * �ֶ�װ��
		 * */ 

		//�Զ�װ��
		int t1=2;
		Integer t2=t1;
		System.out.println("int����t1��ֵ:"+t1);
		System.out.println("Integer���Ͷ���t2��ֵ:"+t2);
		
		//�ֶ�װ��
		Integer t3=new Integer(t1);
		System.out.println("Integer���Ͷ���t3��ֵ:"+t3);
		
		//�Զ�����
		int t4=t2;
		System.out.println("�Զ������int����t4��ֵ:"+t4);
		
		//�ֶ�����
		int t5;
		t5=t2.intValue();
		System.out.println("�ֶ������int����t5��ֵ:"+t5);
		
		//�ֶ�����Ϊdouble����
		double d1=t2.doubleValue();
		System.out.println("�ֶ������double����d1��ֵ:"+d1);
	}

}
