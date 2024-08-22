package Try_this;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame (){
		this.setTitle("I'm Batman"); //set the title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out application
		this.setVisible(true); //To make the this visible:
		//this.setResizable(false); //prevent problems... LOL
		this.setSize(10000, 10000); //Set x and y dimension
		//this.setBounds(100, 100, 250, 250);
		
		
		ImageIcon image = new ImageIcon("next.png"); //create new icon
		this.setIconImage(image.getImage()); //chance icon this
		this.getContentPane().setBackground(Color.white);
		
	}
}
