package ba.bitcamp.streams.readers.writers;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		Ir panel = new Ir();

		window.add(panel);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static class Ir extends JPanel {

		public void paintComponent(Graphics g) {

			Circle c = new Circle(g);
			c.drawAt(60, 5);

			RedCircle cd = new RedCircle(g);
			cd.drawAt(160, 30);

			Crossedcircle cc = new Crossedcircle(g);
			cc.drawAt(50, 50);
		}

	}

	public static class RedCircle extends Circle {

		public RedCircle(Graphics g) {
			super(g);

		}

		public void drawAt(int x, int y) {

			g.setColor(Color.RED);

			super.drawAt(20, 20);
		}

	}

	public static class Crossedcircle extends Circle {

		public Crossedcircle(Graphics g) {
			super(g);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void drawAt(int x, int y) {
			super.drawAt(x, y);
			Color previousColor = g.getColor();
			g.setColor(Color.WHITE);
			g.drawLine(x, y, x + 50, y + 50);
			g.setColor(previousColor);

		}
		

	}

}
