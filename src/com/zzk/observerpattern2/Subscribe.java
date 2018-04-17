package com.zzk.observerpattern2;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者
 * @author Administrator
 *
 */
public class Subscribe implements Observer {

	public Subscribe(Observable o) {
		o.addObserver(this); 	//将观察者放入待通知观察者中
	}
	
	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("收到通知:" + ((Publish)o).getData());
	}

}
