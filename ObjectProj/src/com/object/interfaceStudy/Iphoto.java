package com.object.interfaceStudy;
/**
 * �������������Ľӿ�
 * @author bhchen3
 *
 */
public interface Iphoto {
	//�ӿ��г��󷽷����Բ�дabstract�ؼ���
	public abstract void photo();
	
	public default void connect() {
		System.out.println("������Iphoto�ӿ��е�connect����");
	}
}

