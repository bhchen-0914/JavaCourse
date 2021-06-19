package com.tool.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MapGoodsTest {

	/*
	 * 完成对商品进行增删改查的操作
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//定义HashMap对象
		Map<String, MapGoodsDemo> goodsMap = new HashMap<String, MapGoodsDemo>();
		System.out.println("请输入3条商品信息");
		
		//添加商品信息
		System.out.println("***********************");
		for(int i=0;i<3;i++) {
			System.out.println("请输入第"+(i+1)+"条商品信息：");
			System.out.println("请输入商品编号:");
			String goodsId = sc.next();
			//判断编号是否重复
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("商品编号重复，请重新输入");
				i--;
				continue;
			}
			System.out.println("请输入商品名称:");
			String goodsName = sc.next();
			System.out.println("请输入商品价格:");
			//抛double输入异常
			try {
				double goodsPrice = sc.nextDouble(); 
				MapGoodsDemo goods = new MapGoodsDemo(goodsId, goodsName, goodsPrice);
				goodsMap.put(goods.getId(), goods);	
			} catch (java.util.InputMismatchException e) {
				System.out.println("请输入有效数据");
				sc.next();//用于接收错误的数据
				i--;
				continue;
			} 
		}
		
		//遍历Map，输出商品信息
		System.out.println("全部商品信息为：");
		Iterator<MapGoodsDemo> iterator = goodsMap.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
