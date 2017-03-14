package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Stage extends JPanel{

	public Stage(){
		super();
		
		setBackground(new Color(50, 50, 50));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
		
		
	}
}