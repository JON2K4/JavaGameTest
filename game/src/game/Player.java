package game;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class Player extends ScrnObj {

	static String STATE_ALIVE = "ALIVE";
	static String STATE_DEAD = "DEAD";
	
	static String STATUS_IDLE = "IDLE";
	static String STATUS_FALLING = "FALLING";
	
	static String STATUS;
	static String STATE;
	
	public Player() throws TextureException {
		super(Color.GRAY, 15, "playerTextures.txt");
		STATE = STATE_ALIVE;
		
		setTex("idleTex");
	}
	
	public void setStatus(String status){
		STATUS = status;
	}
	
	public void setState(String state){
		STATE = state;
	}
	
	public void resetPlayer() throws TextureException{
		STATUS = STATUS_IDLE;
		if (getLiving()){
			setTex("idleTex");
		}
	}
	
	public int[] getPosition(){
		int[] pos = {posX, posY};
		return pos;
	}
	
	public String getStatus(){
		return STATUS;
	}
	
	public boolean getLiving(){
		return (STATE == STATE_ALIVE);
	}
	
	public void killSelf() throws TextureException{
		setState(STATE_DEAD);
		setTex("deadTex");
		System.out.println("Player is now dead.");
	}
	
	@Override
	public void move(int incX, int incY){
		if (getLiving()){
			System.out.println("Player: " + this + " moved " + incX + "; "+ incY);
			posX += incX;
			posY += incY;
		}
	}
	
	public void jump() throws TextureException{
		int jumpHeight = 50;
		if (getLiving()){
			System.out.println("Player: " + this + " jumped " + jumpHeight);
			posY -= jumpHeight;
			setTex("jumpTex");
			STATUS = STATUS_FALLING;
		}
	}
	
}
