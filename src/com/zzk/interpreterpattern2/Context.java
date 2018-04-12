package com.zzk.interpreterpattern2;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;	//StringTokenizer类，用于将字符串分解为更小的字符
										//串标记（Token）默认情况下以空格作为分隔符
	private String currentToken; 		//当前字符串标记
	
	public Context(String text) {
		tokenizer = new StringTokenizer(text);	//通过传入的指令字符串创建StringTokenizer对象
		nextToken();
	}
	
	//返回下一个标记
	public String nextToken() {
		if(tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		}
		else {
			currentToken = null;
		}
		return currentToken;
	}
	
	//返回当前的标记
	public String currentToken(){
		return currentToken;
	}
	//跳过一个标记
	public void skipToken(String token) {
		if(!token.equals(currentToken)) {
			System.out.println("错误提示：" + currentToken + "解释错误！");
		}
		nextToken();
	}
	
	//如果当前的标记是一个数字，则返回对应的数值
	public int currentNumber() {
		int number = 0;
		try {
			number = Integer.parseInt(currentToken);//将字符串转换为整数
		}
		catch (Exception e) {
			System.out.println("错误提示：" + e);
		}
		return number;
	}
}
