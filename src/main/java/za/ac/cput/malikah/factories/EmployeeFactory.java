package za.ac.cput.malikah.factories;

import za.ac.cput.malikah.domain.Employee;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public interface EmployeeFactory {
    Employee createEmployee (String empNum, String empName, String address, String telephone );

}
