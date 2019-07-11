package sams;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBox246 extends JFrame {

	public JCheckBox246() 
	{
		//instantiating the JCheckBox objects. false seems redundant
		JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);
		JCheckBox eggs = new JCheckBox("Sunrise", true);
		JCheckBox fishTacos = new JCheckBox("Fish Tacos", false);
		JCheckBox emu = new JCheckBox(" Emu Nuggets", false);
		
		// Create Object of group of meals, only one can be checked at a time
		ButtonGroup meals = new ButtonGroup();
		meals.add(eggs);
		meals.add(fishTacos);
		meals.add(emu);
		
		setTitle("JCheckBox Demo");
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Adding them to the container
		add(jumboSize);
		add(eggs);
		add(fishTacos);
		add(emu);
		
		//Setting the layout
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		JCheckBox246 obj = new JCheckBox246();

	}

}
