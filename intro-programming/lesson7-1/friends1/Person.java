// BlueJ project: lesson7/friends1

// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.

// Refactor the Person class:
//     - Update the instance vars
//     - save the friends' names in an ArrayList<String>
//     - Update addFriend, getFriend, getFriends
// toString() method:
//     gets the strings in an ArrayList and returns them in format:
//     "[string1, string2, string3]" (String)
//     
//     For getFriends() method, you want a similar return;
//     Except you want the the friend values separated by commas and spaces.

// Don't forget to:
// import java.util.ArrayList
// ArrayList<String> strings = new ArrayList<String>();

import java.util.ArrayList;

/**
 * Person class contains info on person for a social network.
 * It allows you to:
 * Set a Person's name with Person(String name);
 * Add friends to a person's friends list with addFriend();
 * Get (return) the friends a person has with getFriends() method;
 * Unfriend Persons from a Person's friends list
 */
public class Person
{
    private String name;
    private ArrayList<String> friends = new ArrayList<String>();
    private static final String SEPARATOR = ", ";

    /**
     * Sets the Person's name.
     * @param the Persons's name.
     */
    public Person(String name)
    {
       this.name = name;
       //this.friends = "";
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend.name);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        String friendsList = friends.toString();
        return (friendsList.substring(1,(friendsList.length()-1)));
    }

   /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
   public String getFriend(int friendIndex)
   {
       if (friendIndex > friends.size())
       {
           return "";
       }
       else
       {
       return friends.get(friendIndex);
       }   
   }
}
