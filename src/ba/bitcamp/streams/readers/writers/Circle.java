package ba.bitcamp.streams.readers.writers;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

	protected Graphics g;

	public Circle(Graphics g) {

		this.g = g;
	}

	public void drawAt(int x, int y) {

		g.fillOval(x, y, 30, 30);
		g.setColor(new Color(50, 50, 50));
	}

}
