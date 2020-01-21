package design;

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


		//Creating Object Employee Info
		EmployeeInfo empInfo1 = new EmployeeInfo(0010,"Malissa" ,"Maurice");
		EmployeeInfo empInfo2 = new EmployeeInfo(01013,"Jove" ,"Poly");
		EmployeeInfo empInfo3 = new EmployeeInfo(01023,"Gregory" ,"Trina");
		EmployeeInfo empInfo4 = new EmployeeInfo(01045,"vladimir" ,"Andre", 01/03/1999, "Tester", 2000, 04/14/2008 );



		// Calling some methods and variable from EmployeeInfo2
		EmployeeInfo2.doReport();
		EmployeeInfo2.setUShift();
		EmployeeInfo2.firstName = "Billy";
		EmployeeInfo2.lastName = "Melodie";
		System.out.println(EmployeeInfo2.position = "Manager");




		//Display some Employees Info
		System.out.println("This is one of the best Employee of the company" +empInfo4);
		System.out.println("Average Salary Employee"+ empInfo1);
		System.out.println("Good worker" +empInfo3);
		System.out.println("Mentor employee" +empInfo2);

			//Display salary for empInfo4
		double empSal = empInfo4.calculateSalary();
		System.out.println(empSal);

		//empInfo.assignDepartment("Operations");

		double employeePension = empInfo1.calculateEmployeePension();

		System.out.println("Employee pension: " + employeePension);


	}

}
