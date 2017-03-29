package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ScrnObj {

	private Font font;
	private Color col;
	
	protected int posX;
	protected int posY;
	protected int CURRENT_TEX;
	
	protected String[] tex = new String[3];
	
	public ScrnObj(Color colour, int size, String tex1, String tex2, String tex3) {
		col = colour;
		tex[0] = tex1;
		tex[1] = tex2;
		tex[2] = tex3;
		
		posX = 250;
		posY = 250;
		
		font = new Font("courier", Font.PLAIN, size);
		CURRENT_TEX = 0;
	}
	
	public void draw(Graphics2D g){
		g.setFont(font);
		g.setColor(col);
		drawString(g, tex[CURRENT_TEX], posX, posY);
	}
	
	public void move(int incX, int incY){
		System.out.println("Object: " + this + " moved " + incX + "; "+ incY);
		posX += incX;
		posY += incY;
	}
	
	private void drawString(Graphics2D g, String tex, float posX, float posY){
		int pad = -4;
		
		for (String line: tex.split("\n")){
			g.drawString(line, posX, posY += (g.getFontMetrics().getHeight() + pad));
		}
	}
}
