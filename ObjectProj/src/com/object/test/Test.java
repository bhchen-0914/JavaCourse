package com.object.test; //�����
/**
 * ����ְ��һԭ�򣬲����ฺ�����
 * �������ϰ
 * @author bhchen3
 *
 */
import com.object.animal.*; //����com.object.animal���µ�������
import com.object.encapsulation.CatEncapsulation; //����com.object.encapsulation����ָ������

public class Test {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.eat();
		cat.run("coffee");
		DogDeemo dog=new DogDeemo("wow",1,5.02);
		dog.eat();
//		com.object.encapsulation.CatTest catTest=new com.object.encapsulation.CatTest(); 
//		Ҳ�������ڲ�ֱ�Ӽ���ָ����
		CatEncapsulation cat2=new CatEncapsulation("coffee2", 2, "M");
		System.out.println("cat2��sexΪ��"+cat2.getSex());
	}

}
