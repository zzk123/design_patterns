package com.zzk.structal.proxy.proxypattern2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.org.mozilla.javascript.internal.GeneratedClassLoader;

public class Client {
	public static void main(String[] args) {
		InvocationHandler handler = null;
		
		AbstractUserDAO userDAO = new UserDAO();
		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = null;
		//动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
		proxy = (AbstractUserDAO) Proxy.newProxyInstance(
					AbstractUserDAO.class.getClassLoader(), 
					new Class[]{AbstractUserDAO.class},
					handler);
		
		//调用代理对象的业务方法
		proxy.findUserById("张无忌"); 	
		
		System.out.println("----------------------");
		
		AbstractDocumentDAO docDAO = new DocumentDAO();
		handler = new DAOLogHandler(docDAO);
		AbstractDocumentDAO proxy_new = null;
		//动态创建代理对象，用于代理一个AbstractDocumentDAO类型的真实主题对象
		proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(
				AbstractDocumentDAO.class.getClassLoader(),
				new Class[] {AbstractDocumentDAO.class},
				handler);
		//调用代理对象的业务方法
		proxy_new.deleteDocumentById("D002");
	}
}
