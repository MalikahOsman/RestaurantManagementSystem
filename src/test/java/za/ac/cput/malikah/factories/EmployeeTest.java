package za.ac.cput.malikah.factories;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.domain.Employee;

/**
 * Created by Malikah Osmen on 2016-04-03.
 */
public class EmployeeTest {
    private EmployeeFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = EmployeeFactoryImpl.getInstance();

    }

    /*@Test
    public void testEmployee() throws Exception {
        Assert.assertEquals(factory.createEmployee(),"");
    }*/

    @Test
    public void testEmployee() throws Exception {
        Employee emp = new Employee.Builder()
                .empNum("0016")
                .empName("Malikah")
                .address("54 Montague Cape Town")
                .telephone("0834781551")
                .build();

        Assert.assertEquals(emp.getEmpNum(), "0016");

        Employee newEmployee = new Employee.Builder()
                .copy(emp)
                .empName("Malikah").build();

        Assert.assertEquals(newEmployee.getEmpNum(), "0016");
        Assert.assertEquals(newEmployee.getEmpame(), "Malikah");
    }
}
