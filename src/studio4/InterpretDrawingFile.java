package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
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
		boolean isFilled = in.nextBoolean();
		Color rando = new Color(red, green, blue);
		
		if (shape.equals ("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfx = in.nextDouble();
			double halfy = in.nextDouble();
			if (isFilled == true) {
				StdDraw.setPenColor(rando);
				StdDraw.filledEllipse(x, y, halfx, halfy);
			}
			else  {
				StdDraw.setPenColor(rando);
				StdDraw.ellipse(x, y, halfx, halfy);
			}
		}
		
		if (shape.equals ("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfx = in.nextDouble();
			double halfy = in.nextDouble();
			if (isFilled == true) {
				StdDraw.setPenColor(rando);
				StdDraw.filledRectangle(x, y, halfx, halfy);
			}
			else {
				StdDraw.setPenColor(rando);
				StdDraw.rectangle(x, y, halfx, halfy);
			}
		}	
	}
}
