//
//Complete the class ArrayListMethods. It consists of
// four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//

import java.util.ArrayList;
public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        int i = 1;
        String previous = "";
        String current = "";
        while (sorted == true && i <= list.size()-1)
        {
            previous = list.get(i-1);
            current = list.get(i);
            if (current.compareTo(previous) < 0)
            {
                sorted = false;
            }
            else
            {
                i++;
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use compareTo() to determine which string is larger (later in alphabetical
     * order.)
     */
    public void replaceWithLargerNeighbor()
    {
        for (int i = 1; i < list.size()-1; i++)
        {
            if (list.get(i).compareTo(list.get(i+1)) < 0)
            {
                list.set(i, list.get(i+1));
            }
        }
    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. 
     * Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. 
     * Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        for (int i = 0; i < list.size(); i++)
        {
            for (int x = i+1; x < list.size(); x++)
            {
                if (x != i && list.get(i).compareTo(list.get(x)) == 0)
                {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

     /**
     * Move any word that starts with x, y, or z to the front of the arraylist, but
     * otherwise preserve the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        
        for (int i = 0; i < list.size(); i++)
        {
            String firstLetter = list.get(i).substring(0,1);
            if (firstLetter.equals("x")
                || firstLetter.equals("y")
                || firstLetter.equals("z"))
            {
                list.add(insertAt, list.remove(i));
                insertAt++;
            }
        }
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return list.toString();
    }
}
