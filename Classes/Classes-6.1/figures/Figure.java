package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public abstract class Figure {
    
    protected int x, y;
    protected int w, h;

    protected Paint background, outline;

    protected Figure(int x, int y, int w, int h) {
        this.x = x; this.y = y;
        this.w = w; this.h = h;

        this.background = Color.LIGHT_GRAY;
        this.outline = Color.BLACK;
    }

    public abstract void paint(Graphics2D g2d);

    public void setPosition(int x, int y) {
        this.x = x; this.y = y;
    }
	public int getX() {
        return this.x;
    }
	public int getY() {
        return this.y;
    }

	public void setSize(int w, int h) {
        this.w = w; this.h = h;
    }
	public int getW() {
        return this.w;
    }
	public int getH() {
        return this.h;
    }

	public void setBackground(Paint bg) {
        this.background = bg;
    }
	public Paint getBackground() {
        return this.background;
    }

	public void setOutline(Paint ol) {
        this.outline = ol;
    }
	public Paint getOutline() {
        return this.outline;
    }
}
