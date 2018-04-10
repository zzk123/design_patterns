package com.zzk.commandpattern;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
/**
 * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
 * @author Administrator
 *
 */
public class XMLUtil {
	
	public static Object getBean(int i) {
		try {
			//创建文档对象
			DocumentBuilderFactory dFatory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFatory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));
			
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			if(0 == i) {
				classNode = nl.item(0).getFirstChild();
			}else {
				classNode = nl.item(1).getFirstChild();
			}
			
			String cName = classNode.getNodeValue();
			
			//通过类名生产实例对象并将其返回
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
