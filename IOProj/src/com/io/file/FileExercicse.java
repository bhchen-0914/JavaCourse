package com.io.file;

import java.io.File;
import java.io.IOException;


public class FileExercicse {
/*
 * Ҫ��

1������File�ļ��´���һ��Monday.docx���ļ����ж��ļ��Ƿ񴴽��ɹ������ɹ������ļ����ƺ͸�Ŀ¼��

2�����ж��ļ��Ƿ���ڣ������ھ��Ȼ�ȡ��·�������ơ�

3�����ж������ļ�����Ŀ¼���ж��ļ��Ƿ�ɶ�����д��

       �����������ʵ��ķ��������ļ����ж����ļ�����Ŀ¼���Լ��ж��ļ��Ŀɶ��ԡ�
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
			System.out.println("�����ļ��ɹ�");
		}
		
		System.out.println("�ļ�����"+file.getName());
		System.out.println("�ļ���һ��Ŀ¼"+file.getParent());
		new FileExercicse().checkType(file);
		new FileExercicse().checkRead(file);
	}
	
	/*
	 * �ж��ļ���Ŀ¼
	 * */
	public void checkType(File file) {
		if (file.isFile()) {
			System.out.println("�ļ�/Ŀ¼��һ���ļ�");
		} else if (file.isDirectory()) {
			System.out.println("�ļ�/Ŀ¼��һ��Ŀ¼");
		}
	}
	
	/*
	 * �жϿɶ���д��
	 * */
	public void checkRead(File file) {
		if (file.canRead() && file.canWrite()) {
			System.out.println("��д��:����ļ��ȿ��Զ�������д");
		} else if (file.canRead()&&(!file.canWrite())) {
			System.out.println("��д��:����ļ�ֻ���Զ�");
		} else if ((!file.canRead())&&file.canWrite()) {
			System.out.println("��д��:����ļ�ֻ����д");
		}else {
			System.out.println("��д��:����ļ������Զ�д");
		}
	}

}
