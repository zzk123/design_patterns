package com.zzk.behavior.observer.observerpattern3;

import java.awt.event.ActionEvent;
//充当具体目标类
public class LoginBean {
	private LoginEventListener lel;
	private LoginEvent le;
	
	public LoginBean() {
		this.le = new LoginEvent("userName", "passwprd");
	}
	//实现注册方法
	public void addLoginEventListener(LoginEventListener lel) {
		this.lel = lel;
	}
	//实现通知方法
	public void fireLoginEvent(Object object, String userName, String password) {
		le.setUserName(userName);
		le.setPassword(password);
		lel.validateLogion(le);
	}
	
	public void actionPerformed(ActionEvent event) {
		
	}
}
