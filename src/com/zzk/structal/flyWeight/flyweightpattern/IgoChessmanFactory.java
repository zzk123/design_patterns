package com.zzk.structal.flyWeight.flyweightpattern;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
//围棋棋子工厂类：享元工厂类，使用单例模式进行设计
public class IgoChessmanFactory {
	
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable ht;	//使用HashTable来存储享元对象，充当享元池
	
	private IgoChessmanFactory() {
		ht = new Hashtable();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		ht.put("b", black);
		white = new WhiteIgoChessman();
		ht.put("w", white);
	}
	
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	
	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman)ht.get(color);
	}
}
