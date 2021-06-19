package com.object.exercise1;

public class UserManager {
	// 用户信息验证的方法
	// 将对象作为参数传递到方法中
	public String checkUser(User one, User two) {
		// 判断用户名和密码是否为空，是否一致
		String str = null;
		if ((one.getUserName().replaceAll(" ", "").equals("")) || (one.getPassWord().replaceAll(" ", "").equals(""))
				|| (two.getUserName().replaceAll(" ", "").equals(""))
				|| (two.getPassWord().replaceAll(" ", "").equals(""))) {
			str = "用户名或密码为空";
		} else if (one.getUserName().equals(two.getUserName()) & one.getPassWord().equals(two.getPassWord())) {
			str = "用户名和密码一致";
		} else {
			str = "用户名和密码不一致";
		}
		return str;
	}

	public static void showMessage(User user) {
		System.out.println("用户名：" + user.getUserName());
		System.out.println("密码：" + user.getPassWord());
	}
}
