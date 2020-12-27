package com.zzk.creational.factorymethod.factorymethod;
//数据库日志记录器：具体产品
public class DatabaseLogger implements Logger{

	public void writeLog() {
		System.out.println("数据库日志记录");
	}
}
