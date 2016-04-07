package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-07.
 */
public class Starter extends Menu {
    String starterID;
    String foodItem;

    public Starter() {
    }

    public Starter(String starterID, String foodItem) {
        this.starterID = starterID;
        this.foodItem = foodItem;
    }

    public String getStarterID() {
        return starterID;
    }

    public void setStarterID(String starterID) {
        this.starterID = starterID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Starter{" +
                "starterID='" + starterID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
