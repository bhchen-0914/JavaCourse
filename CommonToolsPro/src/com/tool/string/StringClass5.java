package com.tool.string;

/**
 * 
 * @author bhchen3
 *String���ɱ���
 */
public class StringClass5 {

	/*
	 * String����һ���������������޸ģ��ǲ��ɱ��
	 * ��ν���޸���ʵ�Ǵ������µĶ�����ָ����ڴ�ռ䲻��
	 * */
	public static void main(String[] args) {
		String str1="JAVA";
		str1="hello,"+str1;
		//str1����ָ��"JAVA"���ڵĳ������е�ֵ������ָ����"hello��JAVA"
		System.out.println("str1:"+str1);
		
		System.out.println("=================");
		
		String s1="JAVA";
		String s2="hello,"+s1;
		//s1��s2�ֱ�ָ��������2��ֵ
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		System.out.println("=================");
		
		String s3=new String("hello,java");
		System.out.println("�Ӵ���"+s3.substring(0, 5));
		//���ڶ�������s3����ջ�е�s3ָ��ö��󣬵���substring������
		//�õ��ġ�hello��Ҳ�Ǵ���ڶ��У�Ȼ�����
		//�����������ĵ��ù����У�s3��ָ��һֱû�иı��		
		System.out.println("s3:"+s3);
		
		
	}

}
