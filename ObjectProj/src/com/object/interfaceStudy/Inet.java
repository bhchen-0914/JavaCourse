package com.object.interfaceStudy;

//�ӿڷ������η���ʹ��public ����Ĭ�����η�
public interface Inet {
	//�ӿڳ��󷽷���ʹ�÷������η�Ҳ��Ĭ��ʹ��publicȥʵ��
	//�ӿ��г��󷽷����Բ�дabstract�ؼ���
	//����ʵ�ֽӿ�ʱ����Ҫʵ�ֽӿ������г����෽����������Ҫ���������Ϊ������
	abstract void network();
	
	//�ӿ��п������ó�����Ĭ��public static final
	int temp=20;
	
	//default:Ĭ�Ϸ��������Դ�������  jdk1.8������
	//������ʵ��������д������ͨ���ӿڵ����õ���
	public default void connect() {
		System.out.println("������Inet�ӿ��е�Ĭ��connect����");
	}
	
	//��̬�������Դ�������   jdk1.8������
	//��������ʵ��������д������ͨ���ӿ�������
	static void disconnect() {
		System.out.println("�����ǽӿ��еľ�̬�Ͽ����ӷ���");
	}
}
	