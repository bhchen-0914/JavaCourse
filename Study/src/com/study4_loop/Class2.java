package com.study4_loop;

import java.util.Scanner;


/*
do whileѭ��:
do{
    ��䣻
}while(ѭ������)��
*/
public class Class2 {

	public static void main(String[] args) {
		// do whileѭ����1~100�ۼӺ�
		int num=1,sum=0;
		do {
			sum=sum+num;
			num++;
		}while(num<=100);
		System.out.println("1��100�ۼӺ�Ϊ��"+sum);
		System.out.println("��ʱnum��ֵΪ��"+num);

		//������Ϸ����һ��1~20֮������֣����²�ֵ��ʵ��ֵ���бȽϣ�������ʾ
		//ֱ���²���ȷ
		
		//����һ��20���ڵ������,Math.random()��ʾ�������һ��[0��1��֮��ĸ���������
		//Math.random()*20 ���ʾ[0��20��֮ǰ���������+1�����[1��21���������Ҳ�Ǹ�����
		int number = (int) (Math.random()*20+1); 
		System.out.println("number:"+number);
		int guess;
		do{
			System.out.println("������²����:");
			Scanner sc = new Scanner(System.in);
			guess=sc.nextInt();
			if(guess<number) {
				System.out.println("��С��");
			}else if (guess>number) {
				System.out.println("�´���");
			}else {
				System.out.print("�¶���,");
			}
		}while(guess!=number);	
		System.out.println("��ȷֵΪ��"+guess);
	}
}
