package com.tool.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDictionaryDemo {

	public static void main(String[] args) {
		/*
		 * 完成一个类似字典的功能
		 * -将单词以及单词注释存储到HashMap中
		 * -显示HashMap中的内容
		 * -查找某个单词的注释并显示
		 * */
		
		Map<String, String> animal = new HashMap<String, String>();
		System.out.println("请输入三组单词并注释，存放到HashMap中");
		Scanner sc = new Scanner(System.in);
		//添加数据
		for (int i=0;i<3;i++) {
			System.out.println("请输入key值：");
			String key = sc.next();
			System.out.println("请输入value值：");
			String value = sc.next();
			animal.put(key, value); //使用put方法添加元素
		}	
		
		//打印输出value值
		System.out.println("***********************");
		System.out.println("使用迭代器输出所有value");
		Iterator<String> iterator = animal.values().iterator(); //迭代value值
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		
		//打印输出key，value值
		//通过entrSet方法
		System.out.println();
		System.out.println("***********************");
		System.out.println("通过entrySet方法得到key-value值");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry:entrySet) {
			System.out.print(entry.getKey()+"-");
			System.out.print(entry.getValue());
			System.out.println();
		}
		
		
		System.out.println("***********************");
		System.out.println("请输入要索引的");
		//通过单词找到注释并输出
		//使用keySet方法
		String keyIn = sc.next();
		//1 取得keySet
		Set<String> keySet = animal.keySet();
		//2遍历keySet
		for (String key:keySet) {
			if (keyIn.equals(key)) {
				System.out.println("找到了："+key+"-"+animal.get(key));
				break;
			}
		}
		sc.close();
	}

}
