package com.io.byteStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流练习
 * @author bhchen3
 *
 */

/*
 * 编写一个Java程序，将100000个字符分别写入文件one.txt
 * 和文件two.txt，one用不加缓冲的文件输出流来写，
 * two用缓冲文件输出流来写，比较用时的多少。
 * */
 
public class BufferedExercise {

	public static void main(String[] args) {
		BufferedOutputStream bos;
		FileOutputStream fos1;
		FileOutputStream fos2;
		
		try {
			fos1 = new FileOutputStream("one.txt");
			fos2 = new FileOutputStream("two.txt");
			bos = new BufferedOutputStream(fos2);
			
			long startTime1 = System.currentTimeMillis();
			System.out.println("开始写入one.txt数据");
			for (int i=1;i<=50000;i++) {
				fos1.write(i);
			}
			System.out.println("one.txt写入完毕");
			long endTime1 = System.currentTimeMillis();
			System.out.println("one.txt不加缓冲流花费时间:"+(endTime1-startTime1));
			
			long startTime2 = System.currentTimeMillis();
			System.out.println("开始写入two.txt数据");
			for (int i=1;i<=50000;i++) {
				bos.write(i);
			}
			bos.flush();
			System.out.println("two.txt写入完毕");
			long endTime2 = System.currentTimeMillis();
			System.out.println("two.txt使用缓冲流花费时间:"+(endTime2-startTime2));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
