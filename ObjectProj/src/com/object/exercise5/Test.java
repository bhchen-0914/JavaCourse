package com.object.exercise5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BallTest balltest=new BallTest();
			//��ɳ�Ա�ڲ����ڲ�����
			BallTest.Inner_m inner_m = balltest.new Inner_m();
			balltest.playBall(inner_m);
			
			//��ɷ����ڲ������
			Ball ball=balltest.info();
			balltest.playBall(ball);
			
			//��������ڲ������
			balltest.playBall(new Ball() {
				
				@Override
				public void play() {
					// TODO Auto-generated method stub
					 System.out.println("**********");
		             System.out.println("�����ڲ���");
		             System.out.println("������");
				}
			});
		
	}

}
