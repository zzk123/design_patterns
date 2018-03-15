package com.zzk.prototype2;
//附件类
public class Attachment {
	
	private String name;//附件名

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void download() {
		System.out.println("下载附件，文件名为" + name);
	}
	
}
