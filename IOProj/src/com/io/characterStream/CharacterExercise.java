package com.io.characterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 1��Ϊ��߶�д���ʣ�Ҫ��ʹ�ô��л��������ַ������ж�д��
2����������transWriteByBuf()д���ļ���
3����������transReadByBuf()���ļ��������ݣ�
4�����ַ��������ж�ȡ�ı�ʱ����ʹ��readLine()�������Ӷ��Ի��з�����ʶ��һ��һ�еض�ȡ�ı���
5���ڲ��Է����е���transWriteByBuf()������transReadByBuf()������
 * */
public class CharacterExercise {

	public static void main(String[] args) {
		String src = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\characterStream\\hello.txt";
		String str1 = "�����";
		String str2 = "�Һܺã�";
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(src)));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src))) ;
			new CharacterExercise().transWriteByBuf(bw, str1);
			new CharacterExercise().transWriteByBuf(bw, str2);
			new CharacterExercise().transReadByBuf(br);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//д������
	public void transWriteByBuf(BufferedWriter bw,String str) throws IOException {
		bw.write(str);
		bw.write("\n");
		bw.flush();
	}
	
	//��ȡ����
	public void transReadByBuf(BufferedReader br) throws IOException {
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
	}

}
