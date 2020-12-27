package com.zzk.behavior.interpreter.interpreterpattern;

import java.util.Stack;

public class InstructionHandler {
	private AbstractNode node;
	
	public void handle(String instruction) {
		AbstractNode left = null, right = null;
		AbstractNode direction = null, action = null, distance = null;
		Stack stack = new Stack();					//声明一个栈对象用于存储抽象语法树
		String[] words = instruction.split(" ");	//以空格分隔指令字符串
		for(int i = 0; i< words.length; i++) {
			//采用栈的方式来处理指令
			//如果遇见‘and’，则将其后的3个单词作为3个终结符表达式连成一个简单句子SentenceNode作为
			//‘and’的右表达式，而将从栈顶弹出的表达式作为‘and’的左表达式，最后将新的‘and’表达式压入栈中
			if(words[i].equalsIgnoreCase("and")) {
				left = (AbstractNode) stack.pop();		//弹出栈顶表示式作为左表达式
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				right = new SentenceNode(direction, action, distance);	//右表达式
				stack.push(new AndNode(left, right));	//将新表达式压入栈中
			}
			//如果是从头开始进行解释，则将前3个单词组成一个简单句子SentenceNode并将该句子压入栈中
			else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);
				stack.push(left);	//将新表达式压入栈中
			}
			this.node = (AbstractNode) stack.pop();	//将全部表达式从栈中弹出
		}
	}
	
	public String output() {
		String result = node.interpret();			//解释表达式
		return result;
	}
}
