package com.study2;
// �����Լ������


public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		//�������Լ�������ڲ�������ǰʱ���Ƚ��������Լ����㣬�ٽ��и�ֵ����
		int num2 = ++num1; // num1++ --> num2=num1
		System.out.println("num2:"+num2);
		
		//�������Լ�������ڲ���������ʱ���Ƚ��и�ֵ�����ٽ��������Լ�����
		num1=1;
		num2=num1++;  // num2=num1 --> num1++
		System.out.println("num2:"+num2);
		System.out.println("num1:"+num1);
		
		int x=4;
		int y=(x++)+5;
		System.out.println("y="+y+",x="+x); //y=x+5 -->x++
		x=4;
		y =++x+5;
		System.out.println("y="+y+",x="+x); //x== --> y=x+5
		
	}	

}
