package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class Waiters extends Employee implements Role{

    public String getJobDescription() {
        return "Serve designated tables, ensure customers are well taken care of";
    }
}
