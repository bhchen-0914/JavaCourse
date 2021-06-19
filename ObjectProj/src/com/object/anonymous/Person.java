package com.object.anonymous;

public abstract class Person {
	private String name;
	
	//�޲ι���
	public Person() {}

	public Person(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void read();
	

}
