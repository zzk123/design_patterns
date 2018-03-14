package com.zzk.singlefactory;
/**
 * 折线图：具体产品类
 * @author Administrator
 *
 */
public class LineChart implements Chart{

	public LineChart() {
		System.out.println("创建折线图");
	}
	
	@Override
	public void display() {
		System.out.println("显示折线图");
	}

}
