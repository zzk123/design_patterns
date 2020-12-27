package com.zzk.behavior.memento.mementopattern2;

import com.zzk.behavior.memento.mementopattern.Chessman;

public class Client {
	private static int index = -1;  //定义一个索引来记录当前状态所在位置
	private static MementoCaretaker mc = new MementoCaretaker();
	
	public static void main(String[] args) {
		Chessman chess = new Chessman("车", 1, 1);
		play(chess);
		chess.setY(4);
		play(chess);
		chess.setX(5);
		play(chess);
		undo(chess, index);
		undo(chess, index);
		redo(chess, index);
		redo(chess, index);
		
	}
	//下棋
	public static void play(Chessman chess) {
		mc.setMementolist(chess.save());	//保存备忘录
		index ++;
		System.out.println("棋子" + chess.getLabel() + "当前位置为:第" + chess.getX() + "行，第" + chess.getY() + "列");
	}
	//悔棋
	public static void undo(Chessman chess, int i) {
		System.out.println("*********悔棋************");
		index -- ;
		chess.restore(mc.getMementolist(i-1)); //撤销到上一个备忘录
		System.out.println("棋子" + chess.getLabel() + "当前位置为第" + chess.getX() +"行，第"+chess.getY() + "列");
	}
	
	//撤销悔棋
	public static void redo(Chessman chess, int i) {
		System.out.println("***********撤销悔棋**************");
		index ++;
		chess.restore(mc.getMementolist(i+1));
		System.out.println("棋子" + chess.getLabel() + "当前位置为：第" + chess.getX() + "行，第" + chess.getY() + "列");
	}
}
