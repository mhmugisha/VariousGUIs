package absoluteJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstWindow extends JFrame 
{

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public FirstWindow() {
		//super();
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton endButton = new JButton("Click to end program.");
		endButton.addActionListener(new EndingListener());
		add(endButton);
	}

	public static void main(String[] args) 
	{
		FirstWindow w = new FirstWindow();
		w.setVisible(true);
	}

//Inner class EndingListener
	public class EndingListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			System.exit(0);
		}
	}

}
