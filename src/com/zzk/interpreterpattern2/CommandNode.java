package com.zzk.interpreterpattern2;
//语句命令节点类：非终结符表达式
public class CommandNode extends Node {

	private Node node;
	
	@Override
	public void interpret(Context context) {
		//处理LOOP循环命令
		if(context.currentToken().equals("LOOP")) {
			node = new LoopCommandNode();
			node.interpret(context);
		}
		//处理其他基本命令
		else {
			node = new PrimitiveCommandNode();
			node.interpret(context);
		}
	}

	@Override
	public void execute() {
		node.execute();
	}

}
