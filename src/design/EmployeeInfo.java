package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String employeeDepartment;
	//private String companyName;
	private int dateOfBirth;
	private String position;
	private double salary;
	private int dateOfJoinCompany;



	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}


	public EmployeeInfo() {
	}

	public EmployeeInfo(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public EmployeeInfo(int id, String firstName, String lastName, int dateOfBirth, String position, double salary, int dateOfJoinCompany) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.position = position;
		this.salary = salary;
		this.dateOfJoinCompany = dateOfJoinCompany;

	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDateOfJoinCompany() {
		return dateOfJoinCompany;
	}

	public void setDateOfJoinCompany(int dateOfJoinCompany) {
		this.dateOfJoinCompany = dateOfJoinCompany;
	}

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId) {

	}

	public EmployeeInfo(String name, int employeeId) {

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public  int calculateEmployeeBonus(double yearlySalary, double performance) {
		int total = 0;
		double bonus = 0;
		//double yearlySalary =0;
		double empPerformance = 0;


		if (empPerformance >= 10) {
			bonus = yearlySalary * 0.1;
			System.out.println("You are a good employee");
		}

		if (empPerformance >= 8) {
			bonus = yearlySalary * 0.1;
			System.out.println("You are a good employee");
		} else if (empPerformance == 5) {
			bonus = yearlySalary * 0.08;
			System.out.println("Go, you can do better");
		}

		if (empPerformance >= 3) {
			bonus = yearlySalary * 0.1;
			System.out.println("We expecting more from you");
		}
		if (empPerformance >= 0) {
			bonus = yearlySalary * 0.0;
			System.out.println("No bonus you will need to work more");
		}

		return (int) bonus;

	}

//	public static double calculateBonus(){
//		double bonus=0;
//		double salary =0;
//		int totalNbOfYears= 0;
//
//		if(salary==0){
//			System.out.println("The salary must be higher than $500 ");
//		}else if ((salary > 0) && (salary <= 500)){
//			bonus =  (salary * 7/100);
//			System.out.println("The employee bonus is " + bonus);
//		}
//		else if(salary >2000 ){
//			bonus = salary*5.5/100;
//			System.out.println("The employee bonus is " + bonus);
//		}
//		else if(salary>4000){
//			bonus = salary*4/100;
//			System.out.println("The employee bonus is " + bonus);
//		}
//		return bonus;
//	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension() {
		int empTotalYears = 0;
		double yearSalary = 0;
		double pension = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension

		//Calculating pension for employee more than 10 years with the company


			if (empTotalYears >= 1) {
				pension = yearSalary * 0.05;
				System.out.println("pension is" + pension);
			} else if (empTotalYears >= 2) {
				pension = yearSalary * 0.1;
				System.out.println("pension is" + pension);
			} else if (empTotalYears >= 5) {
				pension = yearSalary * 0.3;
				System.out.println("pension is" + pension);
			} else if (empTotalYears >= 8) {
				pension = yearSalary * 0.5;
				System.out.println("pension is" + pension);
			} else if (empTotalYears >= 10) {
				pension = yearSalary * 0.9;
				System.out.println("pension is" + pension);
			} else if (empTotalYears >= 0) {

				System.out.println("You need at least 1 year to get a pension");
			}
			return pension;
		}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}


	@Override
	public double calculateSalary() {
		return salary;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public int  yearWorked() {
		int totalYear =0;
		dateOfJoinCompany = 0;
		int actualYear =0;
		totalYear = actualYear - dateOfJoinCompany ;

		return totalYear;
	}

	@Override
	public void employeePension() {
		System.out.println(calculateEmployeePension());
	}

	@Override
	public int empVacation() {
		return 0;
	}

//	public void assignDepartment(String operations) {
//	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
