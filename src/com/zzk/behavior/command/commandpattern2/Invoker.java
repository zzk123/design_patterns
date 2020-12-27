package com.zzk.behavior.command.commandpattern2;
//请求发送者
public class Invoker {
	private CommandQueue commandQueue; // 维持一个CommandQueue对象的引用
	
	public Invoker(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	public void setCommandQueue(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	//调用CommandQueue类的execute（）方法
	public void call() {
		commandQueue.execute();
	}

}
