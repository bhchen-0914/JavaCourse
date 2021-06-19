package com.study;
/* 
 字符型字面值
 字符型字面值用单引号内的单个字符表示，如'a', '$'等
 定义字符型变量：char a = 'a'; 
 
 Unicode编码
  */

public class Class4 {
	public static void main(String[]args) {
		char a='a';  //定义一个变量a存放字符‘a’
		System.out.println("a="+a);
		char ch=65535; //  会将65转化为ASCII码，说明整形和字符数据是可以相互转换的
		int i = 'A';
		System.out.println("i="+i);
		System.out.println("ch="+ch);
		//如果字面值超出char类型所表示的数据范围，需要进行强制转换
		char ch2=(char)65536;
		System.out.println("ch2="+ch2);
		//ASCII码使用7位或8位二进制数组合来表示128或256种可能的字符
		//7位二进制组合------标准ASCII码
		//8位二进制组合（后128位） -----扩展ASCII码
		
		
		char u='\u005d';
		/*unicode表示法：在值的前面加上前缀'，后面跟上4位的16进制数*/
		System.out.println("u="+u);
		
	}
}