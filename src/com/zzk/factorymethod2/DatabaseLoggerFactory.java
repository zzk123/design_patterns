package com.zzk.factorymethod2;

import com.zzk.factorymethod.DatabaseLogger;
import com.zzk.factorymethod.Logger;

public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 使用默认方式连接数据库
		Logger logger = new DatabaseLogger();
		//初始化数据库日志记录器
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用参数args作为连接字符串来连接数据库
		Logger logger = new DatabaseLogger();
		//初始化数据库日志记录器
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封装在参数obj中的连接字符串来连接数据库
		Logger logger = new DatabaseLogger();
		//初始化数据库日志记录器
		return logger;
	}

}
