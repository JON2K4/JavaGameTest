package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class ScrnObj {

	private Font font;
	private Color col;
	
	protected int posX;
	protected int posY;
	protected String CURRENT_TEX;
	
	protected TreeMap<String, String> textureList;
	
	public ScrnObj(Color colour, int size, String textureFile){
		col = colour;
		
		textureList = createTextureList(textureFile);
		
		posX = 250;
		posY = 250;
		
		font = new Font("courier", Font.PLAIN, size);
	}
	
	public void draw(Graphics2D g){
		g.setFont(font);
		g.setColor(col);
		drawString(g, CURRENT_TEX, posX, posY);
	}
	
	public void move(int incX, int incY){
		System.out.println("Object: " + this + " moved " + incX + "; "+ incY);
		posX += incX;
		posY += incY;
	}
	
	private void drawString(Graphics2D g, String tex, float posX, float posY){
		int pad = -8;
		
		for (String line: textureList.get(tex).split("newLine")){
			g.drawString(line, posX, posY += (g.getFontMetrics().getHeight() + pad));
		}
	}
	
	public void setTex(String tex) throws TextureException{
		if (textureList.containsKey(tex)){
			CURRENT_TEX = tex;
		}else{
			CURRENT_TEX = "TEX\nERROR";
			throw new TextureException("Texture: " + tex +" not found");
		}
	}
	
	private static TreeMap<String, String> createTextureList(String filePath){
		Scanner texFile;
		try {
			texFile = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return new TreeMap<String, String>();
		}
		TreeMap<String, String> texMap = new TreeMap<String, String>();
		while (texFile.hasNextLine()){
			String[] line = texFile.nextLine().split(":");
			texMap.put(line[0], line[1]);
		}
		texFile.close();
		
		System.out.printf(filePath + "\n" + "########################################\n");
		for (String key: texMap.keySet()){
			System.out.println(key + " : " + texMap.get(key));
		}
		System.out.printf("########################################\n");
		
		return texMap;
	}
}
