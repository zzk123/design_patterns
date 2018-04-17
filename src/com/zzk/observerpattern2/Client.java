package com.zzk.observerpattern2;

public class Client {
	public static void main(String[] args) {
		Publish publish = new Publish();
		Subscribe subscribe = new Subscribe(publish);
		
		publish.setData("开始");
	}
}
