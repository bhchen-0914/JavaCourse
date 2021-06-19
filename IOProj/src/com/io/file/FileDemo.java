package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// 创建file对象
		File file = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\file");
		File file1 = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\file\\score.txt");
		
		//判断是文件还是目录
		System.out.println("是否是目录:"+file1.isDirectory());
		System.out.println("是否是文件:"+file1.isFile());
		
		//创建文件
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("创建成功");
		
		System.out.println("是否是文件:"+file1.isFile());
		
		//file1是否绝对路径
		System.out.println("file1是否是绝对路径"+file1.isAbsolute());
		
		//file1的绝对路径
		System.out.println("file1的相对路径:"+file1.getAbsolutePath());
		
		//file1的相对路径
		System.out.println("file1的相对路径："+file1.getPath());
		
		//创建目录
		File file2 = new File(file, "//set");
		if (!file2.exists()) {
			file2.mkdir();
		}
		System.out.println("是否是目录:"+file2.isDirectory());
		
		//创建多级目录
		File file3 = new File(file, "//set//HashSet//HashSet2");
		if (!file3.exists()) {
			file3.mkdirs();
		}
		System.out.println("是否是目录:"+file3.isDirectory());
				
	}	

}
