package com.zzk.observerpattern3;

public class LoginValidatorB implements LoginEventListener {

	public LoginValidatorB() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void validateLogion(LoginEvent event) {
		if(event.getUserName()==null || event.getPassword()==null) {
			System.out.println("AA没有输入");
		}else {
			System.out.println("AA有输入："+ event.getUserName() + event.getPassword());
		}
	}

}
