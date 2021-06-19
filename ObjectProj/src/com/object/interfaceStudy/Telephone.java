package com.object.interfaceStudy;
/**
 * 原始手机
 * @author bhchen3
 *
 */
public class Telephone {
	private String brand;
	private int price;
	
	//无参构造
	public Telephone() {}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//打电话 	
	public void call() {
		System.out.println("手机可以打电话");
	}
	
}
