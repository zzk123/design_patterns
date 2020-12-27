package com.zzk.behavior.command.commandpattern2;
//命令队列，存储多个请求命令
import java.util.ArrayList;
import com.zzk.behavior.command.commandpattern.Command;
public class CommandQueue {
	//定义一个ArrayList来存储命令队列
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}
	//循环调用每一个命令对象的execute（）方法
	public void execute() {
		for(Object command : commands) {
			((Command)command).execute();
		}
	}
}
