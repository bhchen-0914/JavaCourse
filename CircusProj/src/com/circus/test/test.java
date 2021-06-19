package com.circus.test;

import java.util.Scanner;
import com.circus.basic.IACT;
import com.circus.implementation.*;


public class test {

	public static void main(String[] args) {
		//�����ж��ݳ�ѭ������ֹ����
		boolean flag=true;
		
		//ʵ��������
		View view=new View();
		IACT bearAct=new Bear("Bill", 1);
		IACT lionAct=new Lion("Lain", 2, "��ɫ", "��ʨ");
		IACT monkeyAct=new Monkey("Tom", 1, "��˿��");
		IACT parrotACT=new Parrot("Rose", 1, "ĵ������");
		IACT clownAct=new Clown("Kahle", 5);
		Scanner input=new Scanner(System.in);
		
		//���ݵ�ѭ��
		while (flag) {
			view.showView();
			int choose=input.nextInt();
			//ѡ�������Ŀ
			switch (choose) {
			case 1:
				bearAct.act();
				break;
			case 2:
				lionAct.act();
				break;
			case 3:
				monkeyAct.act();
				break;
			case 4:
				parrotACT.act();
				break;
			case 5:
				clownAct.act();
				break;
			default:
				System.out.println("*******������Ϣ����ȷ*******");;
				break;
			}
			
			//ѡ�������ѭ��
			while (true) {
				System.out.println("******* �Ƿ�����ۿ�(1/0) *******");
				int keep=input.nextInt();
				if (keep==1) {
					break;
				}else if (keep==0) {
					flag=false; //ֹͣ���ݵ�ѭ��
					System.out.println("********  ��ӭ�´ι���  ********");
					break;
				}else {
					System.out.println("***������Ϣ����ȷ������������***");
				}
			}
		}
		input.close();	
	}

}
