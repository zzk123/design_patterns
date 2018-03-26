package com.zzk.facadepattern;

public class Client {
	public static void main(String args[]) {
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("源文件路径", "目标文件路径");
	}
}
