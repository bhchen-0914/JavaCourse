package com.io.file;

import java.io.File;
import java.io.IOException;


public class FileExercicse {
/*
 * 要求：

1、先在File文件下创建一个Monday.docx的文件。判断文件是否创建成功，若成功返回文件名称和父目录。

2、先判断文件是否存在，若存在就先获取其路径或名称。

3、再判断其是文件还是目录；判断文件是否可读、可写：

       方法：请用适当的方法创建文件，判断是文件还是目录；以及判断文件的可读性。
 * */
	public static void main(String[] args) {
		File file = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\file\\Monday.docx");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("创建文件成功");
		}
		
		System.out.println("文件名称"+file.getName());
		System.out.println("文件上一级目录"+file.getParent());
		new FileExercicse().checkType(file);
		new FileExercicse().checkRead(file);
	}
	
	/*
	 * 判断文件或目录
	 * */
	public void checkType(File file) {
		if (file.isFile()) {
			System.out.println("文件/目录是一个文件");
		} else if (file.isDirectory()) {
			System.out.println("文件/目录是一个目录");
		}
	}
	
	/*
	 * 判断可读可写性
	 * */
	public void checkRead(File file) {
		if (file.canRead() && file.canWrite()) {
			System.out.println("读写性:这个文件既可以读还可以写");
		} else if (file.canRead()&&(!file.canWrite())) {
			System.out.println("读写性:这个文件只可以读");
		} else if ((!file.canRead())&&file.canWrite()) {
			System.out.println("读写性:这个文件只可以写");
		}else {
			System.out.println("读写性:这个文件不可以读写");
		}
	}

}
