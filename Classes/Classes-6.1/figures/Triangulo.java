package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public class Triangulo extends Figure {

	private int[] xlist, ylist;

	public Triangulo(int x, int y, int w, int h) {
		super(x, y, w, h);

		this.xlist = new int[3];
		this.ylist = new int[3];
		this.setPoints();
	}

	private void setPoints() {
		this.xlist[0] = super.x + super.w / 2;
		this.ylist[0] = super.y;

		this.xlist[1] = super.x + super.w;
		this.ylist[1] = super.y + super.h;

		this.xlist[2] = super.x;
		this.ylist[2] = super.y + super.h;
	}

	@Override
	public void paint(Graphics2D g2d) {
		// painting background
		g2d.setPaint(super.background);
		g2d.fillPolygon(this.xlist, this.ylist, 3);

		// painting outline
		g2d.setPaint(super.outline);
		g2d.drawPolygon(this.xlist, this.ylist, 3);
	}

	@Override
	public void setPosition(int x, int y) {
        super.setPosition(x, y);
		this.setPoints();
    }

	@Override
	public void setSize(int w, int h) {
        super.setSize(w, h);
		this.setPoints();
    }
}
	
