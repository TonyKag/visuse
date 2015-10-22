/**
 *   File Name: JTextFieldDemo.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton <br>
 *   Created: Oct 21, 2015
 *   
 */

package com.ao.datastructures.visuse;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//A program to demonstrate the use of JTextFields's
//Import Statements
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Graphics extends JFrame {

	private class TextHandler implements ActionListener {

		// @Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jtfText1) {
				disp = "text1 : " + e.getActionCommand();
			} else if (e.getSource() == jtfUneditableText) {
				disp = "text3 : " + e.getActionCommand();
			}
			JOptionPane.showMessageDialog(null, disp);
		}
	}

	String disp = "";
	TextHandler handler = null;
	// Class Declarations
	JTextField jtfText1, jtfUneditableText;

	// Constructor
	public Graphics() {
		super("TextField Test Demo");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		jtfText1 = new JTextField(10);
		jtfUneditableText = new JTextField("Uneditable text field", 20);
		jtfUneditableText.setEditable(false);
		container.add(jtfText1);
		container.add(jtfUneditableText);
		handler = new TextHandler();
		jtfText1.addActionListener(handler);
		jtfUneditableText.addActionListener(handler);
		setSize(325, 100);
		setVisible(true);
	}
}