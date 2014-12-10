//
//Complete the class TripPlan which describes the cities that are visited
// by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name).
// Have methods to add a city, remove a city,
// to return the names of the cities in a String, 
// and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

//
//For the draft, provide the instance variable and finish the constructor.
//For the toString method simply return the string "TripPlan["
//

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // TODO: add instance variable here
    private ArrayList<String> cities;

    /**
     * Constructs an empty trip (Initiallize instance variable)
     */
    public TripPlan()
    {
        cities = new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        cities.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String formattedTripPlan = "TripPlan[";
        for (int i = 0; i < cities.size(); i++)
        {
            String city = cities.get(i);
            if (i == cities.size()-1)
            {
                formattedTripPlan += city;
            }
            else
            {
                formattedTripPlan += city + ",";
            }
        }
        formattedTripPlan += "]";

        return formattedTripPlan;
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        cities.remove(cities.indexOf(cityName));
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        int i = cities.size()-1;
        ArrayList<String> newCities = new ArrayList<String>();
        while (i >= 0)
        {
            newCities.add(cities.remove(i));
            i--;
        }
        cities = newCities;
    }
}