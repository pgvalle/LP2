import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main(String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect[] rlist;

    PaintFrame() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.rlist = new Rect[3];

        this.rlist[0] = new Rect(50, 50, 100, 30);
        this.rlist[0].setOutline(Color.BLACK);
        this.rlist[0].setBackgroung(Color.RED);

        this.rlist[1] = new Rect(100, 100, 30, 100);
        this.rlist[1].setOutline(Color.RED);
        this.rlist[1].setBackgroung(Color.BLACK);

        this.rlist[2] = new Rect(20, 100, 40, 40);
        this.rlist[2].setOutline(Color.BLUE);
        this.rlist[2].setBackgroung(Color.YELLOW);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Rect r : this.rlist) {
            r.paint(g);
        }
    }
}

class Rect {
    int x, y;
    int w, h;

    Color background, outline;

    Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void setBackgroung(Color bg) {
        this.background = bg;
    }

    void setOutline(Color ol) {
        this.outline = ol;
    }

    void print() {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n", this.w, this.h, this.x, this.y);
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // desenhando retangulo
        g2d.setColor(this.background);
        g2d.fillRect(this.x, this.y, this.w, this.h);
        // desenhando contorno
        g2d.setColor(this.outline);
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
}