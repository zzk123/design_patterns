package com.zzk.interpreterpattern2;
//基本命令节点类：终结符表达式
public class PrimitiveCommandNode extends Node {

	private String name;
	private String text;
	
	//解释基本命令
	public void interpret(Context context) {
		name = context.currentToken();
		context.skipToken(name);
		if(!name.equals("PRINT") && !name.equals("BREAK") && !name.equals("SPACE")) {
			System.out.println("非法命令");
		}
		if(name.equals("PRINT")) {
			text = context.currentToken();
			context.nextToken();
		}
	}

	@Override
	public void execute() {
		if(name.equals("PRINT")) {
			System.out.println(text);
		}else if(name.equals("SPACE")) {
			System.out.println(" ");
		}else if(name.equals("BREAK")) {
			System.out.println();
		}
	}

}
