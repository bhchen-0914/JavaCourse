package com.study3_choose;

import java.util.Scanner;

/*
 * Ƕ��if����ʹ��
 * */

public class Class2 {
	public static void main(String[] args) {
		// �ж�һ�������������������������0
		System.out.println("����һ������");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if(number!=0) {
			if(number>0) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		}else {
			System.out.println("����0");
		}
	}

}
