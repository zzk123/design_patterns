package com.zzk.facadepattern2;
//基于移位运算的数据加密类：子系统类
public class NewCipherMachine {
	public String encrypt(String plainText) {
		System.out.println("数据加密，将明文转换为密文：");
		String es = "";
		int key = 10; //设置秘钥，位移数为10
		for(int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			//小写字母移位
			if(c >= 'a' && c <= 'z') {
				c += key % 26;
				if(c > 'z')
					c -= 26;
				if(c < 'a')
					c += 26;
			}
			//大写字母移位
			if(c >= 'A' && c <= 'Z') {
				c += key % 26;
				if(c > 'Z') 
					c -= 26;
				if(c < 'A')
					c += 26;
			}
			es += c;
		}
		System.out.println(es);
		return es;
	}
}
