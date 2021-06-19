package com.tool.wrapper;
/**
 * 
 * @author bhchen3
 *基本数据类型和字符串之间的转换
 */
public class WrapperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本数据类型转换为字符串
		int t1=2;
		String t2=Integer.toString(t1);	
		System.out.println("int类型转化为String类型对象t2："+t2);
		
		System.out.println("*******************");
		
		//字符串转化为基本数据类型
		//方式1：包装类的parse方法
		int t3=Integer.parseInt(t2);
		System.out.println("转换为int类型的t3："+t3);
		
		//方式2：包装类的valueOf方法，先将字符串转换为包装类，再通过自动拆箱完成基本类型的转换
		String s="66";
		int t4=Integer.valueOf(s);
		System.out.println("转换为int类型的t4："+t4);

	}
	
}
