package game;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsolePanel extends JPanel 
	implements ActionListener{

	JButton closeButton;
	ConsoleWindow win;
	
	public ConsolePanel(ConsoleWindow win) {
		super();
		this.win = win;
		
		
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		closeButton = new JButton("X");
		closeButton.setForeground(Color.WHITE);
		closeButton.setBounds(280, 0, 20, 20);
		closeButton.setMargin(new Insets(0, 0, 0, 0));
		closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false); 
        closeButton.setFocusPainted(false); 
        closeButton.setOpaque(false);
		
		add(closeButton);
		closeButton.addActionListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g1 = (Graphics2D) g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "X"){
			System.out.println("Console closed.");
			win.setVisible(false);
			win.mainWin.CONSOLE_ENABLED = false;
		}
		
	}

}
