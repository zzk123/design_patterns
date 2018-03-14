package com.zzk.singleton;
/**
 * 饿汉模式
 * 当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用
 * 单例类的唯一实例将被创建，不会出现创建多个单例对象的情况，可确保单例对象的唯一性
 * @author Administrator
 *
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
