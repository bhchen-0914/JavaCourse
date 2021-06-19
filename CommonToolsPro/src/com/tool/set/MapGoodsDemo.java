package com.tool.set;

public class MapGoodsDemo {
	private String id; //��Ʒid
	private String name; //��Ʒ����
	private double price; //��Ʒ�۸�
	
	public MapGoodsDemo(String id,String name,double price) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		String string = "��Ʒ���:"+this.getId()+",��Ʒ����:"+this.getName()+",��Ʒ�۸�"+this.getPrice();
		return string;
	}
	

}
