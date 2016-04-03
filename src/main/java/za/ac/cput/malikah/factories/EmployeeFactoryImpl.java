package za.ac.cput.malikah.factories;

import za.ac.cput.malikah.domain.Employee;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class EmployeeFactoryImpl implements EmployeeFactory{

    private static EmployeeFactoryImpl factory =null;

    private EmployeeFactoryImpl()
    {}

    public static EmployeeFactoryImpl getInstance(){
        if(factory == null)
            factory = new EmployeeFactoryImpl();
        return factory;
    }

    public Employee createEmployee(String empNum, String empName, String address, String telephone) {
        Employee employee = new Employee
                .Builder()
                .empNum(empNum)
                .empName(empName)
                .address(address)
                .telephone(telephone)
                .build();
        return employee;
    }


}
