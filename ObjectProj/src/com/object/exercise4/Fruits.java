package com.object.exercise4;

public class Fruits {
	// ˽�����ԣ�ˮ������״��shape���ͿڸУ�taste��
	private String shape;
	private String taste;

	public Fruits() {

	}

	// ���ι��캯��������Ϊshape��taste��
	public Fruits(String shape, String taste) {
		this.setShape(shape);
		this.setTaste(taste);
	}


	//ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getShape() {
		return this.shape;
	}
		
	public void setShape(String shape) {
		this.shape=shape;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public void setTaste(String taste) {
		this.taste=taste;
	}
	// �����޲��޷���ֵ�÷���eat����������Ϊ��ˮ���ɹ�����ʳ�ã���
	public void eat() {
		System.out.println("ˮ���ɹ�����ʳ��");
	}

	// ��дequals�������Ƚ����������Ƿ���ȣ��Ƚ�shape��taste��
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		Fruits temp=(Fruits) obj;//��objǿתΪFruits��
		if (this.getShape().equals(temp.getShape())&&this.getTaste().equals(temp.getTaste())) {
			return true;
		}else {
			return false;
		}
	}
			
}
