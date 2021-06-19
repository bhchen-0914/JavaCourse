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
			bos.flush(); //������δ��ʱ�������write��������ʹ��flush����ǿ����ջ�����
			int n;
			while ((n=bis.read())!=-1) {
				System.out.print((char)n);
			}
			System.out.println();
			
			bos.close(); //�ͷ���Դ��ͬʱ��Ҳ��ǿ����ջ�����
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
