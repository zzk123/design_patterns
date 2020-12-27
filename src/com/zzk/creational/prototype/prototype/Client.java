package com.zzk.creational.prototype.prototype;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous = new WeeklyLog();
		log_previous.setName("张无忌");
		log_previous.setDate("第12周");
		log_previous.setContent("这周工作很忙");
		
		WeeklyLog log_new;
		log_new = log_previous.clone();
	}
}
