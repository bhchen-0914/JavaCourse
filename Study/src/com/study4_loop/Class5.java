package com.study4_loop;
/*
 * break��continue
 * */
public class Class5 {

	public static void main(String[] args) {
		//break������������ǰѭ�������ѭ������Ӱ��
		
		int i=0;
		for(int j=1;j<=5;j++) {
			for(int k=1;k<=5;k++) {
				i=j+k;
				if(k==3)
					break;
			}
		}
		System.out.println("i="+i); //�����8��break�����ڲ�ѭ�������ѭ����Ȼ�����
		
		
		//continue ��ʾ��������ѭ��
		//��1��3��5��7��9.....99�Ȳ����еĺ�
		int sum=0;
		for(int number=1;number<=100;number++) {
			if(number%2==0) {
				continue;
			}
			sum+=number;
			number++;
		}
		
		System.out.println("sum="+sum);
	}

}
