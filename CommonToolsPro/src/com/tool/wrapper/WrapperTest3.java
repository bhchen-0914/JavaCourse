package com.tool.wrapper;
/*
 * ��װ���Ĭ��ֵ����null
 * �������صĸ���
 * ����float��double�����������������;���Ӧ�ö������صĸ���
 * */
public class WrapperTest3 {

	public static void main(String[] args) {
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		//one��two�ֱ�ָ������ڴ���2����ͬ�ĵ�ַ�����one������two
		System.out.println("one==two�Ľ����"+(one==two));
		System.out.println("one==two�Ľ����"+(one==two));
		
		Integer three = 100; //�Զ�װ��
		System.out.println("three==100�Ľ����"+(three==100)); //���Զ�����

		Integer four = 100;
		//�Զ�װ�䣬�൱����ʽ����Integer.valueOf()����
		//��������ִ���-128<����<127�Ĳ���ʱ����ֱ�����ö�����û�У��Ż�newһ���µĶ���
		//��ˣ�three��fourָ��ͬһ������
		System.out.println("four==three�Ľ����"+(three==four)); 
		
		Integer five = 200;
		System.out.println("five==200�Ľ����"+(five==200)); //ͬ�ϣ��Ƚϵ����Զ������2��int���͵�ֵ
		
		Integer six = 200;
		//��Ϊ200����-128-127��Χ�ڣ���˻�����newһ��Integer�������ԱȽϽ��Ϊfalse
		System.out.println("five==six�Ľ����"+(five==six));
 	}

}
