package figures;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Color;

public class Retangulo extends Figure {

	public Retangulo(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void paint(Graphics2D g2d) {
		// painting background
		g2d.setPaint(super.background);
		g2d.fillRect(super.x, super.y, super.w, super.h);

		// painting outline
		g2d.setPaint(super.outline);
		g2d.drawRect(super.x, super.y, super.w, super.h);
	}
}
	
