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

	ArrayList<Elipse> elipses;
	Random random;

    PaintFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Painting Figures");
        this.setSize(350, 350);
		
		this.elipses = new ArrayList<Elipse>();
    	this.random = new Random();

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				char c = event.getKeyChar();
				if (c == 'e' || c == 'E') {
					int w = Math.abs(random.nextInt() % 190) + 10;
					int h = Math.abs(random.nextInt() % 190) + 10;
					int x = Math.abs(random.nextInt() % (getWidth() - w));
					int y = Math.abs(random.nextInt() % (getHeight() - h));
					Elipse e = new Elipse(x, y, w, h);

					switch (Math.abs(random.nextInt() % 4)) {
						case 0:
							e.setBackground(Color.RED);
							break;
						case 1:
							e.setBackground(Color.GRAY);
							break;
						case 2:
							e.setBackground(Color.BLACK);
							break;
						case 3:
							e.setBackground(Color.BLUE);
							break;
						default:
							break;
					}

					switch (Math.abs(random.nextInt() % 4)) {
						case 0:
							e.setOutline(Color.RED);
							break;
						case 1:
							e.setOutline(Color.GRAY);
							break;
						case 2:
							e.setOutline(Color.BLACK);
							break;
						case 3:
							e.setOutline(Color.BLUE);
							break;
						default:
							break;
					}

					elipses.add(e);
				}
				repaint();
			}
		});
	}

    public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		for (Elipse e : this.elipses) {
			e.paint(g2d);
		}
    }
}
