package com.zzk.behavior.interpreter.interpreterpattern2;
//循环命令节点类：非终结符表达式
public class LoopCommandNode extends Node {

	private int number;				//循环次数
	private Node commandNode;		//循环语句中的表达式
	

	//解释循环命令
	public void interpret(Context context) {
		context.skipToken("LOOP");
		number = context.currentNumber();
		context.nextToken();
		commandNode = new ExpressionNode();	//循环语句中的表达式
		commandNode.interpret(context);
	}

	@Override
	public void execute() {
		for(int i = 0; i < number; i++) {
			commandNode.execute();
		}
	}

}
