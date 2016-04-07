package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-07.
 */
public abstract class Menu {
    String menuID;

    public Menu() {
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
}
