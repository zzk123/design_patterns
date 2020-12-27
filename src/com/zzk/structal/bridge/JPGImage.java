package com.zzk.structal.bridge;

public class JPGImage extends Image {

	@Override
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+",格式为JPG");
	}

}
