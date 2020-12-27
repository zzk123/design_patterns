package com.zzk.behavior.visitorpattern;
//财务部：具体访问
public class FADepartment extends Department {

	//实现财务部对全职员工的访问
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklyWage();
		if(workTime > 40) {
			weekWage = weekWage + (workTime - 40) * 100;
		}
		else if(workTime < 40) {
			weekWage = weekWage - (40 - workTime) * 80;
			if(weekWage < 0) {
				weekWage = 0;
			}
		}
		System.out.println("正式员工：" + employee.getName() + "实际实际工资为：" + weekWage + "元");
	}

	//实现财务部对兼职员工的访问
	public void visit(ParttimeEmployee employee) {
		int weeTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("临时工" + employee.getName() + "实际工资为 " + weeTime * hourWage + "元");
	}

}
