package za.ac.cput.malikah.factories;

import za.ac.cput.malikah.domain.*;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class EmployeeChain {
   /* public static String getRole(String value)
    {
        Role chain = setUpChain();
        return chain.handleRequest(value);
    }*/

    public static Employee setUpChain()
    {
        Employee chef = new Chef();
        Employee waiter = new Waiters();
        Employee manager = new RestaurantManager();
        Employee cashier = new POS_Cashier();

        ///chef.set
        return chef;
    }

}
