package com.object.encapsulation;
/**
 * static�ؼ��ֵ�ѧϰ
 * ��������ĸ���
 * @author bhchen3
 *
 */


public class StaticDeemo {
	public String name;
	/*
	 * ʹ��static�ؼ������εĳ�Ա����Ϊ��̬��Ա�����Ա����������ʱ��Ϊ�����ԣ����η���ʱ�ƺ�Ϊ�෽����
	 * ����ʵ���������ٶ��󣬶���static���εĳ�Ա��������ͬһ��洢�ռ�
	 * ������ͨ��Ա��˵������Ķ��󴴽�������صĳ�Ա�������������������ٺ󣬴˳�Աһ������	��������Դ�ͷ�
	 *���Ƕ��ھ�̬��Ա����һ���౻����ʱ������ֻ�е�����౻����ʱ�Ż������Դ�ͷţ��������ڳ�
	 *
	 * */
	public static double price; //��̬��Ա��ͨ��������ʣ�Ҳ��ͨ����ֱ�ӷ���
	
	public StaticDeemo(){
		System.out.println("�����ǹ��췽��");
	}
	//�������������ڹ��췽������
	//�����ж����������
	//����������Ը���̬��Ա����ͨ��Ա��ֵ
	{
		System.out.println("�����ǹ�������1");
	}
	public void test1() {
//		static int temp;  static�����������ξֲ�����
		this.price=1000; //��Ա�������Է�����ľ�̬��Ա
		System.out.println("price��"+this.price);
	}
	
	public static void test2() {
		System.out.println("test2��һ����̬����");
//		this.test1();�෽���в���ֱ�ӷ���ͬһ�����еķǾ�̬��Ա��ֻ��ֱ�ӵ���ͬһ�����о�̬��Ա������ʹ��this�ؼ���
//		name="haha"; ���ܷ��ʷǾ�̬����
		
//		���Ҫǿ�з��ʷǾ�̬��Ա��ֻ��ͨ�������ʵ������ʹ�ö���.��Ա ����ʽ����
//		StaticDeemo st=new StaticDeemo();
//		st.name="haha";
		price=99;
		test3();//��ֱ�ӵ��þ�̬����
	}
	
	public static void test3() {
		System.out.println("���ڵ�price��"+price);
	}
	
//��̬����飬��̬�������������ͨ�����ִ��
//��̬��������Ϊ��̬��Ա��ֵ����ͨ��Ա�޷���ֵ
	static {
		System.out.println("�����Ǿ�̬�����");
	}
	
}
