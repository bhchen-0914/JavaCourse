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
 * �������л�����:
 * ����һ���࣬�̳�Serializable�ӿ�
 * ��������
 * ������д���ļ�
 * ���ļ���ȡ������Ϣ 
 * */

/*
 * ����������:	ObjectInputStream
 * ���������:	ObjectOutputStream
 * */
public class ObjectStreamTest {

	public static void main(String[] args) {
		String src = "E:\\Eclipse\\eclipse-workspace\\IOProj\\src\\com\\io\\serialization\\message.txt";
		FileOutputStream fos;
		FileInputStream fis;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		//��ʼ����Ʒ
		Product iphone = new Product(123, "iphone", "telephone", 4888);
		Product ipad = new Product(234, "ipad", "computer", 5088);
		Product macbook = new Product(345, "macbook", "computer", 10688);
		Product iwatch = new Product(256, "iwatch", "watch", 4799);
		List<Product> productsList = new ArrayList<Product>(); //ʹ�ü��ϴ�������
		productsList.add(iphone);
		productsList.add(ipad);
		productsList.add(macbook);
		productsList.add(iwatch);

		try {
			//���л�
			fos = new FileOutputStream(src);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(productsList);
			oos.flush();
			
			//�����л�
			fis = new FileInputStream(src);
			ois = new ObjectInputStream(fis);
			System.out.println("Appleϵ�в�Ʒ��Ϣ");
			@SuppressWarnings("unchecked")
			ArrayList<Product> appleProduct = (ArrayList<Product>) ois.readObject();
			//�����б�
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
