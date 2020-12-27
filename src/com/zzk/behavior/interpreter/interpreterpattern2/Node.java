package com.zzk.behavior.interpreter.interpreterpattern2;
//抽象结点类：抽象表达式
public abstract class Node {
	public abstract void interpret(Context text);	//声明一个方法解释语句
	public abstract void execute();			//声明一个方法用于执行标记对应的命令
}
