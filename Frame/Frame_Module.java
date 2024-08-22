package Try_this;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Frame_Module {
	public static void main (String [] args) {
		/*JFrame frame = new JFrame();
		
		frame.setTitle("I'm Batman"); //set the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out application
		frame.setVisible(true); //To make the frame visible:
		frame.setResizable(false); //prevent problems... LOL
		frame.setSize(420, 420); //Set x and y dimension
		
		ImageIcon image = new ImageIcon("next.png"); //create new icon
		frame.setIconImage(image.getImage()); //chance icon frame
		frame.getContentPane().setBackground(Color.black); */
		
		MyFrame Bruce = new MyFrame();
		ImageIcon img = new ImageIcon("gatin.jpg");
		Border border = BorderFactory.createLineBorder(Color.blue, 3);
		
		JLabel label = new JLabel();
		label.setText("Você foi pego pelo gatinho gamer!"); //text of label
		Bruce.add(label);
		label.setIcon(img);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageIcon
		label.setForeground(new Color (0x670C8C )); //set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
		label.setIconTextGap(10); //set gap between text and icon ou image
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);
		Bruce.pack();
	}
		
}
