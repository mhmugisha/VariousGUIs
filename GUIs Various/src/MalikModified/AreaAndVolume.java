package MalikModified;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AreaAndVolume extends JFrame {
		
	//Declare the JTextField Objects
	//These are declared here because we want them to be accessed even by 
	//the inner classes down. They are class variables while JLabel objects
	//scope ends within the constructor. 
	
	private JTextField lengthTF, widthTF, heightTF, areaTF, volumeTF, shapeTF;
	
		// Frame dimensions
		private static final int WIDTH = 800;
		private static final int HEIGHT = 600;
	
		// Constructor
		public AreaAndVolume() 
		{
			//Dynamic instantiating the JLabel objects;
			JLabel lengthL = new JLabel("Length:", SwingConstants.RIGHT);
			JLabel widthL = new JLabel("Width:", SwingConstants.RIGHT);
			JLabel heightL = new JLabel("Height:", SwingConstants.RIGHT);
			JLabel areaL = new JLabel("Surface Area:", SwingConstants.RIGHT);
			JLabel volumeL = new JLabel("Volume:", SwingConstants.RIGHT);
			JLabel shapeL = new JLabel("Shape:", SwingConstants.RIGHT);
			
			
			// Instantiatting the JTextField objects
			lengthTF = new JTextField(10);
			widthTF = new JTextField(10);
			heightTF = new JTextField(10);
			areaTF = new JTextField(10);
			volumeTF = new JTextField(10);
			shapeTF = new JTextField(10);
			
			// Create the Calculate area button
			JButton calculateA = new JButton("Calculate Surface Area");
			calculateA.addActionListener(new CalculateAreaHandler());
			
			// Create the calculate volume button
			JButton calculateV = new JButton("Calculate Volume");
			calculateV.addActionListener(new CalculateVolumeHandler());
		
			// Create the exit button
			JButton exit = new JButton("Exit");
			exit.addActionListener(new ExitHandler());
			
			//Create the Frame
			setTitle("Surface Area and Volume of a Cuboid:");
			setSize(WIDTH, HEIGHT);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(new GridLayout(8,2));

			//Add the objects to the space inside the Frame (Content pane)
			//Added in order u want them - filled along rows - left to right
			add(lengthL);
			add(lengthTF);
			add(widthL);
			add(widthTF);
			add(heightL);
			add(heightTF);
			add(areaL);
			add(areaTF);
			add(volumeL);
			add(volumeTF);
			add(shapeL);
			add(shapeTF);
			add(calculateA);
			add(calculateV);
			add(exit);
			
		}
	
	// Calculate surface area inner class
	private class CalculateAreaHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double length, width, height, area;
			length = Double.parseDouble(lengthTF.getText());
			width =  Double.parseDouble(widthTF.getText());
			height = Double.parseDouble(heightTF.getText());

			area = 2 * length * width + 2 * length * height + 2 * width * height;

			areaTF.setText(" " + area);
			shapeTF.setText("It's Boxy!");
		}
	}

	// Calculate volume inner class
	private class CalculateVolumeHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double length, width, height, volume;

			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			height = Double.parseDouble(heightTF.getText());

			volume = length * width * height;

			volumeTF.setText(" " + volume);

		}
	}

	// Exit inner class
	public class ExitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		AreaAndVolume obj = new AreaAndVolume();

	}

}
