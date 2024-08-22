package KListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon icon;

	Game() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rock.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 130, 130);
		label.setBackground(Color.black);
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 37	: label.setLocation(label.getX()-15, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-15);	
			break;
		case 39: label.setLocation(label.getX()+15, label.getY());	
			break;
		case 40: label.setLocation(label.getX(), label.getY()+15);	
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
