package com.study5_array;
/*
1、定义一个字符数组ch并初始化
2、循环遍历数组，统计字符’a’或’A’出现的次数并输出
 * */

public class Exercise2 {

	public static void main(String[] args) {
		//定义一个字符数组ch并初始化
	    char chrArray[]={'a','A','s','A','2','!','a'};
		int count=0;
		//循环遍历数组，统计字符’a’或’A’出现的次数
//		 for(int i=0;i<chrArray.length;i++){
//		     if((chrArray[i]=='a')|(chrArray[i]=='A')){
//		         count++;
//		     }
//		 }
		for(char c:chrArray) {
			if(c=='a'|c=='A') {
				count++;
			}
		}

		//打印输出统计数据
		System.out.println("字符组中字符'a'或'A'出现的个数为："+count);

	}

}
