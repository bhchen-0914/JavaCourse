package com.study6_method;
/*
 * �ɱ�����б�
 * ������... n��
 * �ɱ�����б�ķ�����������
 * �ĵ�ע��
 * */

/**
 * ���ڿɱ�����б�ķ�����������
 * @author bhchen3
 * @version 1.0
 *
 */

public class Class6 {
	
	//����һ�� ������ۼӺ͵ķ���
	public void sum(int... n) {
		System.out.println("�ɱ�����б�ķ�����");
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println("sum:"+sum);
	}
	
	//����һ���ڿɱ�����б��в���ֵ�ķ���
	//�����������2����2�����ϲ���ʱ���ɱ����Ҫ�������
	public void findElement(int element,int... n) {
		boolean flag=false;
		for(int i:n) {
			if(i==element) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("�ҵ���");
		}else {
			System.out.println("û�ҵ�");
		}
	}
	
	public void sum(int a,int b) {
		System.out.println("�����ɱ�����б�ķ�����");
		System.out.println("sum:"+(a+b));
	}

	public static void main(String[] args) {
		// ����sum����
		Class6 class6 =new Class6();
		class6.sum(1,2,3);
		class6.sum(3,4,5,6,7,8,9);
		
		class6.findElement(100, 1,101,1000,20);
		int intArray[] = {1,2,3,4,5};
		//�ɱ�����б�Ҳ������ͬ��������
		class6.findElement(3, intArray);
		
		//�ɱ�����б����ڵķ�������󱻷��ʵ�
		class6.sum(1,9);

	}

}
