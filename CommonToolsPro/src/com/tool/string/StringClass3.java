package com.tool.string;
/**
 * 
 * @author bhchen3
 *�ַ�����byte�������໥ת��
 */
public class StringClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("JAVA ��� ����");
		//���ַ���ת��Ϊbyte���飬����ӡ���
		byte[] arrs = str.getBytes();
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
		System.out.println();
		
		//��byte����ת��Ϊ�ַ���
		String str1=new String(arrs); //���ò���Ϊbyte����Ĺ��췽����ֱ��ʵ��
		
		//�������ʽ��һ��ʱ�������ڹ��췽���Ĳ�������ӱ����ʽ��������Ҫ�׳��쳣
		//���磺String str1=new String(arrs,"UTF-8")
		//������getBytes()��������ӱ����ʽ��byte[] arrs = str.getBytes("UTF-8");
		System.out.println(str1);

	}

}
