package com.io.byteStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��������ϰ
 * @author bhchen3
 *
 */

/*
 * ��дһ��Java���򣬽�100000���ַ��ֱ�д���ļ�one.txt
 * ���ļ�two.txt��one�ò��ӻ�����ļ��������д��
 * two�û����ļ��������д���Ƚ���ʱ�Ķ��١�
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
			System.out.println("��ʼд��one.txt����");
			for (int i=1;i<=50000;i++) {
				fos1.write(i);
			}
			System.out.println("one.txtд�����");
			long endTime1 = System.currentTimeMillis();
			System.out.println("one.txt���ӻ���������ʱ��:"+(endTime1-startTime1));
			
			long startTime2 = System.currentTimeMillis();
			System.out.println("��ʼд��two.txt����");
			for (int i=1;i<=50000;i++) {
				bos.write(i);
			}
			bos.flush();
			System.out.println("two.txtд�����");
			long endTime2 = System.currentTimeMillis();
			System.out.println("two.txtʹ�û���������ʱ��:"+(endTime2-startTime2));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
