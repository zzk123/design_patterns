package com.zzk.behavior.visitorpattern;
//员工类：抽象元素
public interface Employee {
	public void accept(Department handler); // 接受一个抽象访问者访问
}
