package com.object.interfaceStudy;
/**
 * 具有照相能力的接口
 * @author bhchen3
 *
 */
public interface Iphoto {
	//接口中抽象方法可以不写abstract关键字
	public abstract void photo();
	
	public default void connect() {
		System.out.println("这里是Iphoto接口中的connect方法");
	}
}

