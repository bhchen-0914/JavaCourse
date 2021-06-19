package com.object.exercise3;
/*
 * 编程练习：请使用面向对象的思想，设计自定义类完成如下功能要求：

接收用户输入的信息，选择需要完成的工作任务。其中，可供选择的有：测试工作和研发工作。关于类型设定描述如下：

测试工作

       属性：工作名称、编写的测试用例个数、发现的Bug数量

       方法：工作描述

研发工作

       属性：工作名称、有效编码行数、目前没有解决的Bug个数

       方法：工作描述
 * */
public class Work {
	 // 属性：工作名
    private String name;

	// 无参构造方法
	public Work(){
	    
	}

	// 带参构造方法，完成工作类型的赋值
	public Work(String name){
	    this.setName(name);
	}

   // 公有的get***/set***方法完成属性封装
   public void setName(String name){
       this.name = name;
   }
   
   public String getName(){
       return this.name;
   }

	// 方法：工作描述，描述内容为：开心工作
	public String work() {
		String str="开心工作";
		return str;
}
}
