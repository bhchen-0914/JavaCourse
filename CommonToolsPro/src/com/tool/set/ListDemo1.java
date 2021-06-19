package com.tool.set;

import java.util.ArrayList;
import java.util.List;
/*
 * list是有序且允许重复的集合
 * */
public class ListDemo1 {

	/*
	 * 用ArrayList储存编程语言的名称，并输出
	 * 包括："java","C","C++","Go","python"
	 * */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); //多态
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("python");
		
		//输出列表中元素的个数
		System.out.println("列表中的元素个数为："+list.size());
		
		//遍历输出所有语言
		System.out.println("******************");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		//移除列表中的C++
		System.out.println();
		list.remove(2); //通过移除索引值的方法
		System.out.println("******************");
		System.out.println("移除C++后的列表元素：");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.remove("Go"); //通过移除"Go"字符串对象的方法
		System.out.println("移除Go后的列表元素：");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
