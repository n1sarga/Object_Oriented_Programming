package cse101projekt;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.*;

public class NextPage implements ActionListener {
	
	JFrame frame = new JFrame ("List of Programs");
	
	public JPanel panelList = new JPanel (new GridLayout (0, 1));
	
	public JButton back = new JButton ("Back");
	public JButton buttonHW = new JButton ("Printing HELLO WORLD!");
	public JButton buttonCTN = new JButton ("Comparing Two Numbers");
	public JButton buttonTIV = new JButton ("The Initialized Variable");
	public JButton buttonPHWHTWWL = new JButton ("Printing HELLO WORLD! Hundred Times with While Loop");
	public JButton buttonPHWHTWFL = new JButton ("Printing HELLO WORLD! Hundred Times with For Loop");
	public JButton buttonPHWHTWDWL = new JButton ("Printing HELLO WORLD! Hundred Times with do While Loop");
	public JButton buttonFN = new JButton ("Finding Factorial of a Number");
	public JButton buttonSOD = new JButton ("Finding Summation of Digits");
	public JButton buttonAONN = new JButton ("Finding The Average of N Numbers");
	public JButton buttonOOE = new JButton ("ODD or EVEN Number");
	public JButton buttonFOAN = new JButton ("Finding The Factors of a Number");
	public JButton buttonRAA = new JButton ("Reverse an Array");
	public JButton buttonSEOAA = new JButton ("Small Element of an Array");
	public JButton buttonLEOAA = new JButton ("Large Element of an Array");
	public JButton buttonSOAE = new JButton ("Summation of Array Elements");
	public JButton buttonIAE = new JButton ("Insert Array Elements");
	public JButton buttonATNUR = new JButton ("Adding Two Numbers Using Recursion");
	public JButton buttonFOANUR = new JButton ("Factorial of a Number using Recursion");
	public JButton buttonFSUR = new JButton ("Fibonacci Series using Recursion");
	public JButton buttonLOTN = new JButton ("Largest of Three Numbers");
	public JButton buttonSLN = new JButton ("Second Largest number");
	
	public JPanel panelForC = new JPanel (new GridLayout (1, 1));
	
	JTextArea forC = new JTextArea ();
	
	public JPanel panelForJava = new JPanel (new GridLayout (1, 2));
	
	JTextArea forJava = new JTextArea ();
	
	public NextPage () {
		frame.setLayout (new BorderLayout ());
		frame.setSize (1000, 700);
		frame.add(panelList, BorderLayout.WEST);
		panelList.add(back);
		back.setFocusable (false);
		back.addActionListener(this);
		panelList.add (buttonHW);
		buttonHW.setFocusable (false);
		buttonHW.addActionListener(this);
		panelList.add (buttonCTN);
		buttonCTN.setFocusable (false);
		buttonCTN.addActionListener(this);
		panelList.add(buttonTIV);
		buttonTIV.setFocusable (false);
		buttonTIV.addActionListener(this);
		panelList.add(buttonPHWHTWWL);
		buttonPHWHTWWL.setFocusable (false);
		buttonPHWHTWWL.addActionListener(this);
		panelList.add(buttonPHWHTWFL);
		buttonPHWHTWFL.setFocusable (false);
		buttonPHWHTWFL.addActionListener(this);
		panelList.add(buttonPHWHTWDWL);	
		buttonPHWHTWDWL.setFocusable (false);
		buttonPHWHTWDWL.addActionListener(this);
		panelList.add(buttonFN);
		buttonFN.setFocusable (false);
		buttonFN.addActionListener(this);
		panelList.add (buttonSOD);
		buttonSOD.setFocusable (false);
		buttonSOD.addActionListener(this);
		panelList.add (buttonAONN);
		buttonAONN.setFocusable (false);
		buttonAONN.addActionListener(this);
		panelList.add(buttonOOE);
		buttonOOE.setFocusable (false);
		buttonOOE.addActionListener(this);
		panelList.add(buttonFOAN);
		buttonFOAN.setFocusable (false);
		buttonFOAN.addActionListener(this);
		panelList.add(buttonRAA);
		buttonRAA.setFocusable (false);
		buttonRAA.addActionListener(this);
		panelList.add(buttonSEOAA);
		buttonSEOAA.setFocusable (false);
		buttonSEOAA.addActionListener(this);
		panelList.add(buttonLEOAA);
		buttonLEOAA.setFocusable (false);
		buttonLEOAA.addActionListener(this);
		panelList.add(buttonSOAE);
		buttonSOAE.setFocusable (false);
		buttonSOAE.addActionListener(this);
		panelList.add (buttonIAE);
		buttonIAE.setFocusable (false);
		buttonIAE.addActionListener(this);
		panelList.add (buttonATNUR);
		buttonATNUR.setFocusable (false);
		buttonATNUR.addActionListener(this);
		panelList.add(buttonFOANUR);
		buttonFOANUR.setFocusable (false);
		buttonFOANUR.addActionListener(this);
		panelList.add(buttonFSUR);
		buttonFSUR.setFocusable (false);
		buttonFSUR.addActionListener(this);
		panelList.add(buttonLOTN);	
		buttonLOTN.setFocusable (false);
		buttonLOTN.addActionListener(this);
		panelList.add(buttonSLN);
		buttonSLN.setFocusable (false);
		buttonSLN.addActionListener(this);
		
		frame.add (panelForC, BorderLayout.CENTER);
		JScrollPane sc = new JScrollPane (forC);
		
		frame.add(panelForJava, BorderLayout.EAST);
		JScrollPane sj = new JScrollPane (forJava);
		
		panelForC.add (sc);
		panelForJava.add (sj);
		
		frame.setVisible (true);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			frame.dispose();
			new FirstPage ();
		}
		else if (e.getSource() == buttonHW) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Hello World.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Hello World.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonCTN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Comparing Two Numbers.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Comparing Two Numbers.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonTIV) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\The Initialized Variabale.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\The Initialized Variable.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonPHWHTWWL) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Print Hello World Hundred Times With While Loop.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Print Hello World Hundred Times With While Loop.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonPHWHTWFL) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Print Hello World Hundred Times With For Loop.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Print Hello World Hundred Times With For Loop.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonPHWHTWDWL) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Print Hello World Hundred Times With Do While Loop.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Print Hello World Hundred Times With Do While Loop.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonFN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Finding Factorial of a Number.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Finding Factorial of a Number.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonSOD) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Summation of Digits.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Summation of Digits.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonAONN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Average of N Numbers.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Average of N Numbers.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonOOE) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\ODD or EVEN.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\ODD or EVEN.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonFOAN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Finding The Factors of a Number.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Finding The Factors of a Number.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonRAA) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\Reverse an Array.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\Reverse an Array.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonSEOAA) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\SEOAA.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\SEOAA.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonLEOAA) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\LEOAA.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\LEOAA.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonSOAE) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\SOAE.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\SOAE.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonIAE) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\IAE.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\IAE.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonATNUR) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\ATNUR.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\ATNUR.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonFOANUR) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\FOANUR.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\FOANUR.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonFSUR) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\FSUR.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\FSUR.java");
			forJava.setText(data);
		}
		else if (e.getSource() == buttonLOTN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\LOTN.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\LOTN.java");
			forJava.setText(data);
		}	
		else if (e.getSource() == buttonSLN) {
			String data = readFile ("C:\\Users\\Nisarga\\eclipse-workspace\\CSE101Projekt\\files\\SLN.c");
			forC.setText (data);
			data = readFile ("C:\\\\Users\\\\Nisarga\\\\eclipse-workspace\\\\CSE101Projekt\\\\files\\\\SLN.java");
			forJava.setText(data);
		}
}

	private String readFile(String filepath) {
		try {
		      File myObj = new File(filepath);
		      Scanner myReader = new Scanner(myObj); 
		      String fileData = "";
		      while (myReader.hasNextLine()) {
		    	  fileData += myReader.nextLine()+"\n";
		      }
		      myReader.close();
		      return fileData;
		    }catch (Exception ex) {
			      System.out.println("Exception error occurred.");
			      ex.printStackTrace();
			}
		return null;
	}
}

