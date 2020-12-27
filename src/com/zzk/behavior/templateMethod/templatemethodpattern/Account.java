package com.zzk.behavior.templateMethod.templatemethodpattern;
//账号类：抽象方法
public abstract class Account {
	//基本方法-具体方法
	public boolean validate(String account, String password) {
		System.out.println("账号：" + account);
		System.out.println("密码：" + password);
		if(account.equalsIgnoreCase("张无忌") && password.equalsIgnoreCase("123456")) {
			return true;
		}else {
			return false;
		}
	}
	//基本方法-抽象方法
	public abstract void calculateInterest();
	
	//基本方法-具体方法
	public void display() {
		System.out.println("显示利息");
	}
	
	//模板方法
	public void handle(String account, String password) {
		if(!validate(account, password)) {
			System.out.println("账号或密码错误！");
			return;
		}
		calculateInterest();
		display();
	}
}
