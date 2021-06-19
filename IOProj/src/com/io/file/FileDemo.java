package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// ����file����
		File file = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\file");
		File file1 = new File("E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\file\\score.txt");
		
		//�ж����ļ�����Ŀ¼
		System.out.println("�Ƿ���Ŀ¼:"+file1.isDirectory());
		System.out.println("�Ƿ����ļ�:"+file1.isFile());
		
		//�����ļ�
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("�����ɹ�");
		
		System.out.println("�Ƿ����ļ�:"+file1.isFile());
		
		//file1�Ƿ����·��
		System.out.println("file1�Ƿ��Ǿ���·��"+file1.isAbsolute());
		
		//file1�ľ���·��
		System.out.println("file1�����·��:"+file1.getAbsolutePath());
		
		//file1�����·��
		System.out.println("file1�����·����"+file1.getPath());
		
		//����Ŀ¼
		File file2 = new File(file, "//set");
		if (!file2.exists()) {
			file2.mkdir();
		}
		System.out.println("�Ƿ���Ŀ¼:"+file2.isDirectory());
		
		//�����༶Ŀ¼
		File file3 = new File(file, "//set//HashSet//HashSet2");
		if (!file3.exists()) {
			file3.mkdirs();
		}
		System.out.println("�Ƿ���Ŀ¼:"+file3.isDirectory());
				
	}	

}
