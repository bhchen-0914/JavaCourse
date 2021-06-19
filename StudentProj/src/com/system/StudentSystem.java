package com.system;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * ѧ���ɼ�����ϵͳ
 * @author bhchen3
 *
 */

public class StudentSystem {
	/**
	 * ��ʾ�˵�
	 */
	public void displayMenu() {
		System.out.println("********************************************");
		System.out.println("                1--��ʼ����ѧ�ɼ�");
		System.out.println("                2--��ɼ�ƽ��ֵ");
		System.out.println("                3--ͳ�Ƴɼ�����85�ֵ�����");
		System.out.println("                4--�޸�ָ��λ�ô��ĳɼ�");
		System.out.println("                5--��ӡ������гɼ�");
		System.out.println("                0--�˳�");
		System.out.println("********************************************");
	}
	
	/**
	 * ��ʼ����ѧ�ɼ�
	 */
	public float[]  initScore() {
		Scanner sc=new Scanner(System.in);
		int number=0; //��ʼ���ɼ�����
		while(true) {
			try {
				System.out.println("��������Ҫ¼��ɼ��ĸ�����");
				number=sc.nextInt(); 
				break;
			} catch (InputMismatchException e) {
				System.out.println("ֻ����������");
				sc.next();
			}
		}
		
		float scoreArray[]=new float[number];//��ʼ�����鳤��
		for(int i=0;i<scoreArray.length;i++) {
			try {
				System.out.println("�������"+(i+1)+"ѧ���ĳɼ���");
				scoreArray[i]=sc.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("��������ȷ�����֣�����Ϊ�������ַ���");
				sc.next();
				i--;
			}
			
		}
//		sc.close();
		return scoreArray;
	} 
	
	/**
	 * 
	 * @param f :���ڼ���ƽ���ֵĳɼ�����
	 * @return ����ƽ���ɼ�
	 */
	public float average(float[] f) {
		float sum=0,aver=0;
		for(float s:f) {
			sum+=s;
		}
		aver=sum/f.length;
		return aver;
	}
	
	/**
	 * @param f :����ͳ�Ƴɼ�������
	 * @return ���ش���85�ĸ���
	 */
	public int count(float[] f) {
		int number=0;
		for(float s:f) {
			if(s>85) {
				number++;
			}
		}
		return number;
	}
	
	/**
	 * 
	 * @param f :�����滻�ɼ�������
	 * @param index :�滻��λ�ã���0��ʼ���������±꺬����ͬ
	 * @param newScore :�µĳɼ�
	 */

	public float[] update(float[] f,int index,float newScore) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�޸�ǰ��");
		displayAllScore(f);
		while(true) {
			try {
				System.out.println("������Ҫ�޸����ݵ�λ��(��0��ʼ)��");
				index=sc.nextInt(); 
				f[index]=0; //�����ж������Ƿ�Խ�磬�׳��쳣
				break;
			} catch (InputMismatchException e) {
				System.out.println("��������ȷ�����֣�����Ϊ�������ַ�");
				sc.next();
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("λ�ò���ȷ��");
			}
		}
		while(true) {
			try {
				System.out.println("�����������ݣ�");
				newScore=sc.nextFloat();
				break;
			} catch (InputMismatchException e) {
				System.out.println("��������ȷ�����֣�����Ϊ�������ַ�");
				sc.next();
			}
		}
		f[index]=newScore;
		System.out.println("�޸ĺ�");
		displayAllScore(f);
//		sc.close();
		return f;
	}
	
	/**
	 * 
	 * @param f :����չʾ�ɼ�������
	 */
	public void  displayAllScore(float[] f) {
		System.out.println("�ɼ�Ϊ��");
		for(float score:f) {
			System.out.print(score+"  ");
		}
		System.out.println();
	}
	
	//������
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentSystem stu=new StudentSystem();
		float scoreArray[]=null;  //����������һ����ųɼ�������
		int index=0;  //��ʼ������λ��
		int newScore=0;  //��ʼ���޸ĳɼ�
		int input=0;
 		while (true) {
			stu.displayMenu();
			System.out.println("�������Ӧ�����ֽ��в�����");
			try {
				input=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��������ݸ�ʽ����");
				sc.next();
				continue;
			}
			if(input==0) {
				System.out.println("�˳�����");
				sc.close();
				break;
			}
			switch(input) {
			case 1:
				//��ʼ���ɼ�
				scoreArray=stu.initScore();break;
			case 2:
				//��ɼ�ƽ��ֵ
				if(scoreArray!=null) {
					System.out.println("��ѧƽ���ɼ�Ϊ��"+stu.average(scoreArray));
					break;
				}else {
					System.out.println("���ʼ����ѧ�ɼ����ٽ��в�����");
				}break;
			case 3:
				//ͳ�ƴ���85�ֵ�����
				if(scoreArray!=null) {
					System.out.println("�ɼ�����85�ֵ�����Ϊ��"+stu.count(scoreArray));
					break;
				}else {
					System.out.println("���ʼ����ѧ�ɼ����ٽ��в�����");
				}break;
			case 4:
				//�޸�ָ��λ�ô��ĳɼ�
				if (scoreArray!=null) {
					scoreArray=stu.update(scoreArray, index, newScore);
					break;
				}else {
					System.out.println("���ʼ����ѧ�ɼ����ٽ��в�����");
				}break;
			case 5:
				//��ӡ����ɼ�
				if(scoreArray!=null) {
					stu.displayAllScore(scoreArray);
					break;
				}else {
					System.out.println("���ʼ����ѧ�ɼ����ٽ��в�����");
				}break;
			default:
				System.out.println("������0~5�����ֽ��в���");
			}
		}	
	}
}
