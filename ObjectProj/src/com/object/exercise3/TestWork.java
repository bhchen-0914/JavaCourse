package com.object.exercise3;

public class TestWork extends Work{
	//属性：编写的测试用例个数、发现的Bug数量
    private int caseNumber;
    private int bugNumber;

    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public TestWork(){}
    public TestWork(String name, int caseNumber,int bugNumber ){
        this.setName(name);
        this.setCaseNumber(caseNumber);
        this.setBugNumber(bugNumber);
    }
	
    // 公有的get***/set***方法完成属性封装
    public void setCaseNumber(int caseNumber){
        this.caseNumber=caseNumber;
    }
    public int getCaseNumber(){
        return this.caseNumber;
    }
    public void setBugNumber(int bugNumber){
        this.bugNumber=bugNumber;
    }
    public int getBugNumber(){
        return this.bugNumber;
    }

	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String work() {
		String str = this.getName() + "的日报是:今天编写了" + this.getCaseNumber() + "个测试用例，发现了" + this.getBugNumber() + "个bug";
        return str;
	}
}
