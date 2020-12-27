package com.zzk.creational.singlefactory;
/**
 * 图表工厂类:工厂类
 * @author Administrator
 *
 */
public class ChartFactory {
	//静态工厂方法
	public static Chart getChart(String type) {
		Chart chart = null;
		if(type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
			System.out.println("初始化设置柱状图");
		}else if(type.equalsIgnoreCase("pie")) {
			chart = new HistogramChart();
			System.out.println("初始化设置饼状图");
		}else if(type.equalsIgnoreCase("line")) {
			chart = new HistogramChart();
			System.out.println("初始化设置折线图");
		}
		return chart;
	}
}
