package design;
import java.util.*;
public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

        EmployeeInfo employee1 = new EmployeeInfo("Mohammad Haque", 101);
		EmployeeInfo employee2 = new EmployeeInfo("Mohammad Rahman", 102);
		employee1.assignDepartment("Developer");
		employee2.assignDepartment("QA");
		employee1.setSalary(100000);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(120000);
		employee2.calculateSalary(employee2.getSalary());
		employee1.setPerformance(5);
		
		EmployeeInfo.calculateEmployeePension((int) employee1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord101 = new ArrayList<Object>();
		employeeRecord101.add(employee1.employeeName());
		employeeRecord101.add(employee1.calculateSalary(employee1.getSalary()));
		

		List<Object> employeeRecord102 = new ArrayList<Object>();
		employeeRecord102.add(employee2.employeeName());
		employeeRecord102.add(employee2.calculateSalary(employee2.getSalary()));
		

		employeeInfo.put(101, employeeRecord101);
		employeeInfo.put(102, employeeRecord102);



	}

}
