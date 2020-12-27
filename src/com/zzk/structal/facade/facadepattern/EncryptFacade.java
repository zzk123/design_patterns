package com.zzk.structal.facade.facadepattern;
//加密外观类：外观类
public class EncryptFacade {
	private FileReader reader;
	private CipherMachine cipher;
	private FileWriter writer;
	
	public EncryptFacade() {
		reader = new FileReader();
		cipher = new CipherMachine();
		writer = new FileWriter();
	}
	
	//调用其他对象的业务方法
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}
}
