package com.study4_loop;
/*
 * ��дһ���������200��300֮�������������������������������֮��Ϊ42����������֮��Ϊ12��
 * */
public class Exercise2 {

	public static void main(String[] args) {
		//�������ge��shi��bai�����ڴ�Ÿ�λ��ʮλ����λ�ϵ�����
		int ge,shi,bai;
		        
		//ʹ��forѭ��
		for(int num=200;num<=300;num++){
			//ȡ����λ��
			bai=num/100;
			//ȡ��ʮλ��
			shi=(num-100*bai)/10;
	
			//ȡ����λ��
			ge=num-100*bai-10*shi;

			//������������֮��
		    int mul=bai*shi*ge;
			//������������֮��
			int sum=bai+shi+ge;
		    //���������42���Һ�Ϊ12�������������������
		    if (mul==42&sum==12){
		    	System.out.println(num);
		            }
		 
		        }
			}

	}

