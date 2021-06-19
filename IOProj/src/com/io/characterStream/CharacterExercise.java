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
 * 1、为提高读写速率，要求使用带有缓冲区的字符流进行读写；
2、创建方法transWriteByBuf()写入文件；
3、创建方法transReadByBuf()从文件读出内容；
4、从字符输入流中读取文本时可以使用readLine()方法，从而对换行符进行识别，一行一行地读取文本；
5、在测试方法中调用transWriteByBuf()方法和transReadByBuf()方法。
 * */
public class CharacterExercise {

	public static void main(String[] args) {
		String src = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\characterStream\\hello.txt";
		String str1 = "你好吗？";
		String str2 = "我很好！";
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
	
	//写入内容
	public void transWriteByBuf(BufferedWriter bw,String str) throws IOException {
		bw.write(str);
		bw.write("\n");
		bw.flush();
	}
	
	//读取内容
	public void transReadByBuf(BufferedReader br) throws IOException {
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
	}

}
