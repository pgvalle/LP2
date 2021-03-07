import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp3 {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World 3");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

        // mudando a cor de fundo //
        g2d.setPaint(Color.BLACK); // mudando a cor do contexto grafico
        g2d.fillRect(0, 0, w, h); // redesenhando fundo

        g2d.setPaint(Color.GREEN);
        g2d.fillRect(0, 0, w, h / 8);
        g2d.fillRect(0, h / 8, 6 * w / 8, h / 8);
    }
}