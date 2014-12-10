import java.util.ArrayList;
public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        ArrayList<String> animals = new ArrayList<String>();
        ArrayListMethods zoo = new ArrayListMethods(animals); 
        animals.add("ape");
        animals.add("dog");
        animals.add("zebra");
        animals.add("zebra");
        
        //ArrayList<String> animals = new ArrayList<String>();
        //ArrayListMethods 
        
        //test duplicates
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected duplicates: 1");
        
        
        //test isSorted
        System.out.println(zoo.isSorted());
        System.out.println("Expected: true");
        
        animals.add("cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        animals.remove("cat");
        animals.add(0,"cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        
    }
}
