package com.object.interfaceStudy;

//java中接口也可以继承，且可以继承多个接口
public interface Ison extends Ifather, Ifather2 {

	//父类重名的默认方法，仍然需要重写
	@Override
	default void connect() {
		System.out.println("Ison接口中的connect方法");
	}

}
