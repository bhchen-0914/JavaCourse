package com.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream
 * -从文件系统中的某个文件中获取输入字节
 * -用于读取诸如图像数据之类的原始字节流
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		// 创建file对象
		File file = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\byteStream\\hello.txt");
		System.out.println(file.exists());
		//创建FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream(file);
			int n=0;
			//输出txt中的内容
			while ((n=fis.read())!=-1) {
				System.out.print((char)n);
			}
			System.out.println();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
