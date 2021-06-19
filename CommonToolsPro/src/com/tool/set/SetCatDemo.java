package com.tool.set;

/**
 * 
 * @author bhchen3
 *宠物猫类
 */
public class SetCatDemo {
	private String name;
	private int age;
	private String species;
	
	//无参构造
	public SetCatDemo() {
		
	}

	/**
	 * 
	 * @param name 名字
	 * @param age 年龄
	 * @param species 品种
	 */
	public SetCatDemo(String name, int age, String species) {
		this.setName(name);
		this.setAge(age);
		this.setSpecies(species);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	//重写toString方法
	@Override
	public String toString() {
		String str= "[我的名字叫"+this.getName()+",我现在"+this.getAge()+"岁了，我是一只"+this.getSpecies()+"]";
		return str;
	}

	//重写hashCode方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	//重写equals方法，用于判断对象的重复
	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj.getClass()==SetCatDemo.class) {
			SetCatDemo cat = (SetCatDemo)obj;
			return this.getName().equals(cat.getName()) && (this.getAge()==cat.getAge()) && this.getSpecies().equals(cat.getSpecies());
		}
		return false;
	}

}
