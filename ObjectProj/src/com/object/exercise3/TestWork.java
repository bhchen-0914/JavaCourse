package com.object.exercise3;

public class TestWork extends Work{
	//���ԣ���д�Ĳ����������������ֵ�Bug����
    private int caseNumber;
    private int bugNumber;

    // ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
    public TestWork(){}
    public TestWork(String name, int caseNumber,int bugNumber ){
        this.setName(name);
        this.setCaseNumber(caseNumber);
        this.setBugNumber(bugNumber);
    }
	
    // ���е�get***/set***����������Է�װ
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

	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**������������������**bug������**�������������ṩ
	public String work() {
		String str = this.getName() + "���ձ���:�����д��" + this.getCaseNumber() + "������������������" + this.getBugNumber() + "��bug";
        return str;
	}
}
