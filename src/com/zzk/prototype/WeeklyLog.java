package com.zzk.prototype;
//WeeklyLog：具体原型类
//实现标识接口Cloneable，表示java类支持复制
public class WeeklyLog implements Cloneable {
	private String name;
	private String date;
	private String content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	//克隆方法clone(),此处使用java语言提供的克隆机制
	public WeeklyLog clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (WeeklyLog) obj;
		}catch (Exception e) {
			System.out.println("不支持复制！");
			return null;
		}
	}

}
