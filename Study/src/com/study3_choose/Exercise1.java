package com.study3_choose;
/*
1���������ͱ���x����ʼ��Ϊ-5

2���������ͱ���y����ʼ��0

3����������������ʹ�ö���if-else�ṹ��y��ֵ
 * */
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ͱ���x����ʼ��Ϊ-5
	    int x=-5;

        //�������ͱ���y����ʼ��0
        int y=0;

        //��������������ʹ�ö���if-else�ṹ��y��ֵ
        if(x<0){
            y=-1;
        }else if(x==0){
            y=0;
        }else{
            y=1;
        }

        //���x��y��ֵ
        System.out.println("x="+x);
        System.out.println("y="+y);
	}

}
