package com.tool.string;

/**
 * 
 * @author bhchen3
 *String不可变性
 */
public class StringClass5 {

	/*
	 * String对象一旦被创建，则不能修改，是不可变的
	 * 所谓的修改其实是创建了新的对象，所指向的内存空间不变
	 * */
	public static void main(String[] args) {
		String str1="JAVA";
		str1="hello,"+str1;
		//str1不再指向"JAVA"所在的常量池中的值，而是指向了"hello，JAVA"
		System.out.println("str1:"+str1);
		
		System.out.println("=================");
		
		String s1="JAVA";
		String s2="hello,"+s1;
		//s1和s2分别指向常量池中2个值
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		System.out.println("=================");
		
		String s3=new String("hello,java");
		System.out.println("子串："+s3.substring(0, 5));
		//先在堆中生成s3对象，栈中的s3指向该对象，调用substring方法后
		//得到的“hello”也是存放在堆中，然后输出
		//在整个方法的调用过程中，s3的指向一直没有改变过		
		System.out.println("s3:"+s3);
		
		
	}

}
