package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class ScrnObj {

	private Font font;
	private Color col;
	private float posX;
	private float posY;
	
	// 
	private String[] tex = new String[3];
	
	public ScrnObj(Color colour, int size, String tex1, String tex2, String tex3) {
		col = colour;
		tex[0] = tex1;
		tex[1] = tex2;
		tex[2] = tex3;
		
		font = new Font("courier", Font.PLAIN, size);
		
	}
	
	public void draw(Graphics2D g){
		
	}

}
