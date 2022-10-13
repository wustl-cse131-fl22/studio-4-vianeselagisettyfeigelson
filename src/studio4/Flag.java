package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color outerRec = new Color(164, 240, 156);
		StdDraw.setPenColor(outerRec);
		StdDraw.filledRectangle(.5, .5, .4, .4);
		
		Color innerEllipse = new Color(143, 127, 245);
		StdDraw.setPenColor(innerEllipse);
		StdDraw.filledEllipse(.5, .5, .2, .2);
		
	}
}