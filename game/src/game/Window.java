package game;

import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame implements KeyListener{

	boolean CONSOLE_ENABLED = false;
	ConsoleWindow console;
	
	public Window(){
		super();
		
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation((1920/2)-250, (1080/2)-250);
		
		Stage mainStage = new Stage();
		add(mainStage);
		
		
		addKeyListener(this);
		pack();
		
		setSize(500, 500);
		
		console = new ConsoleWindow();
		console.setVisible(CONSOLE_ENABLED);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_BACK_QUOTE){
			System.out.println("Tilde pressed");
			
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
