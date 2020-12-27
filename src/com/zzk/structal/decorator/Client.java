package com.zzk.structal.decorator;

//客户端测试
public class Client {
	
	public static void main(String[] args) {
		Component component, componentSB;		//使用抽象构件定义
		component = new Window();				//定义具体构件
		componentSB = new ScrollBarDecorator(component);	//定义装饰后的构件
		componentSB.display();
	}
	
	public static void main2(String[] args) {
		Component component, componentSB, componentBB; 		//全部使用抽象构件定义
		component = new Window();
		componentSB = new ScrollBarDecorator(component);
		componentBB = new BlackBorderDecorator(componentSB);//将装饰了一次之后的对象继续注入到另外一个装饰类中，进行二次装饰
		
		componentBB.display();
	}
}
