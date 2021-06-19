package com.io.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Buffered.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream("Buffered.txt");
			BufferedInputStream bis =new BufferedInputStream(fis);
			bos.write(50);
			bos.write('a');
			bos.flush(); //缓冲区未满时不会调用write方法，需使用flush方法强制清空缓冲区
			int n;
			while ((n=bis.read())!=-1) {
				System.out.print((char)n);
			}
			System.out.println();
			
			bos.close(); //释放资源的同时，也会强制清空缓冲区
			bis.close();
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
