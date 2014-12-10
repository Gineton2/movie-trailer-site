
import java.util.Scanner;
public class RectangleDemo
{
    public static void main(String[] args)
    {
        

        UdacityRectangle box = new UdacityRectangle(20, 30, 70, 50);
        box.draw();
        int area = box.area();
        System.out.println(area);
        
        box.grow(5, 10);
        area = box.area();
        System.out.println(area);
        


    }

}
