package com.study2;

public class Class1 {
/*
 * ���ʽ����������Ͳ�������ɣ����磺sum = num1 + num2 
 * ��ֵ������� ����=���ʽ�� ������������
 * ������������������ݵļӼ��˳��Ȳ���
 * %�������� �� ++������1  --���Լ�1
 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ���Ѿ�����õı�����ֵ����һ������
		float f1=1.23f;
		double d1=f1;
		
		//���ϸ�ֵ�������
		int x=5;
		x +=5;
		System.out.println("x="+x);
		
		//�����Լ�
		int n=1;
		n++;
		System.out.println("n:"+n);
		n--;
		System.out.println("n:"+n);
		
		// + ��Ӧ��
		int num1=10,num2=5;
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		System.out.println(num1+num2); //�����������㣬15
		System.out.println(""+num1+num2); //�����ַ���ƴ�����㣬105
		
		//- ��Ӧ��
		result = num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		// *Ӧ��
		result = num1*num2;
		System.out.println(num1+"x"+num2+"="+result);
		
		// /Ӧ��
		result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		//���ӷ�ĸ��������ʱ�����Ϊ������Ľ��
		System.out.println("12/5="+12/5);
		//Ҫʹ�������Ϊ�����ͣ���Ҫʹ���ӷ�ĸ����һ��Ϊ������
		System.out.println("12/5="+12.0/5);
		System.out.println("12/5="+12/5.0);
		
		//������,�����ӷ�ĸ֮һʱ������ʱ�����Ҳ�Ǹ�����
		System.out.println("12%5="+12.0%5);
		System.out.println("12.5%5="+12.5%5);
		System.out.println("12%5.5="+12.5%5.5);
	}

}
