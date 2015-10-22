package com.ao.datastructures.visuse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/* class will paint elements*/
class Canvas extends JComponent {

	/* repaint elements inside the window during refresh */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;

		/* green color for paint */
		g2d.setPaint(Color.GREEN);

		/* draw rectangle using current color */
		g2d.drawRect(100, 100, 80, 20);

		g2d.setPaint(Color.RED);
		/*
		 * draw using current color with coordinates (X,Y) line hello World
		 */
		g2d.drawString("Hello world", 150, 150);

		g2d.setColor(Color.blue);
		/* draw using current color oval with coordinates (X, Y) */
		g2d.fillOval(200, 50, 50, 20);

		if (Window.ov == true) {
			g2d.fillOval(200, 150, 150, 120);
		}

		/* call refresh itself after finish draw */
		super.repaint();
	}

}