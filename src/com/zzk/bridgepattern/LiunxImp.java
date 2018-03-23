package com.zzk.bridgepattern;
//Liunx操作系统实现类：具体实现类
class LiunxImp implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
		System.out.println("在liunx操作系统中显示图像");
	}

}
