package com.tool.string;
/**
 * 
 * @author bhchen3
 *字符串和byte数组间的相互转换
 */
public class StringClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("JAVA 编程 基础");
		//将字符串转换为byte数组，并打印输出
		byte[] arrs = str.getBytes();
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
		System.out.println();
		
		//将byte数组转换为字符串
		String str1=new String(arrs); //调用参数为byte数组的构造方法，直接实现
		
		//当编码格式不一致时，可以在构造方法的参数里添加编码格式，但是需要抛出异常
		//比如：String str1=new String(arrs,"UTF-8")
		//或者在getBytes()方法中添加编码格式：byte[] arrs = str.getBytes("UTF-8");
		System.out.println(str1);

	}

}
