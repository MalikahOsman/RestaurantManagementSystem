package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class POS_Cashier extends Employee implements Role {
    public String getJobDescription() {
        return "Cashier is responsible for recording all transactions and ensuring accurate stock take";
    }
}
