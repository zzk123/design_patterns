package com.zzk.visitorpattern;

public class ParttimeEmployee implements Employee {

	private String name;//员工名称
	private	double hourWage;//员工周薪
	private int workTime;//工作时间
	
	public ParttimeEmployee(String name, double hourWage, int workTime) {
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}





	public double getHourWage() {
		return hourWage;
	}

	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}

	public int getWorkTime() {
		return workTime;
	}



	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}



	@Override
	public void accept(Department handler) {
		handler.visit(this);	//调用访问者的访问方法
	}

}
