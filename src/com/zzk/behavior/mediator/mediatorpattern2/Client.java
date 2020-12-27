package com.zzk.behavior.mediator.mediatorpattern2;

import com.zzk.behavior.mediator.mediatorpattern.Button;
import com.zzk.behavior.mediator.mediatorpattern.ComboBox;
import com.zzk.behavior.mediator.mediatorpattern.List;
import com.zzk.behavior.mediator.mediatorpattern.TextBox;

public class Client {
	public static void main(String[] args) {
		//用新增具体中介者定义中介者对象
		SubConcreteMediator mediator;
		mediator = new SubConcreteMediator();
		
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();
		Label label = new Label();
		
		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		label.setMediator(mediator);
		
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		mediator.label = label;
		
		addBT.changed();
		System.out.println("-----------------");
		list.changed();
	}

}
