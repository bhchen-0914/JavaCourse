package com.object.encapsulation;
/**
 * ���ڲ���Cat��װ
 * @author bhchen3
 *
 */
public class CatTest {

	public static void main(String[] args) {
		CatEncapsulation cat1=new CatEncapsulation();
		cat1.name="coffee";
		cat1.setAge(1);
//		System.out.println(cat1.age);�ᱨ��private���Բ��ܱ�ֱ�ӷ���
		System.out.println("cat1��ageΪ��"+cat1.getAge());
		cat1.setSex("m");
		System.out.println("cat1��sexΪ��"+cat1.getSex());
		cat1.setSex("M");
		System.out.println("cat1��sexΪ��"+cat1.getSex());
		
		System.out.println("=========================================");
		//���ô��εĹ��췽��
		CatEncapsulation cat2=new CatEncapsulation("����",-1,"FM");
		cat2.setAge(2);
		System.out.println("cat2��nameΪ��"+cat2.name);
		System.out.println("cat2��ageΪ��"+cat2.getAge());
		System.out.println("cat2��sexΪ��"+cat2.getSex());
	}

}
