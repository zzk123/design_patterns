package com.zzk.observerpattern3;

public class LoginEvent {
	//LoginEvent表示事件类，用于封装与事件有关的信息
	//它不是观察者的一部分，但他可以在目标对象和观察者对象之间传递数据
	private String userName;
	private String password;
	
	public LoginEvent(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
