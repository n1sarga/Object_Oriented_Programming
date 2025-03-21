package cse101projekt;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CourseInfo implements ActionListener {
	JFrame frame = new JFrame ("Project Information");
	JButton back = new JButton ("Back");
	JLabel label = new JLabel ("<html>Course Name: Object Oriented Programing<br/><br/>Instructor: Md. Mostofa Kamal Rasel<br/><br/>Group Members:<br/><br/>1. Junayed Bin Islam<br/><br/>2. Ummay Khadiza Rumpa<br/><br/>3. Nisarga Mridha<html/>");
	public CourseInfo () {
		frame.setLayout (null);
		frame.setSize (420, 420);
		frame.add(label);
		label.setBounds(100, 80, 200, 200);
		label.setFont(new Font("Castellar", Font.BOLD, 12));
		frame.add (back);
		back.setBounds(5, 5, 65, 40);
		back.setFocusable (false);
		back.addActionListener(this);
		frame.setVisible (true);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource () == back) {
			frame.dispose();
			FirstPage fp = new FirstPage ();
		}
	}
}
