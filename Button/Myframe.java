package Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame implements ActionListener {
	JButton button;
	
	Myframe() {
		
		ImageIcon icon = new ImageIcon("middle.png");
		
		//Resize image (very useful btw)
		Image image = icon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		button = new JButton();
		button.setBounds(100, 100,250, 120);
		
		//customization
		button.setText("Click here"); //Print a message in the button
		button.addActionListener(this);
		button.setFocusable(false);
		button.setIcon(icon);
		button.setVerticalTextPosition(JButton.TOP);
		button.setHorizontalTextPosition(JButton.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("Play Better Now");
			button.setEnabled(false);
		}
	}
	
}