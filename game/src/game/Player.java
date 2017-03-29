package game;

import java.awt.Color;

public class Player extends ScrnObj {

	public Player() {
		super(Color.GRAY, 15, "*@*\n |\n ^", "X", "X");
		
	}
	
	public void setPlayerStatus(int mode){
		super.CURRENT_TEX = mode;
		
	}
}
