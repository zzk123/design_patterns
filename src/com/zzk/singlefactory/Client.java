package com.zzk.singlefactory;
/**
 * 客户端
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Chart chart;
		chart = ChartFactory.getChart("histogram");
		chart.display();
	}
	
	public static void main2(String[] args) {
		Chart chart;
		//读取配置文件中的参数
		String type = XMLUtil.getChartType();
		//创建产品对象
		chart = ChartFactory.getChart(type);
		chart.display();
	}
}
