package com.zzk.structal.facade.facadepattern2;

public class Client {
	public static void main(String[] args) {
		AbstractEncryptFacade ef;
		ef = (AbstractEncryptFacade) XMLUtil.getBean();
		ef.fileEncrypt("源文件路径", "目标文件路径");
	}
}
