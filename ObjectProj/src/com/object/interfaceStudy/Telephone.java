package com.object.interfaceStudy;
/**
 * ԭʼ�ֻ�
 * @author bhchen3
 *
 */
public class Telephone {
	private String brand;
	private int price;
	
	//�޲ι���
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
	
	//��绰 	
	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}
	
}
