package com.study4_loop;
/*
 * forѭ��
 * for(���ʽ1;���ʽ2;���ʽ3){
 * 		���
 * }
 * */

public class Class3 {

	public static void main(String[] args) {
		//ʹ��forѭ������1~100�ۼӺ�
		int sum=0;
		//n=1����ִ�У��ж�n<=100�ڶ���ִ�У�sum+=n ������ִ�У�n++���ִ��
		for(int n=1;n<=100;n++) {  //����ʹ��ʱ�������n
			sum+=n;
		}
		System.out.println("1~100�ۼӺͣ�"+sum);
//		System.out.println("n:"+n); �ᱨ����ΪnΪ�ֲ����������÷�Χֻ�ڶ������Ĵ���������Ч
//		Ҳ����ֻ��ѭ��������Ч
		
		//��forѭ�����ʽ2Ϊ��ʱ��Ĭ��Ϊtrue��ѭ������ֹͣ����ʹ��break����ѭ��
		int i=1;
		for(i=1;;i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}		
		}
		System.out.print("��ʱi��ֵ��"+i);
	}

}
