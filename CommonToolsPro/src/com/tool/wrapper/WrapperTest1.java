package com.tool.wrapper;
/**
 * 
 * @author bhchen3
 *基本数据类型和包装类之间的转换
 */
public class WrapperTest1 {

	public static void main(String[] args) {
		/*
		 * 装箱：把基本数据类型转换成包装类
		 * 自动装箱
		 * 手动装箱
		 * */ 

		//自动装箱
		int t1=2;
		Integer t2=t1;
		System.out.println("int类型t1的值:"+t1);
		System.out.println("Integer类型对象t2的值:"+t2);
		
		//手动装箱
		Integer t3=new Integer(t1);
		System.out.println("Integer类型对象t3的值:"+t3);
		
		//自动拆箱
		int t4=t2;
		System.out.println("自动拆箱后，int类型t4的值:"+t4);
		
		//手动拆箱
		int t5;
		t5=t2.intValue();
		System.out.println("手动拆箱后，int类型t5的值:"+t5);
		
		//手动拆箱为double类型
		double d1=t2.doubleValue();
		System.out.println("手动拆箱后，double类型d1的值:"+d1);
	}

}
