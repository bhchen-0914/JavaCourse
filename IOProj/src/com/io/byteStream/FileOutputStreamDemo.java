package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		
		try {
			fos = new FileOutputStream("word.txt");
			fis = new FileInputStream("word.txt");
			fos.write(50);
			fos.write('a');
			System.out.println((char)fis.read());
			System.out.println((char)fis.read()); //按字符型读取
			fos = new FileOutputStream("word.txt", true); // 追加写入
			fos.write(60);

			int n;
			while ((n=fis.read())!=-1) {
				System.out.print((char)n);
			}
			
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
