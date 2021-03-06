package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import javafx.scene.input.KeyCode;

public class Stage extends JPanel
	implements KeyListener, 
	ActionListener{
	
	int tick = 20;
	ArrayList<ScrnObj> objectsList;
	Player player;
	Timer timer;
	int GROUND_LEVEL;
	

	public Stage() throws TextureException{
		super();
		
		objectsList = new ArrayList<ScrnObj>();
		
		setSize(500, 500);
		setBackground(new Color(50, 50, 50));
		
		GROUND_LEVEL = 250;

		
		player = new Player();
		objectsList.add(player);
		
		timer = new Timer(tick, this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
		for (ScrnObj obj: objectsList){
			obj.draw(g1);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		
		if (event.getKeyCode() == KeyEvent.VK_LEFT){
			player.move(-15, 0);
			
		}else if (event.getKeyCode() == KeyEvent.VK_RIGHT){
			player.move(15, 0);
		}
		
		if (event.getKeyCode() == KeyEvent.VK_UP){
			if (player.getStatus() != player.STATUS_FALLING){
				try {
					player.jump();
				} catch (TextureException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
		}
		
		if (event.getKeyCode() == KeyEvent.VK_D) {
			try {
				player.killSelf();
			} catch (TextureException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
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

	@Override
	public void actionPerformed(ActionEvent event) {
		if (player.getPosition()[1] < GROUND_LEVEL){
			player.move(0, 5);
		}
		if (player.getPosition()[1] == GROUND_LEVEL){
			try {
				player.resetPlayer();
			} catch (TextureException e) {	}
		}
		
		repaint();
		
	}
}