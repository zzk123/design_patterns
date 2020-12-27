package com.zzk.creational.singlefactory;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
/**
 * 读取配置文件中的字符串参数
 * @author Administrator
 *
 */
public class XMLUtil {
	
	public static String getChartType() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFatory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFatory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));
			
			//获取包含图标类型的文本节点
			NodeList nl = doc.getElementsByTagName("chartType");
			Node classNode = nl.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
