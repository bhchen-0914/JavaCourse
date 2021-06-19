package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
/*
 * 复制文件
 * */
	public static void main(String[] args) {
		byte byteArray[] = new byte[1024];
		try {
			FileInputStream fis1 = new FileInputStream("001.gif");
			FileInputStream fis2 = new FileInputStream("01.jpg");
			FileOutputStream fos1 = new FileOutputStream("001cpoy.gif");
			FileOutputStream fos2 = new FileOutputStream("01cpoy.jpg");
			new FileOutputStreamDemo2().copyFile(fis1, fos1, byteArray);
			new FileOutputStreamDemo2().copyFile(fis2, fos2, byteArray);
			fis1.close();
			fis2.close();
			fos1.close();
			fos2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void copyFile(FileInputStream fis,FileOutputStream fos,byte[] b ) {
		int n = 0;
		try {
			while ((n=fis.read(b))!=-1) {
				fos.write(b, 0, n); //可以保证复制的文件与源文件大小一致
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("复制成功");
	}

}
