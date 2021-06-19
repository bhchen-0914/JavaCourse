package com.tool.wrapper;
/*
 * 包装类的默认值都是null
 * 对象常量池的概念
 * 除了float和double，其他基本数据类型均可应用对象常量池的概念
 * */
public class WrapperTest3 {

	public static void main(String[] args) {
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		//one和two分别指向的是内存种2个不同的地址，因此one不等于two
		System.out.println("one==two的结果："+(one==two));
		System.out.println("one==two的结果："+(one==two));
		
		Integer three = 100; //自动装箱
		System.out.println("three==100的结果："+(three==100)); //会自动拆箱

		Integer four = 100;
		//自动装箱，相当于隐式调用Integer.valueOf()方法
		//当对象池种存在-128<参数<127的参数时。会直接引用对象，若没有，才会new一个新的对象
		//因此，three和four指向同一个对象
		System.out.println("four==three的结果："+(three==four)); 
		
		Integer five = 200;
		System.out.println("five==200的结果："+(five==200)); //同上，比较的是自动拆箱后，2个int类型的值
		
		Integer six = 200;
		//因为200不在-128-127范围内，因此会重新new一个Integer对象，所以比较结果为false
		System.out.println("five==six的结果："+(five==six));
 	}

}
