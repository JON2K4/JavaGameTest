package game;

import java.awt.Color;

public class Player extends ScrnObj {

	String STATUS_ALIVE = "ALIVE";
	String STATUS_DEAD = "DEAD";
	String STATUS_FALLING = "FALLING";
	String STATUS;
	
	public Player() {
		super(Color.GRAY, 15, " @ \n #\n M", "*@*\n u\n M", "(✖╭╮✖)\n RIP...");
		STATUS = STATUS_ALIVE;

	}
	
	public void setStatus(String Status){
		STATUS = Status;
	}
	
	public void resetPlayer(){
		STATUS = STATUS_ALIVE;
		setTex(0);
	}
	
	public void setTex(int mode){
		super.CURRENT_TEX = mode;
	}
	
	public int[] getPosition(){
		int[] pos = {posX, posY};
		return pos;
	}
	
	public String getStatus(){
		return STATUS;
	}
	
	public void killSelf(){
		setTex(2);
		setStatus(STATUS_DEAD);
		System.out.println("Player is now dead.");
	}
	
	public void jump(){
		move(0, -50);
		setTex(1);
		STATUS = STATUS_FALLING;
	}
	
}
