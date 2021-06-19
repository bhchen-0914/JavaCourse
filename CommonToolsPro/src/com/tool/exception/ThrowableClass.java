package com.tool.exception;
/*
 * Throwable有2个子类，Error和Exception
 * Error是程序无法处理的错误，表示运行应用程序中较为严重的问题，在应用程序的控制和处理能力之外
 * Exception是程序本身可以处理的异常，异常处理通常指的是针对此类以及其子类产出的异常
 * */
public class ThrowableClass {
	/*
	 *Exception分为RuntimeException（运行时异常）和Checked Exception(检查异常)
	 *RuntimeException 编译器不要求处理，如(空指针异常。数组下标越界异常，算数异常，数据转换异常等)
	 *Checked Exception 是编译器要求必须处置的异常，如(IO异常，数据操作异常)
	 * */
	
	/*
	 * Java应用程序中，异常处理机制为：抛出异常、捕捉异常
	 * 抛出异常通常需要包含：异常类型、异常出现时的程序状态等等信息
	 * 对于运行时异常、错误或可查异常，java技术所要求的异常处理方式有所不同
	 * 异常处理通过5个关键字实现：try、catch、finally、throw、throws
	 * */
}
