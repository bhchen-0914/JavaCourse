package com.object.anonymous;
/**
 * 
 * @author bhchen3
 *�����ڲ������ó�����
 *1.ֻ�õ����1��ʵ��
 *2.���ڶ�������ϻ��õ�
 *3.�������������ᵼ�´�������ױ����
 */
public class PersonTest {

	//����1�����ݴ��벻ͬ���˵����ͣ����ö�Ӧ��read����
	public void getRead(Man man) {
		man.read();
	}
	
	public void getRead(Womam woman) {
		woman.read();
	}
	
	//��������ʹ�ö�̬
	public void newRead(Person obj) {
		obj.read();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest test=new PersonTest();
		Man one=new Man();
		Womam womam=new Womam();
		test.getRead(one);
		test.getRead(womam);
	
		System.out.println("======================");
		
		test.newRead(womam);
		test.newRead(one);
		
		System.out.println("======================");
		//����3 �������ڲ���
		/*
		 * 1.�����ڲ���û���������ơ�ʵ����������
		 * 2.�������ļ��������ⲿ�ࣺ����.class
		 * 3.�޷�ʹ��private��public��protected��abstract��static����
		 * 4.�޷���д���췽������ͨ�����������ʼ������
		 * 5.���ܳ��־�̬��Ա
		 * 6.�����ڲ������ʵ�ֽӿڣ�Ҳ���Լ̳и��࣬�����ɼ��
		 * */
		test.newRead(new Person() {
			
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("ѧ��ѧϰ�α�");
			}
		});
		
		
	}

}
