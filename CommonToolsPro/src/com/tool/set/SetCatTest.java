package com.tool.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCatTest {

	public static void main(String[] args) {
		// 定义cat对象
		SetCatDemo cat1=new SetCatDemo("花花", 1, "英国短毛猫");
		SetCatDemo cat2=new SetCatDemo("凡凡", 2, "暹罗猫");
		
		Set<SetCatDemo> catSet=new HashSet<SetCatDemo>();
		//存放对象
		catSet.add(cat1);
		catSet.add(cat2);
		
		//显示猫类信息
		Iterator<SetCatDemo> iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//添加一个属性一样的对象
		//若不重写hashCode()和equals()，此对象还是会添加，因为这是2个不同的对象，引用的内存地址不同
		SetCatDemo cat3 = new SetCatDemo("凡凡", 2, "暹罗猫");
		catSet.add(cat3);
		System.out.println("***********************");
		System.out.println("添加重复信息后的宠物猫信息");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//插入一个新的信息
		SetCatDemo cat4 = new SetCatDemo("咖啡", 2, "暹罗猫");
		catSet.add(cat4);
		System.out.println("***********************");
		System.out.println("新的信息后的宠物猫信息");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//在集合中查找咖啡的信息并输出
		if(catSet.contains(cat4)) {
			System.out.println("找到了"+cat4.getName());
		}else {
			System.out.println("没找到");
		}
		
		//通过遍历集合，输出暹罗猫的信息
		System.out.println("***********************");
		System.out.println("遍历集合查找暹罗猫");
		iterator = catSet.iterator();
		SetCatDemo cat=null; //空的cat类，避免循环内部过多使用next()方法造成迭代器越界异常
		while(iterator.hasNext()) {
			cat = iterator.next();
			if (cat.getSpecies().equals("暹罗猫")) {
				System.out.println(cat);
			}
		}

		System.out.println("***********************");
		//删除凡凡的信息,增强型for循环
		for(SetCatDemo catDeemo:catSet) {
			if(catDeemo.getName().equals("凡凡")) {
				catSet.remove(catDeemo);
				break;  //不加break会抛出一个ConcurrentModificationException异常，因为java的限制，集合在读取数据时不允许操作数据
			    }
			}
		System.out.println("删除凡凡后的信息");
		for(SetCatDemo catDeemo2:catSet) {
			System.out.println(catDeemo2);
		 	}
		
		SetCatDemo cat5 = new SetCatDemo("咪咪", 5, "美短");
		SetCatDemo cat6 = new SetCatDemo("糊糊", 6, "田园猫");
		catSet.add(cat2);
		catSet.add(cat5);
		catSet.add(cat6);
		System.out.println("***********************");
		System.out.println("现在的猫咪信息");
		iterator = catSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		//删除大于4岁的猫咪信息
		//需要将待删除的猫咪信息存放在一个子集，否则会抛ConcurrentModificationException异常，因为存在多个对象
		Set<SetCatDemo> catSet2 = new HashSet<SetCatDemo>();
		for (SetCatDemo cats:catSet) {
			if (cats.getAge()>4) {
				catSet2.add(cats);
			}
		}
		catSet.removeAll(catSet2); //当参数为本身时，代表清空此集合
		System.out.println("***********************");
		System.out.println("移除大于4岁猫咪信息后");
		for (SetCatDemo cats:catSet) {
			System.out.println(cats);
		}
	}
}

