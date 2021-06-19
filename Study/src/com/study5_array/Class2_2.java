package com.study5_array;
/*
 * 二维数组的初始化
 * */
public class Class2_2 {

	public static void main(String[] args) {
		//初始化
		int intArray[][] = {{1,2,3},{11,12,13},{21,22,23,24}};
		System.out.println("第一行第二列："+intArray[0][1]);
		System.out.println("行数为："+intArray.length);
		System.out.println("第3行列数为："+intArray[2].length);
		
		//循环输出二维数组
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
