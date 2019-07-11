package MalikModified;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RectangleProgramEdited extends JFrame {

	// Declare JTextField objects.
	private JTextField lengthTextField, widthTextField, areaTextField, perimeterTextField;

	// Declare and initialize named constants of Frame - height and width.
	private static final int HEIGHT = 400;
	private static final int WIDTH = 300;

	//Class constructor
	public RectangleProgramEdited() {

		//instantiate objects of JLabel.
		JLabel  lengthLabel = new JLabel("Enter the Length:", SwingConstants.RIGHT);
		JLabel widthLabel = new JLabel("Enter the Width:", SwingConstants.RIGHT);
		JLabel areaLabel = new JLabel("Area:", SwingConstants.RIGHT);
		JLabel perimeterLabel = new JLabel("Perimeter:", SwingConstants.RIGHT);

		//instantiate objects of JTextField.
		lengthTextField = new JTextField(10);
		widthTextField = new JTextField(10);
		areaTextField = new JTextField(10);
		perimeterTextField = new JTextField(10);

		//Create Calculate Button using a named object cbHandler 
		JButton calculateB = new JButton("Calculate");
		ButtonHandler cbHandler = new ButtonHandler();
		calculateB.addActionListener(cbHandler);
		calculateB.setBackground(Color.GRAY);

		//Create Exit Button using anonymous object of type ExitButtonHandler
		JButton exitB = new JButton("Exit");
		exitB.addActionListener(new ExitButtonHandler());
		exitB.setBackground(Color.PINK);

		//Create Frame, set its size and display it
		setTitle("Area and Perimeter of Rectangle:");
		setSize(WIDTH, HEIGHT);/*WIDTH and HEIGHT must be int*/
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Set layout as gridlayout.
		setLayout(new GridLayout(5, 2));

		// Add or place contents in the container(space within the frame)
		add(lengthLabel);
		add(lengthTextField);
		add(widthLabel);
		add(widthTextField);
		add(areaLabel);
		add(areaTextField);
		add(perimeterLabel);
		add(perimeterTextField);
		add(calculateB);
		add(exitB);
	}

	/* _______________________________________________________________ */
	
	// CalculateButtonHandler INNER CLASS.
	private class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			double length, width, area, perimeter;
			length = Double.parseDouble(lengthTextField.getText());
			width = Double.parseDouble(widthTextField.getText());
			area = length * width;
			perimeter = 2 * (length + width);

			areaTextField.setText(" " + area);
			perimeterTextField.setText(" " + perimeter);

		}
	}
	/* ________________________________________________________________ */

	// Exit button INNER CLASS
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}

	/* ______________________________________________________________________ */

	// Method main
	public static void main(String[] args) {
		RectangleProgramEdited rectObject = new RectangleProgramEdited();
	}

}
