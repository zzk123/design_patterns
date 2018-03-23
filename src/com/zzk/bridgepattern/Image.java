package com.zzk.bridgepattern;
//抽象图像类：抽象类
abstract class Image {
	
	protected ImageImp imp;

	public void setImp(ImageImp imp) {
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
