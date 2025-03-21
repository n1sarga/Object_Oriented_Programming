package cse101projekt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CSE110PROJEKT {
	
	public static void main (String [] args) {
		
		new FirstPage ();
		
	}
}
class FirstPage extends JFrame implements ActionListener{
	
	JFrame frame;
	JButton button;
	
	JTextArea projektInfo = new JTextArea ();
	
	public JButton buttonPI = new JButton ("Project Info");
	public JButton buttonNP = new JButton ("Next Page");
	
	public FirstPage () {
		
		frame = new JFrame ("CSE110 PROJEKT");
		frame.setLayout (null);
		frame.setSize (300, 300);
		frame.add(buttonPI);
		buttonPI.setBounds(25, 100, 100, 40);
		buttonPI.setFocusable (false);
		buttonPI.addActionListener(this);
		frame.add(buttonNP);
		buttonNP.setBounds(160, 100, 100, 40);
		buttonNP.setFocusable (false);
		buttonNP.addActionListener(this);
		frame.setVisible (true);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonPI) {
			frame.dispose();
			CourseInfo cinfo = new CourseInfo ();
		}
		else if (e.getSource() == buttonNP) {
			frame.dispose();
			NextPage np = new NextPage ();
		}
	}
}
