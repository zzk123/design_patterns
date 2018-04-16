package com.zzk.mediatorpattern2;

import com.zzk.mediatorpattern.Button;
import com.zzk.mediatorpattern.ComboBox;
import com.zzk.mediatorpattern.List;
import com.zzk.mediatorpattern.TextBox;

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
