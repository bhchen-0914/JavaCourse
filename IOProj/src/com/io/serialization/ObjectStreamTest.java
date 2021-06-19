package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 对象序列化步骤:
 * 创建一个类，继承Serializable接口
 * 创建对象
 * 将对象写入文件
 * 从文件读取对象信息 
 * */

/*
 * 对象输入流:	ObjectInputStream
 * 对象输出流:	ObjectOutputStream
 * */
public class ObjectStreamTest {

	public static void main(String[] args) {
		String src = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\serialization\\message.txt";
		FileOutputStream fos;
		FileInputStream fis;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		//初始化产品
		Product iphone = new Product(123, "iphone", "telephone", 4888);
		Product ipad = new Product(234, "ipad", "computer", 5088);
		Product macbook = new Product(345, "macbook", "computer", 10688);
		Product iwatch = new Product(256, "iwatch", "watch", 4799);
		List<Product> productsList = new ArrayList<Product>(); //使用集合储存数据
		productsList.add(iphone);
		productsList.add(ipad);
		productsList.add(macbook);
		productsList.add(iwatch);

		try {
			//序列化
			fos = new FileOutputStream(src);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(productsList);
			oos.flush();
			
			//反序列化
			fis = new FileInputStream(src);
			ois = new ObjectInputStream(fis);
			System.out.println("Apple系列产品信息");
			@SuppressWarnings("unchecked")
			ArrayList<Product> appleProduct = (ArrayList<Product>) ois.readObject();
			//遍历列表
			for (Product product:appleProduct) {
				System.out.println(product);
			}
			
			fos.close();
			fis.close();
			ois.close();
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
