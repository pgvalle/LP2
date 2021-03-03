import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp1 {
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
        this.setTitle("Java2D - Hello World 1");
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

        // mudando cor dos graficos //
        g2d.setPaint(Color.RED); // mudando a cor do contexto grafico 
        g2d.drawLine(0,0, w,h); // desenhando linha 1
        g2d.drawLine(0,h, w,0); // desenhando linha 2
    }
}