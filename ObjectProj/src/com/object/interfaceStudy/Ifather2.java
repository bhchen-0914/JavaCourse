package com.object.interfaceStudy;

public interface Ifather2 {
	public void fly();
	
	public default void connect() {
		System.out.println("Ifather2�ӿ��е�connect����");
	}
}
