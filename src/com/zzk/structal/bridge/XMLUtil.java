package com.zzk.structal.bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class XMLUtil {
	//该方法用于从xml配置文件中提取具体类类，并返回一个实例对象
	public static Object getBean(String args) {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));
			NodeList nl = null;
			Node classNode = null;
			nl = doc.getElementsByTagName("className");
			String cName = null;
			
			if(args.equals("image")) {
				//获取第一个包含类名的节点，即扩充抽象类
				classNode = nl.item(0).getFirstChild();
			}else if(args.equals("os")) {
				//获取第二个包含类的节点，即具体实现类
				classNode = nl.item(1).getFirstChild();
			}
			
			cName = classNode.getNodeValue();
			//通过类名生成实例对象并将其返回
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
}
