package com.zzk.bridgepattern;

public class Client {
	public static void main(String[] args) {
		Image image;
		ImageImp imp;
		image = (Image) XMLUtil.getBean("image");
		imp = (ImageImp) XMLUtil.getBean("os");
		image.setImp(imp);
		image.parseFile("小龙女");
	}
}
