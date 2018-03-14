package com.zzk.factorymethod2;

import com.zzk.factorymethod.Logger;
/**
 * 重载工厂方法
 * 通过多种方式来初始化日志记录器
 * @author Administrator
 *
 */
public interface LoggerFactory {
	public Logger createLogger();
	public Logger createLogger(String args);
	public Logger createLogger(Object obj);
}
