package com.study6_method;
/*
 * �����������ʹ�ֵ����
 * ����Ĵ�ֵ
 * */
public class Class5 {
	
	//����һ��int������ֵ����
	public void exchange(int a,int b) {
		int temp;
		System.out.println("����ǰ��a="+a+",b="+b);
		temp=a;a=b;b=temp;
		System.out.println("������a="+a+",b="+b);
		
	}
	//����һ�����齻����ֵ�ķ���
	public void exchange(int[] arr) {
		arr[0]=100;
	}
	
	public void exchangeTest() {
		int m=3,n=8;
		System.out.println("test����  ����ǰ��m="+m+",n="+n);
		//�����������ͬ���·������������ʼ������
		exchange(m, n);
		//���ý��������������ֵ��û�иı䣬��Ϊ�ı��ֻ�Ǵ��ݵĲ�����ֵ
		System.out.println("test����  ������m="+m+",n="+n);
		
		
		int intArray[] = {1,2,3,4,5};
		System.out.println("��������ǰ�����һ��Ԫ��Ϊ��"+intArray[0]);
		exchange(intArray);
		// ���÷����������Ԫ�ص�ֵ�����˸ı䣬��Ϊ������������������
		System.out.println("�������ú������һ��Ԫ��Ϊ��"+intArray[0]);
	}

	public static void main(String[] args) {
		Class5 class5 = new Class5();
		class5.exchangeTest();

	}

}
