package com.zzk.facadepattern2;

import com.zzk.facadepattern.FileReader;
import com.zzk.facadepattern.FileWriter;
//新加密外观类：具体外观类
public class NewEncryptFacade extends AbstractEncryptFacade {

	private FileReader reader;
	private NewCipherMachine cipher;
	private FileWriter writer;
	
	public NewEncryptFacade() {
		reader = new FileReader();
		cipher = new NewCipherMachine();
		writer = new FileWriter();
	}
	
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}

}
