package com.zzk.behavior.observer.observerpattern;

import java.util.ArrayList;

abstract class AllyControlCenter {
	protected String allyName;				//战队名称
	protected ArrayList<Observer> plays = new ArrayList<Observer>();//定义一个集合， 存储战队成员
	
	public String getAllyName() {
		return allyName;
	}
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	//注册方法
	public void join(Observer obs) {
		System.out.println(obs.getName() + "加入" + this.allyName + "战队");
		plays.add(obs);
	}
	
	//注销方法
	public void quit(Observer obs) {
		System.out.println(obs.getName() + "退出" + this.allyName + "战队");
		plays.remove(obs);
	}
	
	//声明抽象通知方法
	public abstract void notifyObserver(String name);
}
