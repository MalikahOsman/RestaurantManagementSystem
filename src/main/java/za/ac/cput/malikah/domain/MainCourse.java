package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-07.
 */
public class MainCourse extends Menu{
    String mainID;
    String foodItem;

    public MainCourse() {
    }

    public MainCourse(String mainID, String foodItem) {
        this.mainID = mainID;
        this.foodItem = foodItem;
    }

    public String getMainID() {
        return mainID;
    }

    public void setMainID(String mainID) {
        this.mainID = mainID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "foodItem='" + foodItem + '\'' +
                ", mainID='" + mainID + '\'' +
                '}';
    }
}
