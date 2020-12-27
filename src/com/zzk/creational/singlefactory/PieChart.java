package com.zzk.creational.singlefactory;
/**
 * 饼状图：具体产品类
 * @author Administrator
 *
 */
public class PieChart implements Chart {

	public PieChart() {
		System.out.println("创建饼状图");
	}
	@Override
	public void display() {
		System.out.println("显示饼状图!");
	}

}
