package com.tool.wrapper;
/**
 * 
 * @author bhchen3
 *�����������ͺ��ַ���֮���ת��
 */
public class WrapperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������ת��Ϊ�ַ���
		int t1=2;
		String t2=Integer.toString(t1);	
		System.out.println("int����ת��ΪString���Ͷ���t2��"+t2);
		
		System.out.println("*******************");
		
		//�ַ���ת��Ϊ������������
		//��ʽ1����װ���parse����
		int t3=Integer.parseInt(t2);
		System.out.println("ת��Ϊint���͵�t3��"+t3);
		
		//��ʽ2����װ���valueOf�������Ƚ��ַ���ת��Ϊ��װ�࣬��ͨ���Զ�������ɻ������͵�ת��
		String s="66";
		int t4=Integer.valueOf(s);
		System.out.println("ת��Ϊint���͵�t4��"+t4);

	}
	
}
