package com.study4_loop;
/*
 * whileѭ����
 * while����{
 * 	    ���
 * }
 * */
public class Class1 {

	public static void main(String[] args) {
		//��1~100�ۼӺ�
		int num=1,sum=0;
		while (num<=100) {
			sum+=num;
			num++;	
		}
		System.out.println("1~100�ۼӺ�Ϊ��"+sum);
		System.out.println("��ʱnum��ֵ�ǣ�"+num);
		
		//ѭ�����26����ĸ�����������
		char ch='a';
		int count=1;  //���ڿ��ƻ���
		while(ch<='z') {
			System.out.print(ch+" ");
			if(count==13) {
				System.out.println();
			}
			ch++;
			count++;
		}
	}

}
