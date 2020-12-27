package com.zzk.creational.factorymethod.factorymethod;

public class Client {
	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
		//可引入配置文件实现
		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}
	public static void main2(String[] args) {
		LoggerFactory factory;
		Logger logger;
		//可引入配置文件实现
		factory = (LoggerFactory)XMLUtil.getBean();	//getBean（）返回类型为object
													//需要进行强制类型转换
		logger = factory.createLogger();
		logger.writeLog();
	}
}
