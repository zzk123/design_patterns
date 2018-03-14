package com.zzk.factorymethod;
//文件记录器工厂类：具体对象
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		//创建文件日志记录器对象
		Logger logger = new FileLogger();
		//创建文件
		return logger;
	}

}
