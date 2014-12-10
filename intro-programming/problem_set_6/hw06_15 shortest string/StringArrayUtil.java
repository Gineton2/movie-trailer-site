
//
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//

import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string to the hold the shortest string
      String shortest = words.get(0); //initialize

      // TODO: Write the code to find the shortest string
       int i = 0;
       while (i < words.size()-1)
       {
           if (words.get(i+1).length() < shortest.length())
           {
               shortest = words.get(i+1);
           }
           else
           {
               i++;
           }
       }

       return shortest;
   }
}
