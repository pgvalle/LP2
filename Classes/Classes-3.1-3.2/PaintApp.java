import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class PaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {

    Rect r;
    Elipse e;
    Triangulo t;

    PaintFrame() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setTitle("Painting Figures");
        this.setSize(350, 350);

	this.r = new Rect(30, 30, 60, 40);
	this.r.setBackground(Color.RED);

	this.e = new Elipse(100, 100, 50, 80);
	this.e.setBackground(Color.BLUE);
	
	this.t = new Triangulo(200, 200, 100, 100);
	this.t.setBackground(Color.GREEN);
    }

    public void paint(Graphics g) {
    	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;

	this.r.paint(g2d);
	this.e.paint(g2d);
	this.t.paint(g2d);
    }
}
