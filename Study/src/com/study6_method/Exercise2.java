package com.study6_method;
/*

1������һ���������������ƽ��ֵ
2�����������ж�����󣬲���ʼ��һ��float���͵����飬
      ���÷���������Ԫ�ص�ƽ��ֵ������ƽ��ֵ��ӡ���
 * */

public class Exercise2 {
	//������Ԫ�ص�ƽ��ֵ
	 public void averageArray(float[] arr){
	        float sum=0,average=0;
	        for(float f:arr){
	            sum+=f;
	        }
	        average=sum/arr.length;
	        System.out.println("�����ƽ��ֵΪ��"+average);
	    }

	public static void main(String[] args) {
		//�������
		Exercise2 average = new Exercise2();
		
		//����float���͵����鲢��ʼ��
		float floatArray[]={78.5f,98.5f,65.5f,32.5f,75.5f};
		//���÷�����ƽ��ֵ����ӡ���
		average.averageArray(floatArray);
		
		
	}

}