package com.zzk.decoratorpattern;
//窗口类：具体构建类
public class Window extends Component {

	@Override
	public void display() {
		System.out.println("显示窗口!");
	}

}
