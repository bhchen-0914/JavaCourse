package com.study;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��һ����������ֵ67832��ֵ��char���ͱ���c
				char c = (char)67832;
				//����c��ֵ���
				System.out.println("c="+c);
				//����һ�����ͱ���n��ֵΪ65
				int n = 65;
				//����һ���ַ��ͱ���c1����ֵΪn�������c1��ֵ
				char c1 = (char)n;
				System.out.println("c1="+c1);
				//����һ�������ͱ���l��ֵΪ987654321
				long l;
				l = 987654321L;
				//����һ�����ͱ���i����ֵΪl�������i��ֵ
			    int i = (int)l;
			    System.out.println("i="+i);
			    //����һ��float���ͱ���f��������l��ֵ��ֵ��f�������f��ֵ
			    float f = l;
			    System.out.println("f="+f);
			    //��float��ֵf�����¸�ֵ������l�������l��ֵ
			    l =(long) f;
			    System.out.println("l="+l);
	}

}
