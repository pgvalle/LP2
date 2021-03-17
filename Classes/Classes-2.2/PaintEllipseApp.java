import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class PaintEllipseApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Ellipse[] elist;

    PaintFrame() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.elist = new Ellipse[3];

        this.elist[0] = new Ellipse(200, 50, 100, 30);
        this.elist[0].setBackgroung(Color.RED);
        this.elist[0].setOutline(Color.BLACK);

        this.elist[1] = new Ellipse(50, 50, 100, 30);
        this.elist[1].setBackgroung(Color.RED);
        this.elist[1].setOutline(Color.BLACK);

        this.elist[2] = new Ellipse(165, 100, 20, 80);
        this.elist[2].setBackgroung(Color.BLUE);
        this.elist[2].setOutline(Color.BLACK);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Ellipse e : this.elist) {
            e.paint(g);
        }
    }
}

class Ellipse {
    int x, y, r1, r2;
    Color background, outline;

    Ellipse(int x, int y, int r1, int r2) {
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.r2 = r2;
    }

    void setBackgroung(Color bg) {
        this.background = bg;
    }

    void setOutline(Color ol) {
        this.outline = ol;
    }

    void print() {
        System.out.format("Elipse de raios %d e %d na posicao (%d, %d).\n", this.r1, this.r2, this.x, this.y);
    }

    void paint(Graphics g) {
        Ellipse2D ellipse = new Ellipse2D.Double(this.x, this.y, this.r1, this.r2);
        Graphics2D g2d = (Graphics2D) g;

        // desenhando fundo
        g2d.setColor(this.background);
        g2d.fill(ellipse);
        // desenhando contorno
        g2d.setColor(this.outline);
        g2d.draw(ellipse);
    }
}