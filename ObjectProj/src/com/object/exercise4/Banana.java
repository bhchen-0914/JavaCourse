package com.object.exercise4;


public class Banana extends Fruits{
	// ˽�����ԣ�Ʒ�֣�variety��
    private String variety;

    //�������ι��췽��Ϊ�������Ը�ֵ
    public Banana(String shape, String taste,String variety) {
		super(shape,taste);
		this.setVariety(variety);
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
    
    
    //�����޲��޷���ֵ��advantage����������Ϊ��**����**,�������𣬿ɹ���ʳ��
    public void advantage() {
		System.out.println(this.getVariety()+"����"+this.getShape()+","+this.getTaste()+"�ɹ���ʳ��");
	}
    
    //��������advantage������������color��������Ϊ��**��ɫΪ**
    public void advantage(String color) {
		System.out.println(this.getVariety()+"��ɫΪ"+color);
	}
}