package com.study2;
/*
 * 1���������ͱ���m����ʼ��Ϊ10

2���������ͱ���n����ʼ��Ϊ5

3��������m��ֵ��3��n��ֵ��5

4����m��n��ƽ��ֵ������������ڱ���p��

5����m��ƽ������n��ƽ��������������ڱ���q��

6����p��q��ֵ��ӡ���
 * */

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������m�ĳ�ֵ��ֵΪ10������n�ĳ�ֵ��ֵΪ5
        int m=10,n=5;
   
    //����m��ֵ��3��n��ֵ��5
        m+=3;n+=5;
 
    //��m��n��ƽ��ֵ������������ڱ���p��
        double p = (m+n)/2;
    
    //��m��ƽ������n��ƽ��������������ڱ���q��
        
        float q = m*m * n*n;
    //��p��q��ֵ��ӡ���
        System.out.println("m��n��ƽ��ֵΪ��"+p);
        System.out.println("m��ƽ������n��ƽ��Ϊ��"+q);
	}

}
