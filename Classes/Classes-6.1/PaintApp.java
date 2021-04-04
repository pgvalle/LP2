import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.Random;
import java.util.ArrayList;

import figures.*;

class PaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {

	static final Paint[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.ORANGE};

	ArrayList<Figure> figures;
	Random random;

    PaintFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Painting Figures");
        this.setSize(350, 350);
		
		this.figures = new ArrayList<Figure>();
    	this.random = new Random();

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				char c = event.getKeyChar();
				if (c == 'e') {
					Elipse e = new Elipse(
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % getWidth()),
						Math.abs(random.nextInt() % getHeight())
					);
					e.setBackground(colors[Math.abs(random.nextInt() % 4)]);
					e.setOutline(colors[Math.abs(random.nextInt() % 4)]);
					figures.add(e);
				} else if (c == 'r') {
					Retangulo r = new Retangulo(
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % getWidth()),
						Math.abs(random.nextInt() % getHeight())
					);
					r.setBackground(colors[Math.abs(random.nextInt() % 4)]);
					r.setOutline(colors[Math.abs(random.nextInt() % 4)]);
					figures.add(r);
				} else if (c == 't') {
					Triangulo t = new Triangulo(
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % 100) + 10,
						Math.abs(random.nextInt() % getWidth()),
						Math.abs(random.nextInt() % getHeight())
					);
					t.setBackground(colors[Math.abs(random.nextInt() % 4)]);
					t.setOutline(colors[Math.abs(random.nextInt() % 4)]);
					figures.add(t);
				}
				repaint();
			}
		});
	}

    public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		for (Figure f : this.figures) {
			f.paint(g2d);
		}
    }
}
