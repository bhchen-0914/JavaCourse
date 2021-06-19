package com.tool.exception;
/**
 * 异常链
 * @author bhchen3
 *
 */

/*
 * 有时候我们会捕获一个异常后再抛出另一个异常
 * 将异常发生的原因一个传一个串起来，即把底层的异常信息传给上层，这样逐层抛出
 * */
public class ExceptionChain {

	public static void main(String[] args) {
		try {
			test3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void test1() throws CustomException {
		throw new CustomException();
	}
	
	public static void test2() throws Exception {
		try {
			test1();
		} catch (CustomException e) {
			throw new Exception("这里是新产生的异常1",e); //将捕获的异常对象的参数加入到构造函数里
		}
	}
	
	public static void test3() throws Exception {
		try {
			test2();
		} catch (Exception e) {
//			throw new Exception("这里是新产生的异常2",e);  
			Exception e1=new Exception("这里是新产生的异常2");
			e1.initCause(e);
			throw e1;
		}
	}

}
