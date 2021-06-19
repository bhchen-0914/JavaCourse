package com.study6_method;
/*
 * 可变参数列表
 * （类型... n）
 * 可变参数列表的方法重载问题
 * 文档注释
 * */

/**
 * 关于可变参数列表的方法调用问题
 * @author bhchen3
 * @version 1.0
 *
 */

public class Class6 {
	
	//定义一个 求参数累加和的方法
	public void sum(int... n) {
		System.out.println("可变参数列表的方法：");
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println("sum:"+sum);
	}
	
	//定义一个在可变参数列表中查找值的方法
	//参数中如果有2个或2个以上参数时，可变参数要放在最后
	public void findElement(int element,int... n) {
		boolean flag=false;
		for(int i:n) {
			if(i==element) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了");
		}else {
			System.out.println("没找到");
		}
	}
	
	public void sum(int a,int b) {
		System.out.println("不带可变参数列表的方法：");
		System.out.println("sum:"+(a+b));
	}

	public static void main(String[] args) {
		// 调用sum方法
		Class6 class6 =new Class6();
		class6.sum(1,2,3);
		class6.sum(3,4,5,6,7,8,9);
		
		class6.findElement(100, 1,101,1000,20);
		int intArray[] = {1,2,3,4,5};
		//可变参数列表也可以是同类型数组
		class6.findElement(3, intArray);
		
		//可变参数列表所在的方法是最后被访问的
		class6.sum(1,9);

	}

}
