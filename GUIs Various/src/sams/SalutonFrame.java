package sams;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class SalutonFrame extends JFrame {
	public SalutonFrame() {
		
		super(); //Works without this constructor
		
		JLabel label = new JLabel("Saluton Mondo"); 
		
		setLookAndFeel();
		setSize(450, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//works without JFrame in the argument.
		setVisible(true);
		
		add(label);
	}

	private void setLookAndFeel() {

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}

		catch (Exception exc) {
			// ignore error
		}
	}

	public static void main(String[] args) {

		SalutonFrame frame = new SalutonFrame();
	}

}
