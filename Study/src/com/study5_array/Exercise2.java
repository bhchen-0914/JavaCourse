package com.study5_array;
/*
1������һ���ַ�����ch����ʼ��
2��ѭ���������飬ͳ���ַ���a����A�����ֵĴ��������
 * */

public class Exercise2 {

	public static void main(String[] args) {
		//����һ���ַ�����ch����ʼ��
	    char chrArray[]={'a','A','s','A','2','!','a'};
		int count=0;
		//ѭ���������飬ͳ���ַ���a����A�����ֵĴ���
//		 for(int i=0;i<chrArray.length;i++){
//		     if((chrArray[i]=='a')|(chrArray[i]=='A')){
//		         count++;
//		     }
//		 }
		for(char c:chrArray) {
			if(c=='a'|c=='A') {
				count++;
			}
		}

		//��ӡ���ͳ������
		System.out.println("�ַ������ַ�'a'��'A'���ֵĸ���Ϊ��"+count);

	}

}
