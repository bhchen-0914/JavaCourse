package com.object.exercise3;
/*
 * �����ϰ����ʹ����������˼�룬����Զ�����������¹���Ҫ��

�����û��������Ϣ��ѡ����Ҫ��ɵĹ����������У��ɹ�ѡ����У����Թ������з����������������趨�������£�

���Թ���

       ���ԣ��������ơ���д�Ĳ����������������ֵ�Bug����

       ��������������

�з�����

       ���ԣ��������ơ���Ч����������Ŀǰû�н����Bug����

       ��������������
 * */
public class Work {
	 // ���ԣ�������
    private String name;

	// �޲ι��췽��
	public Work(){
	    
	}

	// ���ι��췽������ɹ������͵ĸ�ֵ
	public Work(String name){
	    this.setName(name);
	}

   // ���е�get***/set***����������Է�װ
   public void setName(String name){
       this.name = name;
   }
   
   public String getName(){
       return this.name;
   }

	// ������������������������Ϊ�����Ĺ���
	public String work() {
		String str="���Ĺ���";
		return str;
}
}
