package com.io.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream
 * -���ļ�ϵͳ�е�ĳ���ļ��л�ȡ�����ֽ�
 * -���ڶ�ȡ����ͼ������֮���ԭʼ�ֽ���
 * */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		// ����file����
		File file = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\byteStream\\hello.txt");
		System.out.println(file.exists());
		//����FileInputStream����
		try {
			FileInputStream fis = new FileInputStream(file);
			int n=0;
			//���txt�е�����
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
