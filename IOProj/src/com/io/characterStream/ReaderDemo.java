package com.io.characterStream;
/**
 * 瀛楄妭瀛楃杞崲娴� 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderDemo {
	public static void main(String[] args) {
		String src = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\characterStream\\test.txt";
		String src2 = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\characterStream\\test1.txt";
		
		try {
			FileInputStream fis = new FileInputStream(src);
			FileInputStream fis2 = new FileInputStream(src);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); //指定编码
			InputStreamReader isr2 = new InputStreamReader(fis2);
			FileOutputStream fos = new FileOutputStream(src2,true); //可追加写入
			OutputStreamWriter ost = new OutputStreamWriter(fos);
			int n;
			char[] cbuf = new char[10];
			
			//读取
			while ((n=isr.read(cbuf))!=-1) {
				String str = new String(cbuf,0,n); 
				System.out.print(str);
			}
			System.out.println();
			
			//写入
			while ((n=isr2.read(cbuf))!=-1) {
				ost.write(cbuf, 0, n); 
			}
			System.out.println("test2.txt写入完毕");
			ost.flush();
			
			fis.close();
			fis2.close();
			fos.close();
			isr.close();
			isr2.close();
			ost.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}