//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.
//
//For example, if the user provides the input "rum", the method returns a
//string that will print like this

//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

//For the draft provide the constructor, the instance method ,
//and a stub for the getSubstring method that returns null.

public class Word
{

    //TODO write the constructor and define the instance variable
    private String word;
    
    public Word(String word)
    {
        this.word = word;
    }

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */

    public String getSubstrings()
    {

       //TODO complete the stub to return null
       int length = word.length();
       String substring = "";
       for (int j = 1; j <= length; j++)
       {
           for (int i = 0; j + i <= length; i++)
           {
               substring += word.substring(i, j + i) + "\n";
           }
       }
       return substring;
    }
}
