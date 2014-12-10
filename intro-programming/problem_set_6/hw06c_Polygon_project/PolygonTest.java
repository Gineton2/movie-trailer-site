import java.awt.Point;

public class PolygonTest
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       shape.addPoint(3, 0);
       shape.addPoint(1, 4);
       shape.addPoint(2, 3);
       
       System.out.println(shape.perimeter());
       System.out.println("Expected: 0");
       
    }
}
