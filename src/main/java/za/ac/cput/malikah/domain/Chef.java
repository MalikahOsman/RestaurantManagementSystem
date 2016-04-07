package za.ac.cput.malikah.domain;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class Chef extends Employee implements Role  {
    public String getJobDescription() {
        return "Cooks food from the menu upon request";
    }

    @Override
    public void setNextStep(Employee nextStep) {
        super.setNextStep(nextStep);
    }
}
