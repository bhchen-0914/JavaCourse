package com.study;

public class VarDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=1;y=2; //ע��x��y֮��Ҫ�÷ֺ�
		//printΪ�����д�ӡ
		System.out.print("x="+x);
		System.out.print("y="+y);
		System.out.println(); //����
		System.out.print("~~~~~~~~~~~~~~");
		System.out.println();
		int x1=3,y1=4;
		System.out.print("x1="+x1);
		System.out.println();  
		System.out.print("y1="+y1);
		System.out.println(); //����
		System.out.print("~~~~~~~~~~~~~~");
		System.out.println();
		System.out.print(x1 + "," + y1 + "\n"+"1"); // \n��ת���ַ�����ʾ����
		System.out.print(x1 + ',' + y1 + '\n'+'1'); // ��������������Ϊ���Ρ������͡�char����ʱ�����Զ����ӷ�����
		System.out.print("\n\'"+ "hello"+"\'\n"); //ת���ַ���ʾ
		
		//�ÿ�ѧ��������ʾ����������
		double d1 = 1.23E5; //�ȼ���x10^5
		float f1 = 1.23e5f;
		double d2 = .2;
		float f2 = .2f;
		System.out.println("d1="+d1);
		System.out.println("f1="+f1);
		System.out.println("d2="+d2);
		System.out.println("f2="+f2);
	}

}
