package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class RestaurantManager extends Employee implements Role  {
    public String getJobDescription() {
        return "Manages the restaurant, makes sure everyone is working an dbusiness is running smoothly";
    }
}
