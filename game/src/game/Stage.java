package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import javafx.scene.input.KeyCode;

public class Stage extends JPanel
	implements KeyListener{
	
	ArrayList<ScrnObj> objectsList;
	Player player;

	public Stage(){
		super();
		
		objectsList = new ArrayList<ScrnObj>();
		
		setSize(500, 500);
		setBackground(new Color(50, 50, 50));
		
		player = new Player();
		objectsList.add(player);
		
		repaint();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
		for (ScrnObj obj: objectsList){
			obj.draw(g1);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			player.move(-15, 0);
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}