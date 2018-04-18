package com.zzk.statepattern2;
//打开状态
public class OnState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("已经打开了！");
	}

	@Override
	public void off(Switch s) {
		System.out.println("已经关闭了！");
		s.setState(Switch.getState("off"));
	}

}
