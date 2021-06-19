package com.object.encapsulation;
/**
 * 用于测试Cat封装
 * @author bhchen3
 *
 */
public class CatTest {

	public static void main(String[] args) {
		CatEncapsulation cat1=new CatEncapsulation();
		cat1.name="coffee";
		cat1.setAge(1);
//		System.out.println(cat1.age);会报错，private属性不能被直接访问
		System.out.println("cat1的age为："+cat1.getAge());
		cat1.setSex("m");
		System.out.println("cat1的sex为："+cat1.getSex());
		cat1.setSex("M");
		System.out.println("cat1的sex为："+cat1.getSex());
		
		System.out.println("=========================================");
		//调用带参的构造方法
		CatEncapsulation cat2=new CatEncapsulation("花花",-1,"FM");
		cat2.setAge(2);
		System.out.println("cat2的name为："+cat2.name);
		System.out.println("cat2的age为："+cat2.getAge());
		System.out.println("cat2的sex为："+cat2.getSex());
	}

}
