package com.zzk.mediatorpattern;
//列表框类：具体同事类
public class List extends Component {

	@Override
	public void update() {
		System.out.println("列表框增加一项：张无忌");
	}
	
	public void select() {
		System.out.println("列表框选中项：小龙女");
	}
}
