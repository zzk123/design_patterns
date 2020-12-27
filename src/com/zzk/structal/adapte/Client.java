package com.zzk.structal.adapte;

public class Client {
	public static void main(String[] args) {
		
		ScoreOperation operation;							//针对抽象目标接口编程
		operation = (ScoreOperation) XMLUtils.getBean();	//读取配置文件，反射生成对象
		int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};	//定义成绩数组
		int result[];
		int score;
		
		System.out.println("成绩排序结果：");
		result = operation.sort(scores);
		
		System.out.println("查找成绩90：");
		score = operation.search(scores, 90);
	}
}
