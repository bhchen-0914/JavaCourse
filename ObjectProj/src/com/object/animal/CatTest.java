package com.object.animal;
/**
 * ʵ��������
 * new �ؼ���
 * @author bhchen3
 *
 */
public class CatTest {

	public static void main(String[] args) {
		/*
		 * Cat cat1 �ĺ�����������������ջ�￪����һ����Ϊcat1���ڴ�ռ䣬����ʱ������ʹ����,��Ϊ�ռ���Ϊ��
		 * new Cat() �ĺ�����ʵ�����������ڶ��ڴ��￪����һ��ռ䣬����˶���ĳ�ʼ������
		 * ջ�ڴ�����ڴ�֮����=�����������е��ڴ��ַ�����ջ��
		 * */
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		//���ö���ķ���
		cat1.run();
		cat1.speek();
		cat1.eat();
		//��Ա����û�г�ʼ��Ҳ���Դ�ӡ�����String����Ĭ��ֵΪnull
		System.out.println(cat1.name);
		System.out.println(cat1.age);//int����Ĭ��Ϊ0
		System.out.println(cat1.weigth);//double����Ĭ��Ϊ0.0
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		//����Ա���Ը�ֵ
		cat1.name="coffee";
		cat1.age=2;
		cat1.weigth=6.5;
		cat1.type="xianluo";
		System.out.println("name:"+cat1.name);
		System.out.println("age:"+cat1.age);
		System.out.println("weigth:"+cat1.weigth);
		System.out.println("type:"+cat1.type);
		
		//��ֵ����÷���
		cat1.run(cat1.name);
		cat1.eat(cat1.name, "big fish");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		
		//��cat2����ͬ���ĳ�Ա����
		cat2.name="coffee";
		cat2.age=2;
		cat2.weigth=6.5;
		cat2.type="xianluo";
		
		System.out.println("cat2:"+"name:"+cat2.name);
		System.out.println("cat2:"+"age:"+cat2.age);
		System.out.println("cat2:"+"weigth:"+cat2.weigth);
		System.out.println("cat2:"+"type:"+cat2.type);
		
		cat2.age=3;  //�޸�cat2�����ԣ�����Ӱ��cat1�����ԣ�˵��ͨ��new�ؼ���ʵ������
					//����֮�����໥������
		System.out.println("cat1:"+"age:"+cat1.age);
		System.out.println("cat2:"+"age:"+cat2.age);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		//��һ��ʵ�����ķ�ʽ��������cat1��ջ�д�ŵ��ڴ��ַ��ֱ�Ӹ�ֵ��cat3������������
		//֮�����������
		Cat cat3 = cat1;
		System.out.println("cat3:"+"name:"+cat3.name);
		cat3.weigth=7;
		System.out.println("cat1:"+"weigth:"+cat1.weigth);
	}

}
