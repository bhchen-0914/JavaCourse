package com.object.interfaceStudy;

public interface Ifather {
	public void say();
	
	public default void connect() {
		System.out.println("Ifather�ӿ��е�connect����");
	}
}
