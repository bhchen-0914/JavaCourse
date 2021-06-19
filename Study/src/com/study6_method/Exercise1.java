package com.study6_method;
/*
 * 定义一个方法，根据商品总价，计算出对应的折扣并输出。折扣信息如下：

1） 总价<100，不打折

2） 总价在100到199之间，打9.5折

3） 总价在200以上，打8.5折
 * */

public class Exercise1 {
	 //根据商品总价输出折后总价
    public void payMoney(double money){
        double pay;
        if(money<100){
            pay=money;
        }else if(money<=199){
            pay=money*0.95;
        }else{
            pay=money*0.85;
        }
        System.out.println("折后商品总价为："+pay);
    }

	public static void main(String[] args) {
		//定义对象
		Exercise1 countdemo = new Exercise1();
		
		//定义商品总价存放到变量中
		int money=150;

		//调用方法，输出折后商品总价
		countdemo.payMoney(money);
		

	}

}
