package com.object.exercise1;

public class UserManager {
	// �û���Ϣ��֤�ķ���
	// ��������Ϊ�������ݵ�������
	public String checkUser(User one, User two) {
		// �ж��û����������Ƿ�Ϊ�գ��Ƿ�һ��
		String str = null;
		if ((one.getUserName().replaceAll(" ", "").equals("")) || (one.getPassWord().replaceAll(" ", "").equals(""))
				|| (two.getUserName().replaceAll(" ", "").equals(""))
				|| (two.getPassWord().replaceAll(" ", "").equals(""))) {
			str = "�û���������Ϊ��";
		} else if (one.getUserName().equals(two.getUserName()) & one.getPassWord().equals(two.getPassWord())) {
			str = "�û���������һ��";
		} else {
			str = "�û��������벻һ��";
		}
		return str;
	}

	public static void showMessage(User user) {
		System.out.println("�û�����" + user.getUserName());
		System.out.println("���룺" + user.getPassWord());
	}
}
