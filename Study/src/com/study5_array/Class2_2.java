package com.study5_array;
/*
 * ��ά����ĳ�ʼ��
 * */
public class Class2_2 {

	public static void main(String[] args) {
		//��ʼ��
		int intArray[][] = {{1,2,3},{11,12,13},{21,22,23,24}};
		System.out.println("��һ�еڶ��У�"+intArray[0][1]);
		System.out.println("����Ϊ��"+intArray.length);
		System.out.println("��3������Ϊ��"+intArray[2].length);
		
		//ѭ�������ά����
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
