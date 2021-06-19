package com.object.singleton;
/**
 * 
 * @author bhchen3
 *����ģʽ:����ʵ�����󴴽�ʱ����ֱ�ӳ�ʼ����ֱ����һ�ε���get����ʱ������ɳ�ʼ������
 *ʱ�任�ռ�
 */
public class SingletonTwo {
	//1.����˽�й��췽��
	private SingletonTwo() {
		
	}
	//2.���������͵�˽�о�̬ʵ��
	private static SingletonTwo instance=null;
	
	//3.�������еľ�̬�����ṩʵ������
	public static SingletonTwo getInstance() {
		if(instance==null) {
			instance=new SingletonTwo();
		}
		return instance;
	}
}
