package com.zzk.behavior.mediator.mediatorpattern2;

import com.zzk.behavior.mediator.mediatorpattern.Component;
import com.zzk.behavior.mediator.mediatorpattern.ConcreteMediator;

public class SubConcreteMediator extends ConcreteMediator {
	
	//增加对Label对象的引用
	public Label label;
	
	@Override
	public void componentChanged(Component c) {
		//单击按钮
		if(c == addButton) {
			System.out.println("---单击增加按钮---");
			list.update();
			cb.update();
			userNameTextBox.update();
			label.update();		//文本
		}
		//从列表框选择客户
		else if(c == list) {
			System.out.println("---从列表框选择客户---");
			cb.select();
			userNameTextBox.setText();
		}
	}
}
