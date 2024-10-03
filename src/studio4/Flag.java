package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 20);
		StdDraw.setYscale(0, 20);
		StdDraw.setPenColor(250, 218, 94);
		StdDraw.filledRectangle(10, 10, 10, 10);
		StdDraw.setPenColor(173, 216, 230);
		StdDraw.filledCircle(10, 10, 6.5);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(4.5, 10, 2);
		StdDraw.filledCircle(15.5, 10, 2);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(4.5, 11, 1);
		StdDraw.filledCircle(15.5, 11, 1);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(2, 12, 8, 15);
		StdDraw.line(18, 12, 12, 15);
		StdDraw.setPenColor(255,20,147);
		StdDraw.filledEllipse(10, 5.5, 2, 1);
		
		
	}
}