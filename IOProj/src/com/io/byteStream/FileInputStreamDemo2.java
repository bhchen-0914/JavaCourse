package com.io.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamDemo2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\byteStream\\hello.txt");
			byte byteArray[] = new byte[100];
			//���ض����ݴ�ŵ������У�0Ϊƫ������10������
			fis.read(byteArray, 0, 10); 
			System.out.println(new String(byteArray));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
