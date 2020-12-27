package com.zzk.behavior.interpreter.interpreterpattern;

public class Client {
	public static void main(String[] args) {
		String instruction = "up move5 and down run 10 and left move 5";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString;
		outString = handler.output();
		System.out.println(outString);
	}
}
