package com.study6_method;
/*
 * ����һ��������������Ʒ�ܼۣ��������Ӧ���ۿ۲�������ۿ���Ϣ���£�

1�� �ܼ�<100��������

2�� �ܼ���100��199֮�䣬��9.5��

3�� �ܼ���200���ϣ���8.5��
 * */

public class Exercise1 {
	 //������Ʒ�ܼ�����ۺ��ܼ�
    public void payMoney(double money){
        double pay;
        if(money<100){
            pay=money;
        }else if(money<=199){
            pay=money*0.95;
        }else{
            pay=money*0.85;
        }
        System.out.println("�ۺ���Ʒ�ܼ�Ϊ��"+pay);
    }

	public static void main(String[] args) {
		//�������
		Exercise1 countdemo = new Exercise1();
		
		//������Ʒ�ܼ۴�ŵ�������
		int money=150;

		//���÷���������ۺ���Ʒ�ܼ�
		countdemo.payMoney(money);
		

	}

}
