package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public class Triangulo {

	private int x, y;
	private int w, h;

	private int[] xlist, ylist;

	private Paint background, outline;

	public Triangulo(int x, int y, int w, int h) {
		this.x = x; this.y = y;
		this.w = w; this.h = h;

		this.xlist = new int[3];
		this.ylist = new int[3];
		
		this.setPoints();

		this.background = Color.WHITE;
		this.outline = Color.BLACK;
	}

	private void setPoints() {
		this.xlist[0] = this.x + this.h / 2;
		this.xlist[1] = this.x + this.h;
		this.xlist[2] = this.x;

		this.ylist[0] = this.y;
		this.ylist[1] = this.y + this.h;
		this.ylist[2] = this.y + this.h;
	}

	public void setPosition(int x, int y) {
		this.x = x; this.y = y;
		this.setPoints();
	}
	public int getX() { return this.x; }
	public int getY() { return this.y; }

	public void setSize(int w, int h) {
		this.w = w; this.h = h;
		this.setPoints();
	}
	public int getW() { return this.w; }
	public int getH() { return this.h; }

	public void setBackground(Paint bg) { this.background = bg; }
	public Paint getBackground() { return this.background; }

	public void setOutline(Paint ol) { this.outline = ol; }
	public Paint getOutline() { return this.outline; }

	public void paint(Graphics2D g2d) {
		// painting background
		g2d.setPaint(this.background);
		g2d.fillPolygon(this.xlist, this.ylist, 3);

		// painting outline
		g2d.setPaint(this.outline);
		g2d.drawPolygon(this.xlist, this.ylist, 3);
	}
}
	
