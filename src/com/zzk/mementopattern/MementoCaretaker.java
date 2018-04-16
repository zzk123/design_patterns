package com.zzk.mementopattern;
//象棋棋子备忘录管理类：负责人
public class MementoCaretaker {
	private ChessmanMemento memento;

	public ChessmanMemento getMemento() {
		return memento;
	}

	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}
	
}
