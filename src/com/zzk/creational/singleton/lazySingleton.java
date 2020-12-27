package com.zzk.creational.singleton;
/**
 * 懒汉模式单例
 * 在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术
 * 即需要的时候再加载实例，为了避免多个线程同时调用getInstance()方法，需要使用synchronized
 * @author Administrator
 *
 */
public class lazySingleton {
	private volatile static lazySingleton instance = null;
	
	private lazySingleton() {
		
	}
	
	public static lazySingleton getInstance(){
		//第一重判断
		if(instance==null) {
			//锁定代码块
			synchronized (lazySingleton.class) {
				//第二重判断
				if(instance == null) {
					instance = new lazySingleton();		//创建单例
				}
			}
		}
		return instance;
	}
}
