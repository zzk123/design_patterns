package com.zzk.statepattern2;
//关闭状态
public class OffState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("打开");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		System.out.println("已经关闭！");
	}

}
