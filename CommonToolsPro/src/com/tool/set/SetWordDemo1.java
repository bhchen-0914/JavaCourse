package com.tool.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWordDemo1 {

	public static void main(String[] args) {
		// 将颜色添加到HashSet中
		Set<String> colorSet = new HashSet<String>();
		
		//向集合中添加元素
		colorSet.add("blue");
		colorSet.add("red");
		colorSet.add("black");
		colorSet.add("yellow");
		colorSet.add("white");

		/*显示集合内容
		 * 显示set集合需要使用迭代器接口
		 *Iterator接口可以以统一的方式对各种集合元素进行遍历
		 *hasNext()方法检测集合中是否有下一个元素
		 *next方法返回集合中的下一个元素
		 * */
		Iterator<String> iterator = colorSet.iterator(); //调用迭代器
		System.out.println("集合中的元素为：");
		//遍历迭代器并输出元素
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		
		System.out.println("***********************");
		//在集合中插入重复元素
		//重复的元素插入失败，从而避免了数据的重复(不会报错)
		colorSet.add("black");
		iterator = colorSet.iterator();
		System.out.println("集合中插入重复元素后的元素遍历为：");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}

