package com.tool.set;

/**
 * 
 * @author bhchen3
 *����è��
 */
public class SetCatDemo {
	private String name;
	private int age;
	private String species;
	
	//�޲ι���
	public SetCatDemo() {
		
	}

	/**
	 * 
	 * @param name ����
	 * @param age ����
	 * @param species Ʒ��
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
	
	//��дtoString����
	@Override
	public String toString() {
		String str= "[�ҵ����ֽ�"+this.getName()+",������"+this.getAge()+"���ˣ�����һֻ"+this.getSpecies()+"]";
		return str;
	}

	//��дhashCode����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	//��дequals�����������ж϶�����ظ�
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
