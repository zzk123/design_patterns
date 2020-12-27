package com.zzk.structal.proxy.proxypattern;

public class Client {

	public static void main(String[] args) {
		//针对抽象编程，客户端无需分辨真实主题类和代理类
		Searcher searcher;
		searcher = (Searcher)XMLUtil.getBean();
		String result = searcher.doSearch("杨过", "小龙女");
	}
}
