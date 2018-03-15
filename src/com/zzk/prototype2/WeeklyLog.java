package com.zzk.prototype2;

public class WeeklyLog implements Cloneable {
	private Attachment attachment;
	private String name;
	private String content;
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//使用clone（）方法实现浅克隆
	public WeeklyLog clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (WeeklyLog) obj;
		}catch (Exception e) {
			System.out.println("不支持复制");
			return null;
		}
	}
}
