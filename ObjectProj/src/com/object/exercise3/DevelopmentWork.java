package com.object.exercise3;

public class DevelopmentWork extends Work{
	 // ���ԣ���Ч����������Ŀǰû�н����Bug����
    private int codeNumber;
    private int leftBugNumber;
	
	//��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public DevelopmentWork(){}
	public DevelopmentWork(String name,int codeNumber,int leftBugNumber){
	    this.setName(name);
	    this.setCodeNumber(codeNumber);
	    this.setLeftBugNumber(leftBugNumber);
	}
	
    // ���е�get***/set***����������Է�װ
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
	
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**�д��룬Ŀǰ��Ȼ��**��bugû�н��������**�������������ṩ
	public String work() {
		String str = this.getName() + "���ձ���:�����д��" + this.getCodeNumber() + "�д��룬Ŀǰ��Ȼ��" + this.getLeftBugNumber()
				+ "��bugû�н��";
        return str;
	}
}
