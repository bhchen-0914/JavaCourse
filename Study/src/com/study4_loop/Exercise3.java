package com.study4_loop;
/*
1������ѭ�������������
2����һ������ѭ����������Ŀո��������εݼ���
   ע�⣺�����ǺźͿո�����Ļ����ռ�Ŀռ䲻ͬ�����Կ����ʵ������ո�������
   ����ÿ��ѭ������������ո������������ͼ�λ���ӽӽ�����
3���ڶ�������ѭ������ÿ��������Ǻ���
4�������һ�е��ǺźͿո����
 * */
public class Exercise3 {

	public static void main(String[] args) {
		int i=1,j=1,k=1;
	    for(i=1;i<=5;i++){
	        for(j=1;j<=5-i;j++){
	            System.out.print(" ");
	        }
	        for(k=1;k<=2*i+1;k++){
	             System.out.print("* ");
	        }
	         System.out.println();

	    }

	}

}
