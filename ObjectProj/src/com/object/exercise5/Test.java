package com.object.exercise5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BallTest balltest=new BallTest();
			//完成成员内部类内部测试
			BallTest.Inner_m inner_m = balltest.new Inner_m();
			balltest.playBall(inner_m);
			
			//完成方法内部类测试
			Ball ball=balltest.info();
			balltest.playBall(ball);
			
			//完成匿名内部类测试
			balltest.playBall(new Ball() {
				
				@Override
				public void play() {
					// TODO Auto-generated method stub
					 System.out.println("**********");
		             System.out.println("匿名内部类");
		             System.out.println("打排球");
				}
			});
		
	}

}
