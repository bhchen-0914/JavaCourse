package com.tool.exception;

import java.util.Scanner;

/**
 * throw抛出异常
 * @author bhchen3
 *
 */

/*
 * throw抛出异常对象的处理方案
 * 1.通过try..catch包含throw语句----自己抛出，自己处理
 * 2.通过throws在方法声明处抛出异常类型----谁调用谁处理，也可以继续上抛
 * 	  此时可以抛出与throw对象相同的类型或者其父类
 * */
public class ThrowClass {

	/*
	 * throw用来抛出一个异常
	 * throw抛出的只能够是可抛出类Throwable或者其子类的实例对象
	 * throw可规避可能出现的风险，也可完成一些程序的逻辑
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowClass demo=new ThrowClass();
		//方案1测试
		demo.testAge();
		
		//方案2测试
		try {
			demo.testAge2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("出错了");
			e.printStackTrace();
		}

	}
	

	//描述酒店入住规则：限定年龄，18岁以下，80岁以上必须有亲友陪同
	//方案1
	public void testAge() {
		try {
			System.out.println("请输入年龄");
			Scanner scanner=new Scanner(System.in);
			int age=scanner.nextInt(); 
//			scanner.close(); 
			if(age<18 || age>80) {
				throw new Exception("18岁以下，80岁以上须有亲友陪同");
			}else {
				System.out.println("欢迎光临");
			}
		}catch (Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
		}
	}
	
	//方案2
	public void testAge2() throws Exception {
		System.out.println("请输入年龄");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		scanner.close(); 
		if(age<18 || age>80) {
			throw new Exception("18岁以下，80岁以上须有亲友陪同");
		}else {
			System.out.println("欢迎光临");
		}
	}

}
