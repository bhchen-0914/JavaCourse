package com.object.interfaceStudy;

//java�нӿ�Ҳ���Լ̳У��ҿ��Լ̳ж���ӿ�
public interface Ison extends Ifather, Ifather2 {

	//����������Ĭ�Ϸ�������Ȼ��Ҫ��д
	@Override
	default void connect() {
		System.out.println("Ison�ӿ��е�connect����");
	}

}
