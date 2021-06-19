package com.object.extend;
/*
 * Object����������ĸ���
 * һ����û��ʹ��extends�ؼ�����ȷ��ʶ�̳й�ϵ����Ĭ�ϼ̳�Object��(��������)
 * java��ÿ���඼��ʹ��Object�ж���ķ���
 * */

/*
 * final class:���࣬û������  public final class/final public class
 * final ������ �÷���������������д������������������̳�ʹ��
 * final �����ھֲ�������ֻҪ�ھ���ʹ��֮ǰ��ֵ���ɣ�һ����ֵ�Ͳ������޸�
 * final ���г�Ա���ԣ� ��ֵ������1.����ʱ��ʼ��  2.���췽���и�ֵ  3.�������鸳ֵ (��������ֵ)
 * */
public class ObjectStudy {
	public static void main(String[] args) {
		Cat cat1=new Cat("coffee", 2);
		Cat cat2=new Cat("ton", 3);
		Cat cat3=cat1;
		//equals����:�̳�Object���е�equals����ʱ���Ƚϵ���2�������Ƿ�ָ��ͬһ������
		boolean flag=cat1.equals(cat2);
		System.out.println("cat1��cat2�����ñȽ�:"+flag);
		System.out.println("cat1��cat2�����ñȽ�:"+(cat1==cat2));
		System.out.println("cat1��cat3�����ñȽ�:"+cat1.equals(cat3));
		System.out.println("==================");
		String str1=new String("hello");
		String str2=new String("hello");
//		String str1="hello";
//		String str2="hello";
		//String ����equals��������д���Ƚϵ�ֻ���ַ�����ֵ
		flag = str1.equals(str2);
		System.out.println("str1��str2�����ñȽ�:"+flag);
		System.out.println("str1��str2�����ñȽ�:"+(str1==str2));
		
		System.out.println("==================");
		//����ͨ����дequals������ʹ����ֻ�ȶԴ������ݵ�ֵ
		Bird bird1=new Bird("woody", 1, "white");
		Bird bird2=new Bird("woody", 1, "white");
		Bird bird3=new Bird("woody2", 1, "white");
		System.out.println("bird1��bird2��equals�Ƚ�:"+bird1.equals(bird2));
		System.out.println("bird1��bird3��equals�Ƚ�:"+bird1.equals(bird3));
		System.out.println("bird1��bird2�����ñȽ�:"+ (bird1==bird2));
		
		System.out.println("==================");
		/*
		 * toString���ԣ�
		 * 1.���������ʱ��Ĭ�ϻ�ֱ�ӵ��ö����е�toString����
		 * 2.�̳�Object�е�toString����ʱ����������ַ����ı�����ʽ��������Ϣ+@+��ַ��Ϣ
		 * 3.�������ͨ����дtoString��������ʽ���ı�����������Լ�������ʽ
		 * */
		System.out.println(bird1);
		System.out.println(bird1.toString()); //@1f32e575�������ڴ��ַ
		System.out.println(cat1);
		System.out.println(cat2);
		
	}
}
	