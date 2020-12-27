package com.zzk.creational.factorymethod.factorymethod3;

import com.zzk.creational.factorymethod.factorymethod.Logger;
/**
 * 为了进一步简化客户端的使用，还可以对客户端隐藏工厂方法
 * 在工厂类中直接调用产品类的业务方法，客户端无需调用工厂方法创建产品，
 * 直接通过工厂即可以使用所创建的对象中的业务方法
 * @author Administrator
 *
 */
abstract class LoggerFactory {
	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}

	public abstract Logger createLogger();
}
