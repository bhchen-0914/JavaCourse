package com.study;
/*
 ��������ֵ���������
 java����3�ֱ�ʾ���͵ķ�����ʮ���ơ��˽��ơ�ʮ������
 ʮ���ƣ�123�� 12
 �˽��ƣ���0��ͷ������0~7�����֣��� 036�� 067
 ʮ�����ƣ���0x��0X��ͷ������0~9���ֺ���ĸa~f��A~F����0x12��0XABCF
 
 */


/*
 ����������ֵĬ������±�ʾdouble�ͣ�Ҳ������ֵ���D��d���磺12.32D�� 12.43d
 ��Ҫ��ʾfloat���ͣ�������Ҫ�ں����F��f
  */
public class Class3 {
	public static void main(String[] args) {
		int n; //�������α���n
		n = 1;
		System.out.println("n:"+n);
		long counnt; //���������ͱ���count
		counnt = 133455L;
		System.out.println("count:"+counnt);
		int a = 2; //���������ͬʱ��������ֵ���������ĳ�ʼ��
		System.out.println("a:"+a);
		int octl = 037; // ����int���ͱ�����Ű˽������� 
		System.out.println("octl:"+octl);
		long longNumber = 0xa2cdf3ffL; // ���峤���ͱ������ʮ�����Ƴ���������
		System.out.println("longNumber:"+longNumber);
		short shortNummber = 123; // ���������Ŷ���������
		System.out.println("shortNummber:"+shortNummber);
		byte b = 10;  // ������byte��������
		System.out.println("b:"+b);
		
		double d1 = 12.21; //����һ��˫���ȸ����ͱ��������d1��ֵ
		double d2;
		d2 = 12.22D;
		float f1;
		f1 = 12.22F;
		float f2 = 0.001f;
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		double d3 = 123;  //����һ����������ֵ���������͵ı���ʱ���ᱣ��һλС����,��ɸ�����
		System.out.println("d3:"+d3);  //����һ������
		double d4 = d2; 
		System.out.println("d4:"+d4); // ��һ��������ֵ��ֵ����һ������
		
		
		//���ɣ��������ݷ�Χ�ϴ�ı�����ֵ�����ݷ�ΧС�ı���ʱ���ǲ�����ġ�double�����ݷ�Χ������
		
	}
	
} 
