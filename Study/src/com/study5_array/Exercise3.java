package com.study5_array;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		//����һ���������е����Ͷ�ά����intArray
        int intArray[][] = new int[3][2];

       //�Ӽ�������ѧ���ɼ���Ҫ������˳����Ч��ͼһ��
        Scanner sc = new Scanner(System.in);
        System.out.println("�������1��ѧ�������ĳɼ���");
        int student1_chinese = sc.nextInt();
        intArray[0][0] = student1_chinese;
        
        System.out.println("�������1��ѧ������ѧ�ɼ���");
        int student1_math = sc.nextInt();
        intArray[0][1] = student1_math;
        
        System.out.println("�������2��ѧ�������ĳɼ���");
        int student2_chinese = sc.nextInt();
        intArray[1][0] = student2_chinese;
        
        System.out.println("�������2��ѧ������ѧ�ɼ���");
        int student2_math = sc.nextInt();
        intArray[1][1] = student2_math;
        
        System.out.println("�������3��ѧ�������ĳɼ���");
        int student3_chinese = sc.nextInt();
        intArray[2][0] = student3_chinese;
        
        System.out.println("�������3��ѧ������ѧ�ɼ���");
        int student3_math = sc.nextInt();
        intArray[2][1] = student3_math;

       //�����ĵ��ܳɼ���ƽ����
         int sum_chinese = intArray[0][0]+intArray[1][0]+intArray[2][0];
         System.out.println("�����ܳɼ�Ϊ��"+sum_chinese);
         
         System.out.println("����ƽ����Ϊ��"+(sum_chinese/3));
       //����ѧ���ܳɼ���ƽ����
         int sum_math = intArray[0][1]+intArray[1][1]+intArray[2][1];
         System.out.println("��ѧ�ܳɼ�Ϊ��"+sum_math);
         System.out.println("��ѧƽ����Ϊ��"+(sum_math/3));

	}

}
