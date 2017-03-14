package game;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ConsolePanel extends JPanel {

	public ConsolePanel() {
		super();
		
		setBackground(new Color(0, 0, 0));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
	}

}
