package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employee6 = new EmployeeInfo("Mr F", 1006);
        employee6.setSalary(10000);
        employee6.setPerformance(4);
        Assert.assertEquals(10000.0,employee6.getSalary());
        Assert.assertEquals(4,employee6.getPerformance());
        Assert.assertEquals(1006,employee6.getEmployeeId());
    }
}
