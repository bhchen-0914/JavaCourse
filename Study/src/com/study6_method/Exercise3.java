package com.study6_method;
/*
 * �����������صķ������ֱ���Բ�ͳ����ε������
 
1��������������������ط�����Բ���ʿ�����Math.PI��ʾ
2�����������е��÷���������������
ע�⣺��Բ�İ뾶Ϊ4.5�������γ��Ϳ�ֱ�Ϊ8��5ʱ���ɵõ���Ч��ͼ��ʾ�Ľ��
 * */
public class Exercise3 {
	//��Բ�����
		public double findArea(double r){
		     return Math.PI*r*r;
		}
	    
		//�󳤷������
		public double findArea(double a,double b){
		    return a*b;
		}

	public static void main(String[] args) {
		Exercise3 areademo = new Exercise3();
		//����һ��double���͵ı�����Ű뾶������ʼ��
		double r=4.5;
		
		//��������������ų��Ϳ�����ʼ��
		double a=8,b=5;
		
		//���÷�������Բ���������ӡ���
		double s1 = areademo.findArea(r);
		System.out.println("Բ�����Ϊ��"+s1);
		//���÷������󳤷����������ӡ���
		double s2 = areademo.findArea(a,b);
		System.out.println("���������Ϊ��"+s2);

	}

}
