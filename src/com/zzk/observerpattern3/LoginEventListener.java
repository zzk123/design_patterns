package com.zzk.observerpattern3;
//抽象观察者
public interface LoginEventListener {
	//声明相应方法
	public void validateLogion(LoginEvent event);
}
