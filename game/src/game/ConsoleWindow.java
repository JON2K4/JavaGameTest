package game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ConsoleWindow extends JFrame 

	implements KeyListener, ActionListener{
	
	public ConsoleWindow() {
		super();
		
		setTitle("Console");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation((1920/2)+250, (1080/2)-250);
		//setUndecorated(true);
		
		addKeyListener(this);

		ConsolePanel panel = new ConsolePanel();
		add(panel);
		
		pack();
		setSize(300, 400);
		
	}
	
	public void toggleVis(boolean visState){
		System.out.println("Toggle Console visibility");
		setVisible(visState);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_BACK_QUOTE){
			
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
