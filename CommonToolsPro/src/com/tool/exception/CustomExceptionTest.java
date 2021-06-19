package com.tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionTest {

	public static void testAge() throws CustomException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������䣺");
		int age=scanner.nextInt();
		scanner.close();
		if (age<18||age>80) {
			throw new CustomException();
		}else {
			System.out.println("��ӭ����");
		}
	}	
	
	public static void main(String[] args) {
		try {
			testAge();
		} catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("������");
			e.printStackTrace();
		}

	}

}
