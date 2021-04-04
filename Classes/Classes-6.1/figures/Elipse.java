package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public class Elipse extends Figure {

	public Elipse(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics2D g2d) {
		// painting background
		g2d.setPaint(super.background);
		g2d.fillOval(super.x, super.y, super.w, super.h);

		// painting outline
		g2d.setPaint(super.outline);
		g2d.drawOval(super.x, super.y, super.w, super.h);
	}
}
