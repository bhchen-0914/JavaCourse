package com.study2;

import java.util.Scanner;

/*
 * �߼��������������һ�������������ж���Щ�����Ƿ�������߼�������Ĳ�����������������ǲ���ֵ
 *�룺&& ��&
 *��|| ��|
 *�ǣ���
 * */
public class Class4 {

	public static void main(String[] args) {
		// ��������ϰ
		//��ѧ���ԣ�����Ӣ�ܳɼ����ڵ���300�֣���Ӣ����ڵ���90�ֲųɹ�
		int chscore = 100,mascore=109,enscore=90;
		int sum=chscore+mascore+enscore;
		if(sum>=300&enscore>=90) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
		
		//&��&&
		int n=3;
		boolean b1=(3>7)&((n++)<4);
		System.out.println("b1:"+b1+" n:"+n);
		n=3;
		boolean b2=(3>7)&&((n++)<4); //&&�Ƕ�·����������֮ǰ�ı��ʽ�Ϳ��Ծ������Ľ����������ִ�м������ı��ʽ��
		System.out.println("b2:"+b1+" n:"+n);
		
		// |��||
		int m=3;
		boolean b3=(3<7)|(m++)<4;
		System.out.println("b3:"+b3+" m:"+m);
		m=3;
		boolean b4=(3<7)||(m++)<4;
		System.out.println("b4:"+b4+" m:"+m); // ||Ҳ��һ����·�����������������
		
		// ��  �ж���������ܷ�3����
		System.out.println("������һ������");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		if(!(number%3==0)) {
			System.out.println(number+"���ܱ�3����");
		}else {
			System.out.println(number+"�ܱ�3����");
		}
	}

}
