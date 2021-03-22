package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public class Elipse {
	
	private int x, y;
	private int w, h;

	private Paint background, outline;

	public Elipse(int x, int y, int w, int h) {
		this.x = x; this.y = y;
		this.w = w; this.h = h;

		this.background = Color.WHITE;
		this.outline = Color.BLACK;
	}

	public void setPosition(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }

	public void setSize(int w, int h) { this.w = w; this.h = h; }
	public int getW() { return this.w; }
	public int getH() { return this.h; }

	public void setBackground(Paint bg) { this.background = bg; }
	public Paint getBackground() { return this.background; }

	public void setOutline(Paint ol) { this.outline = ol; }
	public Paint getOutline() { return this.outline; }

	public void paint(Graphics2D g2d) {
		// painting background
		g2d.setPaint(this.background);
		g2d.fillOval(this.x, this.y, this.w, this.h);

		// painting outline
		g2d.setPaint(this.outline);
		g2d.drawOval(this.x, this.y, this.w, this.h);
	}
}