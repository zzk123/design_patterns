package com.zzk.templatemethodpattern2;

public class Client {
	public static void main(String[] args) {
		DataViewer dv;
		dv = new SubDataViewer();
		dv.process();
	}
}
