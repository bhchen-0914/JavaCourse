package com.study4_loop;
/*
 * Ƕ��ѭ��
 * */

public class Class4 {

	public static void main(String[] args) {
		// ʹ��whileѭ������ӡ10��10�е�*
		int i=1,j=1;
		while(i<=10) {
			while(j<=10) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			j=1;
			i++;
		}
		
		//��ӡ������*
		int m=1,n=1;
		while(m<=10) {
			while(n<=m) {
				System.out.print(" * ");
				n++;
			}
			System.out.println();
			n=1;
			m++; 
		}
		// ʹ��Ƕ��ѭ����׳�10���ۼӺ�
		int s=1,sum=0;
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=x;y++) {
				s*=y;  //s ���ڴ��ĳһ�׳˵�ֵ
			}
			sum+=s;
			s=1;  //��s���г�ʼ��
		}
		System.out.println("x�Ľ׳��ǣ�"+sum);
	} 

}
