package com.object.exercise3;

public class DevelopmentWork extends Work{
	 // 属性：有效编码行数、目前没有解决的Bug个数
    private int codeNumber;
    private int leftBugNumber;
	
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public DevelopmentWork(){}
	public DevelopmentWork(String name,int codeNumber,int leftBugNumber){
	    this.setName(name);
	    this.setCodeNumber(codeNumber);
	    this.setLeftBugNumber(leftBugNumber);
	}
	
    // 公有的get***/set***方法完成属性封装
    public void setCodeNumber(int codeNumber){
        this.codeNumber=codeNumber;
    }
    public int getCodeNumber(){
        return this.codeNumber;
    }
    public void setLeftBugNumber(int leftBugNumber){
        this.leftBugNumber=leftBugNumber;
    }
    public int getLeftBugNumber(){
        return this.leftBugNumber;
    }
	
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
		String str = this.getName() + "的日报是:今天编写了" + this.getCodeNumber() + "行代码，目前仍然有" + this.getLeftBugNumber()
				+ "个bug没有解决";
        return str;
	}
}
