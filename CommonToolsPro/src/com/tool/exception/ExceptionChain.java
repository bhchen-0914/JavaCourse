package com.tool.exception;
/**
 * �쳣��
 * @author bhchen3
 *
 */

/*
 * ��ʱ�����ǻᲶ��һ���쳣�����׳���һ���쳣
 * ���쳣������ԭ��һ����һ�������������ѵײ���쳣��Ϣ�����ϲ㣬��������׳�
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
			throw new Exception("�������²������쳣1",e); //��������쳣����Ĳ������뵽���캯����
		}
	}
	
	public static void test3() throws Exception {
		try {
			test2();
		} catch (Exception e) {
//			throw new Exception("�������²������쳣2",e);  
			Exception e1=new Exception("�������²������쳣2");
			e1.initCause(e);
			throw e1;
		}
	}

}
