package com.zzk.observerpattern3;
//具体观察者
public class LoginValidatorA implements LoginEventListener {

	public LoginValidatorA() {

	}
	
	//实现相应方法
	public void validateLogion(LoginEvent event) {
		if(event.getUserName()==null || event.getPassword()==null) {
			System.out.println("AA没有输入");
		}else {
			System.out.println("AA有输入："+ event.getUserName() + event.getPassword());
		}
	}

}
