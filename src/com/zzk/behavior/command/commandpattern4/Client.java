package com.zzk.behavior.command.commandpattern4;

public class Client {
	public static void main(String[] args) {
		ConfigSettingWindow csw = new ConfigSettingWindow();//定义请求发送者
		Command command;	//定义命令对象
		ConfigOperator co = new ConfigOperator();	//定义请求接收者
		
		//4次对配置文件的更改
		command = new InsertCommand("增加");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("网站首页");
		
		command = new ModifyCommand("修改");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("网站首页");
		
		System.out.println("保存配置");
		csw.save();
		
		System.out.println("恢复配置");
		csw.recover();
	}
}
