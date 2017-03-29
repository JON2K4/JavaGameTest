package game;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame implements KeyListener{

	boolean CONSOLE_ENABLED = false;
	ConsoleWindow console;
	
	public Window(){
		super();
		
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocation((1920/2)-250, (1080/2)-250);
		
		Stage mainStage = new Stage();
		add(mainStage);
		
		addKeyListener(this);
		addKeyListener(mainStage);
		pack();
		
		setSize(500, 500);
		
		console = new ConsoleWindow(this);
		console.setVisible(CONSOLE_ENABLED);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
		if (e.getKeyCode() == KeyEvent.VK_BACK_QUOTE){
			
			CONSOLE_ENABLED = !CONSOLE_ENABLED;
			console.toggleVis(CONSOLE_ENABLED);
			
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
