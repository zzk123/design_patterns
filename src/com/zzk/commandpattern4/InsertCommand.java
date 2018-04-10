package com.zzk.commandpattern4;
//增加命令类：具体命令
public class InsertCommand extends Command {

	public InsertCommand(String name) {
		super(name);
	}
	
	@Override
	public void execute(String args) {
		this.args = args;
		configOperator.insert(args);
	}

	@Override
	public void execute() {
		configOperator.insert(this.args);
	}

}
