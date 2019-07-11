package absoluteJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingDemo889 {

	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;		
	
	public FirstSwingDemo889() {
		
		JFrame firstWindow = new JFrame();
		firstWindow.setSize(WIDTH, HEIGHT);
		firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton endButton = new JButton("Close");
		EndingListener buttonEar = new EndingListener();
		endButton.addActionListener(buttonEar);
		firstWindow.add(endButton);
		
		firstWindow.setVisible(true);
	}
	
	//Inner Class
	private class EndingListener implements ActionListener 
	{
		public void ActionPerformed(ActionEvent e) 
		{
			System.exit(0);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
		public static void main(String[] args) {

			FirstSwingDemo889 Demo = new FirstSwingDemo889();
}





}