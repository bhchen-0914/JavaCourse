package com.object.test; //定义包
/**
 * 根据职责单一原则，测试类负责测试
 * 导入包练习
 * @author bhchen3
 *
 */
import com.object.animal.*; //加载com.object.animal包下的所有类
import com.object.encapsulation.CatEncapsulation; //加载com.object.encapsulation包下指定的类

public class Test {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.eat();
		cat.run("coffee");
		DogDeemo dog=new DogDeemo("wow",1,5.02);
		dog.eat();
//		com.object.encapsulation.CatTest catTest=new com.object.encapsulation.CatTest(); 
//		也可以在内部直接加载指定类
		CatEncapsulation cat2=new CatEncapsulation("coffee2", 2, "M");
		System.out.println("cat2的sex为："+cat2.getSex());
	}

}
