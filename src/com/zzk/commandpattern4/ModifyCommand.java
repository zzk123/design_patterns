package com.zzk.commandpattern4;

//修改命令类：具体命令
public class ModifyCommand extends Command {

	public ModifyCommand(String name) {
		super(name);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		configOperator.modify(args);
	}

	@Override
	public void execute() {
		configOperator.modify(this.args);
	}
	
	
}
