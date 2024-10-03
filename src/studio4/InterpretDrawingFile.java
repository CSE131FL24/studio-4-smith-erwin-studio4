package studio4;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;


public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean fill = in.nextBoolean();
		double parameter1 = in.nextDouble();
		double parameter2 = in.nextDouble();
		double parameter3 = in.nextDouble();
		double parameter4 = in.nextDouble();
		double parameter5 = 0;
		double parameter6 = 0;
		
		
		if(in.hasNextDouble()) {
			parameter5 = in.nextDouble();
			parameter6 = in.nextDouble();
		}
		
		StdDraw.setPenColor(red, green, blue);
		
		if(shape == "rectangle") {
			if(fill) {
				StdDraw.filledRectangle(parameter1, parameter2, parameter3, parameter4);
			}
			else {
				StdDraw.rectangle(parameter1, parameter2, parameter3, parameter4);
			}
		}
		else if(shape == "ellipse") {
			if(fill) {
				StdDraw.filledEllipse(parameter1, parameter2, parameter3, parameter4);
			}
			else {
				StdDraw.ellipse(parameter1, parameter2, parameter3, parameter4);
			}
		}
		
		if(shape == "triangle") {
			double[] triX = {parameter1, parameter3, parameter5};
			double[] triY =  {parameter2, parameter4, parameter6};
			if(fill) {
				StdDraw.filledPolygon(triX, triY);
			}
			else {
				StdDraw.polygon(triX, triY);
			}
		}
		
	}
	
}
