package com.study6_method;


/*
 * �޲δ�����ֵ����
 * �����޷���ֵ����
 * �����з���ֵ�ķ���
 * */
public class Class2 {
	//�޲δ�����ֵ����������һ���󳤷�������ķ���
	public int getArea() {
		int length=10;
		int width=8;
		int area=length*width;
		return area;
	}
	
	//�����޷���ֵ����������һ����2��float�����������ֵ�ķ�������ӡ�����ֵ
	public void maxFloat(float a,float b) {
		float max;
		if(a>b) {
			max=a;
		 }else {
			 max=b;
		 }System.out.println("���ֵ�ǣ�"+max);
	}
	
	//�����з���ֵ�ķ���������һ��ֵ�Ľ׳��ۼӺ�
	public int fac(int num) {
		int sum=0,temp=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				temp=temp*j;
			}
			sum+=temp;
			temp=1;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		int area = class2.getArea();
		System.out.println("���������Ϊ��"+area);
		
		class2.maxFloat(1.34f, 1.35f);
		int a=5,b=10;
		class2.maxFloat(a, b);
		
		int num = 5;
		int sum = class2.fac(num);
		System.out.println(num+"�Ľ׳��ۼӺ�Ϊ��"+sum);
	}
	

}
