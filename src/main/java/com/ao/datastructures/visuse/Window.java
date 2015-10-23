package com.ao.datastructures.visuse;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Window extends javax.swing.JFrame {

	public static String btn1Label;
	public static String btn2Label;
	public static String btn3Label;
	public static String frameLabel;
	public static Font hugeFont;
	public static Font largeFont;
	public static Font mediumFont;
	public static boolean ov = true;
	public static String rBtn1Label;
	public static String rBtn2Label;
	public static Font smallFont;
	private static int btn1PosX;
	private static int btn1PosY;
	private static int btn1SizeX;
	private static int btn1SizeY;
	private static int btn2PosX;
	private static int btn2PosY;
	private static int btn2SizeX;
	private static int btn2SizeY;
	private static int btn3PosX;
	private static int btn3PosY;
	private static int btn3SizeX;
	private static int btn3SizeY;
	private static int framePosX;
	private static int framePosY;
	private static int frameSizeX;
	private static int frameSizeY;
	private static int rBtn1PosX;
	private static int rBtn1PosY;
	private static int rBtn1SizeX;
	private static int rBtn1SizeY;
	private static int rBtn2PosX;
	private static int rBtn2PosY;
	private static int rBtn2SizeX;
	private static int rBtn2SizeY;
	private static int textField1PosX;
	private static int textField1PosY;
	private static int textField1SizeX;
	private static int textField1SizeY;
	static ButtonGroup bg1;
	static JButton btn1;
	static JButton btn2;
	static JButton btn3;
	static JRadioButton rBtn1;
	static JRadioButton rBtn2;
	static JTextField textField1;

	public static boolean isOv() {
		return ov;

	}

	public static void setOv(boolean ov) {
		Window.ov = ov;
	}

	public Window() {
		frameLabel = "Java Collections";

		smallFont = new Font("Serif", Font.PLAIN | Font.BOLD, 10);
		mediumFont = new Font("Serif", Font.PLAIN | Font.BOLD, 12);
		largeFont = new Font("Serif", Font.PLAIN | Font.BOLD, 14);
		hugeFont = new Font("Serif", Font.PLAIN | Font.BOLD, 16);

		framePosX = 600;
		framePosY = 110;
		frameSizeX = 800;
		frameSizeY = 600;

		btn1PosX = 680;
		btn1PosY = 40;
		btn1SizeX = 80;
		btn1SizeY = 25;

		btn2PosX = 680;
		btn2PosY = 80;
		btn2SizeX = 80;
		btn2SizeY = 25;

		btn3PosX = 680;
		btn3PosY = 120;
		btn3SizeX = 80;
		btn3SizeY = 25;

		textField1PosX = 480;
		textField1PosY = 40;
		textField1SizeX = 160;
		textField1SizeY = 110;

		btn1Label = "button1";
		btn2Label = "button2";
		btn3Label = "button3";

		rBtn1Label = "Text";
		rBtn2Label = "File";

		rBtn1PosX = 670;
		rBtn1PosY = 15;
		rBtn1SizeX = 50;
		rBtn1SizeY = 20;

		rBtn2PosX = 720;
		rBtn2PosY = 15;
		rBtn2SizeX = 50;
		rBtn2SizeY = 20;

		/* window name */
		JFrame w = new JFrame(frameLabel);
		/* window size */
		w.setSize(frameSizeX, frameSizeY);

		/* method close */
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Canvas canv = new Canvas();
		w.add(canv);
		w.setVisible(true);

		// put buttons on the frame
		w.getContentPane().setLayout(new FlowLayout());
		w.setLayout(null);

		w.setLocationRelativeTo(null);

		btn1 = new JButton(btn1Label);
		btn1.setFont(mediumFont);
		w.setLayout(null);
		btn1.setVisible(true);
		w.add(btn1).setBounds(btn1PosX, btn1PosY, btn1SizeX, btn1SizeY);

		btn2 = new JButton(btn2Label);
		btn2.setFont(mediumFont);
		w.setLayout(null);
		btn2.setVisible(true);
		w.add(btn2).setBounds(btn2PosX, btn2PosY, btn2SizeX, btn2SizeY);

		btn3 = new JButton(btn3Label);
		btn3.setFont(mediumFont);
		w.setLayout(null);
		btn3.setVisible(true);
		w.add(btn3).setBounds(btn3PosX, btn3PosY, btn3SizeX, btn3SizeY);

		// add the listener to the jbutton to handle the "pressed" event
		btn1.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent e) {
				ov = false;
			}
		});

		// add the listener to the jbutton to handle the "pressed" event
		btn2.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent e) {
				// btn1.setVisible(false);
				ov = true;
			}
		});

		// add the listener to the jbutton to handle the "pressed" event
		btn3.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent e) {
				// btn1.setVisible(false);
				ov = false;
			}
		});

		textField1 = new JTextField("textField1");
		textField1.setFont(largeFont);
		w.setLayout(null);
		textField1.setVisible(true);
		w.add(textField1).setBounds(textField1PosX, textField1PosY, textField1SizeX, textField1SizeY);

		rBtn1 = new JRadioButton(rBtn1Label);
		rBtn1.setFont(mediumFont);
		rBtn1.setVisible(true);
		w.add(rBtn1).setBounds(rBtn1PosX, rBtn1PosY, rBtn1SizeX, rBtn1SizeY);

		rBtn2 = new JRadioButton(rBtn1Label);
		rBtn2.setFont(mediumFont);
		rBtn2.setVisible(true);
		w.add(rBtn2).setBounds(rBtn2PosX, rBtn2PosY, rBtn2SizeX, rBtn2SizeY);

		bg1 = new ButtonGroup();
		bg1.add(rBtn1);
		bg1.add(rBtn2);

		setVisible(true);

	}
}