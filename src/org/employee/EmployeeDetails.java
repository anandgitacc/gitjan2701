package org.employee;

public class EmployeeDetails { // body or block of the class
	
	private void empName() {
		// implementation details or business logic
		// double quotes "" -> String: predefined class
		System.out.println("Employee name Anand");
	}
	
	private void empId() {
		System.out.println("employee id: 1122");
	}
	
	// needed methods
	
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empId();
		
	}
	

}
