//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw mwthod draw a
//line from point 0, 0 to point 30, 40
//

import java.util.ArrayList;
import java.awt.Point;

public class Polygon {
	private ArrayList<Point> points;
	/**
	 * Constructs an empty Polygon
	 * (Initializes ArrayList instance variable)
	 */
	public Polygon(){
		points = new ArrayList<Point>();
	}
	
	/**
	 * Add a point to the list.
	 * @param point the point to be added.
	 */
	public void add(Point point) {
		points.add(point);
	}

	/**
	 * Returns the perimeter of the Polygon.
	 * @return The perimeter; i.e., the sum of all sides of the polygon.
	 */
	public double perimeter() {
		double perimeter = 0;
		int n = 1;

		//  Add to perimeter the distance between all points from first to last.
		for (int i = 0; i < points.size()-1; i++){
    		Point p = points.get(i);
    		double pX = p.getX();
    		double pY = p.getY();
    
    		Point q = points.get(n);
    		double qX = q.getX();
    		double qY = q.getY();

			if (i < points.size() - 1){
				n++;
			}

			perimeter += Math.sqrt( (Math.pow((pX - qX), 2)) + (Math.pow((pY - qY), 2)));
			
		}

		// Add distance between first and last point to perimeter.
		Point p = points.get(0);
		double pX = p.getX();
		double pY = p.getY();

		Point q = points.get(points.size()-1);
		double qX = q.getX();
		double qY = q.getY();
		
		perimeter += Math.sqrt( (Math.pow((pX - qX), 2)) + (Math.pow((pY - qY), 2)));
		
		return perimeter;
	}

	/**
	 * The draw method draws the polygon by connecting consecutive points 
	 * and then connecting the last point to the first.
	 */
	public void draw() {
		// Draw lines between points first to last.
	    for (int i = 0; i < points.size()-1; i++) {
        	Point p = points.get(i);
       		double pX = p.getX();
            double pY = p.getY();
            Point q = points.get(i+1);
            double qX = q.getX();
            double qY = q.getY();
            Line newLine = new Line(pX,pY, qX,qY);
            newLine.draw();
    	}
		
		// Draw line from first point to last point.
    	Point p = points.get(0);
   		double pX = p.getX();
        double pY = p.getY();

        Point q = points.get(points.size()-1);
        double qX = q.getX();
        double qY = q.getY();
        Line newLine = new Line(pX,pY, qX, qY);
        newLine.draw();
	}
}
