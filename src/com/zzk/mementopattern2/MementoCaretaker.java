package com.zzk.mementopattern2;

import java.util.ArrayList;

import com.zzk.mementopattern.ChessmanMemento;

public class MementoCaretaker {
	//定义一个集合来存储多个备忘录
	private ArrayList<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>();

	public ChessmanMemento getMementolist(int i) {
		return mementolist.get(i);
	}

	public void setMementolist(ChessmanMemento memento) {
		this.mementolist.add(memento);
	}
	
	
}
