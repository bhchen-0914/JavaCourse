package com.object.exercise4;

public class Waxberry extends Fruits{
	// ˽�����ԣ���ɫ��color��
    private String color;

	//�������췽������ɵ��ø���Ĺ��췽����������Ը�ֵ
    public Waxberry(String shape, String taste,String color) {
		super(shape, taste);
		this.setColor(color);
	}
    
    public String getColor() {
		return this.color;
	}
    
    public void setColor(String color) {
		this.color=color;
	}

	//������������д��face����������Ϊ����÷��**��**����ζ��������
	public final void face() {
		System.out.println("��÷��"+this.getColor()+"��"+this.getShape()+",��ζ"+this.getTaste());
	}
	    
	//��д����eat����������Ϊ����÷�������У��ǳ��óԣ�
	@Override
	public void eat() {
		System.out.println("��÷�������У��ǳ��ó�");
	}
	    
	//��дtoString����������ı�����ʽ��ͬ�����shape,color,taste��
	@Override
	public String toString() {
		String str="��÷����Ϣ����ʵΪ"+this.getShape()+"��"+this.getColor()+","+this.getTaste()+",�ǳ��óԣ�";
		return str;
	}
}
